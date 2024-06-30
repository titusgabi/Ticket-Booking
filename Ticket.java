package TicketBooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ticket{
	Connection con;
	String dburl="jdbc:mysql://localhost:3306/dbconnectivity";
	String dbuser="root";
	String dbpass="titus123";
	//constructor
	public Ticket(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconnectivity","root","titus123");
		System.out.println("DataBase connected");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}


}
