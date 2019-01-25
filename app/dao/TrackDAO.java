package dao;

import entity.Track;
import entity.mapper.TrackMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(TrackMapper.class)
public interface TrackDAO {

    @SqlUpdate("insert into track (id, name) values (:id, :name)")
    void insert(@Bind("id") int id, @Bind("name") String name);

    @SqlQuery("select * from track where id = :id")
    Track  findNameById(@Bind("id") int id);

    @SqlQuery("select * from track order by id")
    List<Track>  find();

    @SqlUpdate("update track set name = :track.name where id = :id")
    void update(@Bind("id") int id, @BindBean("track") Track tract);

    void close();
}
