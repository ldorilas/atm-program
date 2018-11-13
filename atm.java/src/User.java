import java.util.Scanner;

public class User {
	private int pin;
	private int phone;
	private String name;
	private int ssn;
	private String address;
	
	public User (int pin, int phone, String name, int ssn, String address) {
		this.pin = pin;
		this.phone = phone;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}
	
	public int getPin() {
		return pin;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getAddress() {
		return address;
	}
}