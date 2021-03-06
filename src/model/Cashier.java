package model;

public class Cashier {
	
	private ContactInfo contactInfo;
	
	public Cashier(String name, String address, String phone){
		this.contactInfo = new ContactInfo(name, address, phone);
	}

	public Cashier(ContactInfo contact) {
		this.contactInfo = contact;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}
