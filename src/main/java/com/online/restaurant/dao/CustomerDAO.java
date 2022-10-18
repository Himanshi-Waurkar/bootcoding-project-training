package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "customer";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Himanshi@07");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("Name = " + rs.getString("name"));
                System.out.println("Address = " + rs.getString("address"));
                System.out.println("PhoneNumber = " + rs.getString("phone_number"));
                System.out.println("City = " + rs.getString("city"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void createTable() {
    }
}