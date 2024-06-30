package TicketBooking;


import java.sql.SQLException;
import java.util.Scanner;

public class PayMethod {
	public static void main(String[] args) throws SQLException {
	    Booking b = new Booking();
	    cancellation c = new cancellation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username:");
		String username = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();
		String Username ="root";
	    String Password = "titus123";
	    if(username.equals(Username)&&password.equals(Password)) {
	    	System.out.println("Access Confirmed!");
	    	while(true) {
	    	System.out.println("Choose the data");
	    	System.out.println("1.Payment Data \n2.Cancellation Data \n3.Exit All");
	    	int ct = sc.nextInt();
	    	if(ct ==1) {
	    		while(true) {
	    			System.out.println("Welcome to Payment data ");
	    			System.out.println("Choose the options");
	    			System.out.println("1.Enter the details\n2.View the data \n3.Update the data \n4.Search the data \n5.exit");
	    		    int cb = sc.nextInt(); 
	    		    if(cb==1) {
						System.out.println("Enter the BookingID");
						int BookingID=sc.nextInt();
						System.out.println("Enter the PaymentID");
						String PaymentID=sc.next();
						System.out.println("Enter the Amount");
						int Amount=sc.nextInt();
						System.out.println("Enter the PaymentDate");
						String paymentDate=sc.next();
						int q=b.insert(BookingID,PaymentID,Amount,paymentDate);
						String res=(q>0)?"Added to DB":"Not Added";
						System.out.println(res);
					}
					if(cb==2) {
						System.out.println("BOOKING_ID\tPAYMENT_ID\tAMOUNT\tPAYMENT_DATE");
						b.view();
					}
					if(cb==3) {
						System.out.println("Enter the Booking ID to be update Payment Date");
						int BookingID=sc.nextInt();
						System.out.println("Update PaymentDate ");
						String  paymentDate=sc.next();
						int q=b.update(BookingID,paymentDate);
						System.out.println((q>0)?"Updated":"Not Updated");
					}
					
					if(cb==4) {
						System.out.println("Enter  the Booking ID to search Payment data");
						int BookingID=sc.nextInt();
						b.search(BookingID);

					}
					else if(cb==5) {
						System.out.println("Operation terminated");

						break;
					}

	    		
	    		
	    		}
	    	}
	    	if(ct==2) {
	    		while (true) {
	    			System.out.println("Welcome to the cancellation data");
	    			System.out.println("Choose the option");
	    			System.out.println("1.Enter the details\n2.View the data \n3.Update the data \n4.Delete \n5.Search the data \n6.Exit");
	    			int cc = sc.nextInt();
	    			if(cc==1) {
						System.out.println("Enter the Booking ID");
						int BookingID=sc.nextInt();
						System.out.println("Enter the Cancellation ID");
						String CancellationID=sc.next();
						System.out.println("Enter the Refund Amount");
						int RefundAmount=sc.nextInt();
						System.out.println("Enter the Cancellation Date");
						String CancellationDate=sc.next();
						int r=c.insert(BookingID,CancellationID,RefundAmount,CancellationDate);
						String res=(r>0)?"Added to DB":"Not Added";
						System.out.println(res);
					}
					if(cc==2) {
						System.out.println("BOOKING_ID\tCancellation_ID\tAMOUNT\tCancellation_DATE");
						c.view();
					}
					if(cc==3) {
						System.out.println("Enter the Booking ID to be update Cancellation Date");
						int BookingID=sc.nextInt();
						System.out.println("Cancellation Payment Date ");
						String CancellationDate=sc.next();
						int r=c.update (BookingID,CancellationDate);
						System.out.println((r>0)?"Updated":"Not Updated");
					}
					if(cc==4) {
						System.out.println("Enter the Booking ID to be deleted");
						int BookingID=sc.nextInt();
						int r=c.delete(BookingID);
						System.out.println((r>0)?"Deleted":"Not Deleted");

					}
					if(cc==5) {
						System.out.println("Enter  the Booking ID to search Cancellation data");
						int BookingID=sc.nextInt();
						c.search(BookingID);
					}
					else if(cc==6) {
						System.out.println("Operation terminated");

						break;
					}
					} 

	    			
	    		}
	    	if(ct==3) {
	    		System.out.println("Thank you ");
	    		break;
	    	}
	    	}
	    }
	    
	    else {
	    	System.out.println("Access Denied!");
	    }
	
	}
	}

