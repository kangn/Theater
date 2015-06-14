package src;

public abstract class TheaterPatron {
	private String id;
	private String name;
	private String address;
	private String phoneNumber;
	
	public TheaterPatron(String name, String address, String phoneNumber){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.id = generateID();
	}
	
	public String getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setName(String name){
		this.name = name;		
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String generateID(){
		String id;
		//generate a uniqueID
		return id;
	}
	
}
