package dbms_prj;

import java.sql.*;

public class Connect {
    public Connection connection() throws SQLException {
        Connection con;
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "illuminati");
        return con;
    }
}
