package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {

	// Inside class:    
    private ArrayList<String> patientNotes;
	
    // Constructor that takes an ID
    public Physician(int id) {
		super(id);
	}
    //Implement HIPAACompliantUser!
    /*
     * Pin must be exactly 4 digits, returns false if not.
	 * Expected to assign the pin to the user (as a member variable)
     */
	@Override
	public boolean assignPin(int pin) {
		int pinLength = String.valueOf(pin).length();
		if (pinLength != 4) {
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
		return false;
		}
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

}
