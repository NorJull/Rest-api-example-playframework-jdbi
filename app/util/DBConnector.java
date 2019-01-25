package util;

import org.skife.jdbi.v2.DBI;

public class DBConnector {

    private final String URL = "jdbc:postgresql://localhost:5433/postgres";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "12345678";

    public DBI getDBI(){
       // JdbcConnectionPool connectionPool = JdbcConnectionPool.create(URL,USERNAME,PASSWORD);
       // return new DBI(connectionPool);

        return new DBI(URL,USERNAME,PASSWORD);
    }
}
