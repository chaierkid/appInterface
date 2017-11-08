/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dyjs.service.impl;

import javax.annotation.Resource;

import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.dyjs.service.MqttService;



/**
 * 设备信息Service
 * @author ldd
 * @version 2016-07-21
 */
@Service("mqttService")
public class MqttServiceImpl implements MqttService   {

	@Resource(name="mqtt")     
	private MqttPahoMessageHandler mqtt;

	@Override
	public void sendMessage(String content, String topic, int qos) {
		Message<String> message = MessageBuilder.withPayload("==========1111111111111111111111111=========").setHeader(MqttHeaders.TOPIC, topic).build();  
        mqtt.handleMessage(message);  
        System.out.println("成功");  
	}


//	public void EquipmentController(Equipment equipment, JSONArray content) {
//		sendMessage("{9:" + content.toString() + "}", "c/c/" + equipment.getEquipmentNo(), 0);		
//		
//	}


	
}