package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection= null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amitdemo","root","Amit@123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            Statement statement=connection.createStatement();

            Statement statement1=connection.createStatement();

//            String insert="insert into employee(id,name,address) values(2,'Ramesh','Mumbai')";

//            String update="update employee set name='Ramesh' where id =2";

            String delete="delete from employee where id=2";

            int count=statement1.executeUpdate(delete);
            System.out.println(count+" row deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
