package com.k15t.pat.registration.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Register {
	
	@FormParam("name")
	private String name;
	
	@FormParam("password") 
	private String password;
	
	@FormParam("address") 
	private String address;
	
	@FormParam("email") 
	private String email;
	
	@FormParam("telNumber") 
	private String telNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "Name :" + name + "<br/> Address :" + address + "<br/> Email :" + email
				+ "<br/> Phone Number :" + telNumber;
	}
}
