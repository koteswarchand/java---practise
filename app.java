package com.example;

import java.sql.*;
import java.util.*;

public class App 
{

    private  static String url = "jdbc:mysql://localhost/capg";
    private  static String user = "root";
    private static String pass = "root";

    public static void menu(Connection con) throws SQLException{

        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        

        while (true) {
            System.out.println("choice ");
            System.out.println("add a anime ");
            System.out.println("delete an anime ");
            System.out.println("Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                System.out.println("enter the anime name, anime author,anime release year");
                String name = s.nextLine();
                String author = s2.nextLine();
                int year = 1999;
                PreparedStatement ps = con.prepareStatement("insert into Anime values(?,?,?)");
                ps.setString(1, name);
                ps.setString(2, author);
                ps.setInt(3, year);
                ps.execute();
                    break;

                case 2:
                System.out.println("enter the aname you want to delete ");
                //2String aname = s.nextLine();
                Statement s1 = con.createStatement();
                s1.execute("delete from Anime where author = 'naruto'");
               
                    break;

                case 3:
                 System.exit(0);
                 s.close();
                default:
                System.out.println("choose wisely!");
                    break;
            }
        }


    }
    public static void main( String[] args ) throws SQLException
    {
        Connection con = DriverManager.getConnection(url, user, pass);
        //ResultSet rs = con.createStatement().executeQuery("create table participants(id int, name varchar(20))");
        menu(con);
       
           
    }
}
