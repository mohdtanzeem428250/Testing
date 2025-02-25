import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
public class create_database 
{
    public static void main(String[] args)
    {
        try
        {
            String url="jdbc:mysql://localhost:3306";
            String database_Name="computer";
            String password="tanzeem";
            Connection connection=DriverManager.getConnection(url,database_Name,password);
            String sql="CREATE DATABASE"+database_Name;
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Congratulation Database Are Create");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
