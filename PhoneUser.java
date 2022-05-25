
public class PhoneUser {
	
	private Phone phone;

	public PhoneUser(Phone phone) {
		// TODO Auto-generated constructor stub
		this.phone = phone;
	}
	
	void turnOnThePhone() {
		this.phone.powerOn();
	}
	
	void turnOffThePhone() {
		this.phone.powerOff();
	}
	
	void makePhoneLouder() {
		this.phone.volumeUp();
	}
	
	void makePhoneSilent() {
		this.phone.volumeDown();
	}

}
