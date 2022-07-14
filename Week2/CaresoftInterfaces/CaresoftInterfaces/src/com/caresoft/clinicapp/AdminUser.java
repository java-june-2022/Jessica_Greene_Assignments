package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

    private String role;
    private ArrayList<String> securityIncidents;
    

	// Implement a constructor that takes an ID and a role
	public AdminUser(int id, String role) {
		super(id);
		this.setRole(role);
		securityIncidents = new ArrayList<String>(); 
	}
	
    // Implement HIPAACompliantUser!
	/*
	 * Pin must be 6 digits or more; returns false if not
	 * Expected to assign the pin to the user (as a member variable)
	 */
	@Override
	public boolean assignPin(int pin) {
		int pinLength = String.valueOf(pin).length();
		if (pinLength != 6) {
			return false;
		} else {
			this.setPin(pin);
			return true;
		}
	}
	/*
	 * Compares the ids, and if they are not a match,
	 * creates an incident report using the  authIncident method,
	 * Returns true if ids match, false if not.
	 */
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.getId() == confirmedAuthID) {
			return true;
		} else {
			this.authIncident();
		return false;
		}
	}
	
    // Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.getSecurityIncidents();
	}

    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // Setters & Getters
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
}
