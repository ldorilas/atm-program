public class User {
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
	
	public int getPin() {
	    return pin;
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
	    this.pin = pin;
	}
	
	public int setPhone() {
	    this.phone = phone;
	}
	
	public String setName() {
	    this.name = name;
	}
	
	public String setBirthdate() {
	    this.birthdate = birthdate;
	}
	
	public int setSsn() {
	    this.ssn = ssn;
	}
	
	public String setAddress() {
	    this.address = address;
	}
}
