package service;

import dao.TrackDAO;
import entity.Track;
import org.skife.jdbi.v2.DBI;
import play.libs.concurrent.HttpExecutionContext;
import util.DBConnector;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TrackService {


    private final HttpExecutionContext ec;
    private final DBConnector dbConnector;

    @Inject
    public TrackService(HttpExecutionContext ec, DBConnector dbConnector) {

        this.ec = ec;
        this.dbConnector = dbConnector;
    }

    public CompletionStage<Stream<Track>> getTracks() {

        return supplyAsync(() -> {
            DBI dbi = dbConnector.getDBI();
            TrackDAO trackDAO = dbi.open(TrackDAO.class);
            List<Track> tracks = trackDAO.find();
            return tracks.stream();
        });
    }

    public CompletionStage<Track> addTrack(Track track) {

        return supplyAsync(() -> {
            DBI dbi = dbConnector.getDBI();
            TrackDAO trackDAO = dbi.open(TrackDAO.class);
            trackDAO.insert(track.getId(), track.getName());
            trackDAO.close();
            return track;
        });
    }

    public CompletionStage<Optional<Track>> updateTrack(String id, Track track) {
        return supplyAsync(() -> {
            DBI dbi = dbConnector.getDBI();
            TrackDAO trackDAO = dbi.open(TrackDAO.class);
            trackDAO.update(Integer.parseInt(id), track);
            final Track oTrack = trackDAO.findNameById(Integer.parseInt(id));
            return Optional.of(oTrack);
        });
    }

    public CompletionStage<Optional<Track>> getTrack(String id) {


        return supplyAsync(() -> {
            DBI dbi = dbConnector.getDBI();
            TrackDAO trackDAO = dbi.open(TrackDAO.class);
            Track track = trackDAO.findNameById(Integer.parseInt(id));
            return Optional.of(track);
        });
    }


}
