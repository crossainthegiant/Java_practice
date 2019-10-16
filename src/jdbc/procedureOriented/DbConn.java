package jdbc.procedureOriented;

import java.sql.*;

/*
 * @Author: qph
 * @Date: 2019/10/15 14:32
 * @description: jdbc.procedureOriented面向过程的jdbc对数据库进行操作，包括数据库的连接和查询
 */
public class DbConn {

    public final static String USER = "root";
    public final static String PASSWORD = "19920124";
    public final static String URL = "jdbc:mysql://localhost:3306/userInfo";

    public static void main(String[] args) throws Exception {

        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库连接
        Connection cnn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = cnn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT userName, passWord FROM userInfo");
        while (rs.next()) {
            System.out.println(rs.getString("userName") + rs.getInt("passWord"));
        }


    }
}
