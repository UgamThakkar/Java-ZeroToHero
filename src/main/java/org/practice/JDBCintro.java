package org.practice;

import java.sql.*;
import java.util.Scanner;

public class JDBCintro {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Java has defined the interfaces and corresponding abstract methods require to connect to different dbs.
        //These methods' implementation is provided by different vendors in terms of JAR files. In order to connect to a particular db we have to download the
        //JAR file of that db configure it and Load and Register the Driver.

        //This is a demo of how we can connect to a potential SQL DB.
        //For demo, we are going to duck all the exceptions. However, In practice it's recommended to handle them with try catch blocks.

        //Class.forname loads the implementing class from the driver/db vendor. THis class is used to establish connection with db.
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establishing connection with db:
        String url="Some url where our db is sitting";
        String user = "Username for our db for instance : root";
        String password = "Password: root@123";

        //now this drivermanager.getconnection gives us the connection object which we can store in its Parent Interface.
        Connection connect = DriverManager.getConnection(url, user, password);

        //Creating a statement. Statement is important as all the tasks/communication with the database happens with help of a statement.
        //Now there are two ways of communicating with the database. One is using CreateStatement() and another is using PreparedStatement();
        Statement statement = connect.createStatement();

        //whenever we perform any "Non-Select" type of queries for instance: Update, Delete, Insert then we have to use ExecuteUpdate() to achieve our task.
        String sql = "INSERT INTO StudentInfo(id, sname, sage, city) VALUES (1, 'David', 24, 'Toronto)";

        //executeUpdate returns us the number of rows affected. Then we can place checks on it to make sure that the database was successfully updated.
        int rowsAffected = statement.executeUpdate(sql);

        //if for any case we want the resultSet to be returned from the database then we can use executeQuery() instead of executeUpdate().
        String sql2 = "SELECT * from StudentInfo";
        ResultSet rs = statement.executeQuery(sql2); //then we can loop through the resultset received and print the data if needed.

        //we can also use "execute()" in place of both executeUpdate() and executeQuery().
        //execute() returns a boolean -> (true) for SELECT queries and (false) for Insert/Update/Delete Queries.

//        ------------------------------------------------------------------------------------------------------------------>
        //PreparedStatement()
        //the problem with CreateStatement() is that we have to pass the values to be inserted/updated/deleted in the query itself and that might not always be the case
        //In order to dynamically manipulate the db based on User input values we have to use PreparedStatement()
        String query = "INSERT INTO StudentInfo(id, sname, sage, city) VALUES(?,?,?,?)";
        PreparedStatement ps = connect.prepareStatement(query);

        //User Input
        System.out.println("Enter the values to be inserted into the columns - id  StudentName  StudentAge  City" );
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.next();
        int age = scan.nextInt();
        String city = scan.next();

        //after getting these values we have to set them into the query
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4, city);


        //after achieving the task we wanted to achieve by talking to the db, we have to close the connection.
        //we write this closing connection code in the finally block so that no matter what the connection is closed even in the case of an Exception.
        finally{
            statement.close();
            connect.close();
        }

    }
}
