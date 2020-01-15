package org.kush.javabrains.massenger.model;

import java.util.HashMap;

public class JSONBUILDER {

	String authName;
	HashMap<String, Auth> authConfig;
	
	public JSONBUILDER(String authName, HashMap<String, Auth> authConfig) {
		
		this.authName = authName;
		this.authConfig = authConfig;
	}
	
	

}
