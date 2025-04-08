package com.mst.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerImpl {
	
	@KafkaListener(topics = "MstTopic" , groupId = "groupId")
	public void listen(String message)
	{
		System.out.println("message recieved :"+ message+" from MstTopic Dawood is here!! !!");
	}

}
