import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class Theater {
	private String name;
	private int seatCapacity;
	private ArrayList<Client> clients; //depends on the list discussion. should be changed to correction collection class
	private ArrayList<Member> members;
	
	public Theater(){
		//singleton
	}
	
	public Client addClient(String name, String address, String phoneNumber){
		Client client = new Client(name, address, phoneNumber);
		return client;
	}
	
	public boolean removeClient(String id){
		if(id=="true"){
			//find client by id and remove from clients
			return true;
		}
		else{
			return false;
		}
	}
	
	public Iterator<Client> listClients(){
		return clients.iterator();
	}
	
	public Member addMember(String name, String address, String phone, String creditCardNumber, Date expiration){
		Member customer = new Member(name, address, phone, creditCardNumber, expiration);
		return customer;
	}
	
	public boolean removeMember(String id){
			//remove member
		return true;
	}
	
	public Iterator<Member> listMembers(){
		return members.iterator();
	}
	
	public CreditCard addCreditCard(String id, String creditCardNumber, Date expiration){
		//search for member by id
		CreditCard card = new CreditCard(creditCardNumber, expiration);
		return card;
	}
	
	public boolean removeCreditCard(String creditCardNumber){
		//remove member
	return true;
	}
	
	public Show addShow(String clientID, String name, Date startDate, Date endDate){
		return new Show(name, startDate, endDate);
	}
	
	public Iterator<Show> listShows(){
		return clients.iterator().next().getShows(); //obviously REALLY BAD code. Thankfully just temporary.
	}
	
	public boolean save(){
		return true;
	}
	
	public static Theater load(){
		return null;		
	}
	
	private void readObject(ObjectInputStream input){
		
	}

}
