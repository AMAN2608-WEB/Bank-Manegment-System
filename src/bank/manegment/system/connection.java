package bank.manegment.sytem;


import java.sql.*;

public class con {

    Connection connection;
    Statement statement;
    public con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root", "amantyagi2608");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
