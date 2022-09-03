package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("select * from people");

            while (resultSet.next()){
                System.out.print(resultSet.getInt("id") + " ");
                System.out.println(resultSet.getString("firstName"));

            }



        } catch (Exception e){
            e.printStackTrace();
        }






    }
}
