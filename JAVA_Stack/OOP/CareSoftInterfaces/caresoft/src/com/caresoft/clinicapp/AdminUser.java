package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a rol
    public AdminUser(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = getRole();
    } 
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin){
        if(pin>100000){
            this.pin=pin;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean accessAuthorized(Integer confirmedAuthID){
        if (this.employeeID == confirmedAuthID) {
            return true;
        }
        else{
            authIncident();
            return false;
        }
    }
    // TO DO: Implement HIPAACompliantAdmin!
        public ArrayList<String> reportSecurityIncidents(){
            return securityIncidents;
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
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    // TO DO: Setters & Getters
    
}
