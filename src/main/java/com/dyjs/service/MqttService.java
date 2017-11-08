package com.dyjs.service;

public interface MqttService {
	/**
	 * mqtt发送消息
	 * @author Dyan
	 * @param content
	 * @param topic
	 * @param qos
	 */
	public void sendMessage(String content, String topic, int qos);
}
