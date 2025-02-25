 import java.sql.*;
 class Connectivity_Database
 {
    Connection connection;
    Statement statement;
    Connectivity_Database()
    {
        try
        {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","tanzeem");
            statement=connection.createStatement();
        }
        catch(Exception object)
        {
            object.printStackTrace();
        }
    }
 }