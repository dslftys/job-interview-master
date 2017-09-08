package com.job.concept.框架.Spring.事务;

import java.sql.*;

/**
 * Created by Victor on 2017/3/28.
 */
public class JDBC {
    private static String className = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/camp";
    private static String user = "root";
    private static String password = "123456";

    private static Connection con = null;
    private static Statement st  = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;

    public static void main(String args[]){
        insert_UsingStatement("update t_staff set name = '789'");
    }

    public static void insert_UsingStatement(String sql)
    {

        try {
//          1.加载驱动类
            Class.forName(className);

//          2.创建连接对象
            con = (Connection) DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

//          3.创建Statement对象
            st = (Statement) con.createStatement();

//          4.执行sql语句
            int flag = st.executeUpdate(sql);

            if(flag > 0) System.out.println("insert success!");
            else System.out.println("insert fail!");

            con.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{

//          5.关闭连接对象
            try {
                if(st != null)
                    st.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
