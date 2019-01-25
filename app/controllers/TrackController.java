package controllers;

import static play.mvc.Controller.request;
import static play.mvc.Results.ok;
import static play.mvc.Results.notFound;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Http.*;
import entity.Track;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.Results;
import service.TrackService;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

public class TrackController {

    private HttpExecutionContext ec;

    private TrackService trackService;

    @Inject
    public TrackController(HttpExecutionContext ec, TrackService trackService) {
        this.ec = ec;
        this.trackService = trackService;
    }

    public CompletionStage<Result> getTracks() {
        return trackService.getTracks().thenApplyAsync(tracks -> {
            final List<Track> trackList = tracks.collect(Collectors.toList());
            return Results.ok(Json.toJson(trackList));
        }, ec.current());
    }

    public CompletionStage<Result> addTrack() {

        RequestBody requestBody = request().body();
        JsonNode json = requestBody.asJson();
        final Track track = Json.fromJson(json, Track.class);

        return trackService.addTrack(track).thenApplyAsync(
                trackResult -> Results.created(Json.toJson(trackResult)),
                ec.current());
    }

    public CompletionStage<Result> updateTrack(String id) {
        RequestBody requestBody = request().body();
        JsonNode json = requestBody.asJson();
        final Track track = Json.fromJson(json, Track.class);

        return trackService.updateTrack(id, track).thenApplyAsync(optionalTrack -> {

            return optionalTrack.map(t -> ok(Json.toJson(t)))
                    .orElseGet(
                            () -> notFound());

        }, ec.current());

    }

    public CompletionStage<Result> getTrack(String id) {

        return trackService.getTrack(id).thenApplyAsync(track -> {
            return track.map(x -> ok(Json.toJson(x))).orElseGet(() ->
                    notFound()
            );

        }, ec.current());
    }

}
