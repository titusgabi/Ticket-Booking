package TicketBooking;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Booking extends Ticket{
	//insert
	int insert(int BookingID,String PaymentID,int Amount,String paymentDate) throws SQLException{
		String q="insert into payment values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1,BookingID);
		pst.setString(2,PaymentID);
		pst.setInt(3,Amount);
		pst.setString(4,paymentDate);
		int res=pst.executeUpdate();
		return res;
	}
	//view
	void view() throws SQLException {
		String q="select * from payment";
		PreparedStatement pst=con.prepareStatement(q);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			int BookingID=rs.getInt(1);
			String PaymentID=rs.getString(2);
			int Amount=rs.getInt(3);
			String paymentDate=rs.getString(4);
			System.out.println(BookingID+"\t"+PaymentID+"\t"+Amount+"\t"+paymentDate);
		}
	}
	//update
	int update(int BookingID,String paymentDate) throws SQLException {
		String q="update payment set paymentDate=? where BookingID=?";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(2,BookingID);
		pst.setString(1,paymentDate);
		int res=pst.executeUpdate();	
		return res;
	}
	

	//search
	void search(int BookingID) throws SQLException {
		String q="select * from payment where BookingID=?";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1,BookingID);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			int bc=rs.getInt(1);
			String PaymentID =rs.getString(2);
			int Amount=rs.getInt(3);
			String PaymentDate=rs.getString(4);
			System.out.println(bc+"\t"+PaymentID+"\t"+Amount+"\t"+PaymentDate);
		}
	}
	
	
}
