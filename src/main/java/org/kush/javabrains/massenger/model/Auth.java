package org.kush.javabrains.massenger.model;

public class Auth {

	String secret;
    String issuer;
    String validFor;
    int refreshLimit;
    
    public Auth() {
    	
    }
    
	public Auth(String secret, String issuer, String validFor, int refreshLimit) {
	
		this.secret = secret;
		this.issuer = issuer;
		this.validFor = validFor;
		this.refreshLimit = refreshLimit;
	}
    
    
    
	
}
