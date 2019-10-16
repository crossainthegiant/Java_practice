package jdbc.ObjectOriented;

import java.sql.*;

/*
 * @Author: qph
 * @Date: 2019/10/16 18:04
 * @description: jdbc.ObjectOriented
 */
public class JDBCTool {
    public String DriverClass = "com.mysql.jdbc.Driver";
    public String URL = "jdbc:mysql://localhost:3306/userInfo";
    public String dbName = "root";
    public String dbPD = "19920124";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public JDBCTool() {
        CreateConnection();
    }

    private void CreateConnection() {
        try {
            //加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //获得数据库连接
            Connection cnn = DriverManager.getConnection(URL, dbName, dbPD);
            Statement stmt = cnn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean execute(String sql) {
        try {
            return stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
