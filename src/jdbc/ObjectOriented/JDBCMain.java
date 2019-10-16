package jdbc.ObjectOriented;

import java.sql.*;


/*
 * @Author: qph
 * @Date: 2019/10/16 18:35
 * @description: jdbc.ObjectOriented
 */
public class JDBCMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            run();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void run() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //获得数据库连接
            String URL = "jdbc:mysql://localhost:3306/userInfo";
            Connection cnn = DriverManager.getConnection(URL, "root", "19920124");
            stmt = cnn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM userinfo");

            while (rs.next()) {
                String name = rs.getString("userName");
                String pass = rs.getString("passWord");
                System.out.println(name + "  " + pass);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
    }
}
