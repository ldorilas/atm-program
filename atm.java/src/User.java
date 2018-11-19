import java.util.Scanner;
public class User {
	Scanner in = new Scanner(System.in);
	private int pin;
	private int phone;
	private String name;
	private String birthdate;
	private int ssn;
	private String address;
	
	public User (int pin, int phone, String name, String birthdate, int ssn, String address) {
	    this.pin = pin;
	    this.phone = phone;
	    this.name = name;
	    this.birthdate = birthdate;
	    this.ssn = ssn;
	    this.address = address;
	}
	
	public int getPhone() {
	    return phone;
	}
	
	public String getName() {
	    return name;
	}
	
	public String getBirthdate() {
	    return birthdate;
	}
	
	public int getSsn() {
	    return ssn;
	}
	
	public String getAddress() {
	    return address;
	}
	
	public int setPin() {
	    System.out.println("Enter pin: ");
	    pin = in.nextInt();
	    while (Integer.toString(pin).length() == 4) {
	    	if (Integer.toString(pin).length() != 4) {
	    		System.out.println("Pin must be 4 digits.");
	    	}
	    	else if (Integer.toString(pin).length() == 0) {
		    	System.out.println("Enter a pin number.");
		    }
	    }
	    return pin;
	}
	
	public void setPhone() {
	    this.phone = phone;
	}
	
	public void setName() {
		System.out.println("Enter name: ");
		name = in.nextLine();
	}
	
	public void setBirthdate() {
	    this.birthdate = birthdate;
	}
	
	public void setSsn() {
	    this.ssn = ssn;
	}
	
	public void setAddress() {
	    this.address = address;
	}
}
