package entity.mapper;

import entity.Track;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrackMapper implements ResultSetMapper<Track> {

    public Track map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Track(r.getInt("id"),r.getString("name"));

    }
}
