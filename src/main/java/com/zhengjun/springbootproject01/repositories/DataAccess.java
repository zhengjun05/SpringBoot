package com.zhengjun.springbootproject01.repositories;

import java.sql.*;

public class DataAccess {
    static Connection conn;

    static {
        try {
            conn = getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
        String user = "root";
        String password = "root";
        Connection conn=DriverManager.getConnection(url,user,password);
        return conn;


    }
    public static void insertPerson(){

    }

    public static void queryAllPersons() throws SQLException, ClassNotFoundException {

        String sql="select * from mysql.zj_test;";
        Statement sta=conn.createStatement();
        ResultSet res=sta.executeQuery(sql);
        while (res.next()){
            System.out.println(String.format("id的值为%d:",res.getInt("id")));
            System.out.println(String.format("名称为%s",res.getString("name")));
        }

    }

    public static void queryPersonById(int id) throws SQLException {
        String sql="select * from mysql.zj_test where id=?;";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet res=preparedStatement.executeQuery();
        while (res.next()){
            System.out.println(String.format("id值为%d,对应的用户名为%s",id,res.getString("name")));
        }

    }

}
