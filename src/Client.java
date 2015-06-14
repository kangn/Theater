import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by Nathan on 6/12/2015.
 */
public class Client extends TheaterPatron{
	private double balance;
	private ArrayList<Show> shows;
	
	public Client(String name, String address, String phoneNumber) {
		super(name, address, phoneNumber);
		this.balance = 0.00;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Iterator<Show> getShows(){
		return shows.iterator();
	}
	
	public void addShow(Show show){
		shows.add(show); 
		/*
		 * The addShow method in Theater should be the method that searches all of the clients and does the date
		 * checking. When it's sure there are no date overlaps, it can call the client.addshow method.
		 */
	}
	
	public boolean hasDate(Date date){
		Iterator iterator = this.getShows();
		// search through shows for the given date;
		return true;
	}
	
}
