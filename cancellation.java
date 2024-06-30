package TicketBooking;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cancellation extends Ticket {
	//insert
	int insert(int BookingID,String CancellationID,int RefundAmount,String cancellationDate) throws SQLException{
		String r="insert into cancellation values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(r);
		pst.setInt(1,BookingID);
		pst.setString(2,CancellationID);
		pst.setInt(3,RefundAmount);
		pst.setString(4,cancellationDate);
		int res=pst.executeUpdate();
		return res;
	}
	//view
	void view() throws SQLException {
		String r="select * from cancellation";
		PreparedStatement pst=con.prepareStatement(r);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			int BookingID=rs.getInt(1);
			String CancellationID=rs.getString(2);
			int RefundAmount=rs.getInt(3);
			String cancellationDate=rs.getString(4);
			System.out.println(BookingID+"\t"+CancellationID+"\t"+RefundAmount+"\t"+cancellationDate);
		}
	}
	//update
	int update(int BookingID,String cancellationDate) throws SQLException {
		String r="update cancellation set cancellationDate=? where BookingID=?";
		PreparedStatement pst=con.prepareStatement(r);
		pst.setInt(2,BookingID);
		pst.setString(1,cancellationDate);
		int res=pst.executeUpdate();	
		return res;
	}
	//delete
		int delete(int BookingID) throws SQLException {
			String r="delete from cancellation where BookingID=?";
			PreparedStatement pst=con.prepareStatement(r);
			pst.setInt(1,BookingID);
			int res=pst.executeUpdate();	
			return res;
		}
	

	//search
	void search(int BookingID) throws SQLException {
		String r="select * from cancellation where BookingID=?";
		PreparedStatement pst=con.prepareStatement(r);
		pst.setInt(1,BookingID);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			int cs=rs.getInt(1);
			String CancellationID =rs.getString(2);
			int RefundAmount=rs.getInt(3);
			String CancellationDate=rs.getString(4);
			System.out.println(BookingID+"\t"+cs+"\t"+RefundAmount+"\t"+CancellationDate);
		}
	}

	
}
