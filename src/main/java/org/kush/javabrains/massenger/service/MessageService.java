package org.kush.javabrains.massenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.kush.javabrains.massenger.model.Auth;
import org.kush.javabrains.massenger.model.JSONBUILDER;
import org.kush.javabrains.massenger.model.Message;

import com.google.gson.Gson;

public class MessageService {
	
	
	public List<Message> getAllMassages(){
		
		Message msg1 = new Message(1, "Hello ji", "Kush");
		Message msg2 = new Message(1, "Skellam ji", "Lav");
		Message msg3 = new Message(1, "Restart", "Kush");
		
		List<Message> msgList = new ArrayList<>();
		
		msgList.add(msg1);
		msgList.add(msg2);
		msgList.add(msg3);
		
		return msgList;
	}
	
	
	public JSONBUILDER getAuthConfig(){
		
		HashMap<String, Auth> map = new HashMap<>();
		
		map.put("american_home_shield#-#reviews1", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews2", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews3", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews4", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews5", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews6", new Auth("lexcore-dev", "skellam", "3600l", 10));
		map.put("american_home_shield#-#reviews7", new Auth("lexcore-dev", "skellam", "3600l", 10));

		return new JSONBUILDER("skellam", map);
		
	}
	
	
////	public static void main(String[] args) {
//		
//		MessageService msgServ = new MessageService();
//		Gson gson = new Gson();
//		String json = gson.toJson(msgServ.getAuthConfig());
//		
////		return Response.status(202).entity(json).build();
//	
//		System.out.println(json);
//	}

}
