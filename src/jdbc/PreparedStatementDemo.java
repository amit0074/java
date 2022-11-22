package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {



     Class.forName("com.mysql.cj.jdbc.Driver");

    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/amitdemo","root","Amit@123");

        Scanner scanner=new Scanner(System.in);
        int id;
        int age;
        String name;
        String address;

        System.out.println("Enter values of id name age and address ");
        id=scanner.nextInt();

        name=scanner.next();
        age= scanner.nextInt();
        address=scanner.next();


//        String insert="insert into employee(id,name,address) values(? ,? ,? )";

        String update="update employee set name=?,address=?,age=? where id =?";

        PreparedStatement preparedStatement=connection.prepareStatement(update);


        preparedStatement.setString(1,name);

        preparedStatement.setString(2,address);
        preparedStatement.setInt(3,age);
        preparedStatement.setInt(4,id);


        int count=preparedStatement.executeUpdate();
        System.out.println(count+ " row Updated");


    }
}
