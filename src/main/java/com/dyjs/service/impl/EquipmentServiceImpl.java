package com.dyjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dyjs.dao.DyEquipmentAttrConfigDao;
import com.dyjs.dao.DyEquipmentDao;
import com.dyjs.dao.DyEquipmentTypeAttrDao;
import com.dyjs.entity.DyEquipment;
import com.dyjs.entity.DyEquipmentAttrConfig;
import com.dyjs.entity.DyEquipmentTypeAttr;
import com.dyjs.service.EquipmentService;
import com.dyjs.service.MqttService;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {
	@Resource
	private DyEquipmentDao equipmentDao;
	
	@Resource
	private DyEquipmentTypeAttrDao equipmentTypeAttrDao;
	
	@Resource
	private DyEquipmentAttrConfigDao equipmentAttrConfigDao;
	
	@Autowired
	private MqttService mqttService;
	
	@Override
	public List<DyEquipment> selectEquipmentsByPage() {
		return equipmentDao.selectEquipmentsByPage();
	}
	
	@Override
	public List<DyEquipmentTypeAttr> getAttrByEquipmentID(String id) {
		return  equipmentTypeAttrDao.getAttrByEquipmentTypeID(id);

	}
	
	@Override
	@Transactional
	public String updateEquipmentAttr(List<DyEquipmentAttrConfig> list) {
		for(DyEquipmentAttrConfig equipmentAttrConfig:list) {
			int updateCount = equipmentAttrConfigDao.updateConfig(equipmentAttrConfig);
			if(updateCount < 1 ) {
				equipmentAttrConfigDao.insert(equipmentAttrConfig);
			}
		}
		return "success";
	}

	@Override
	public void controlEquipment(DyEquipment equipment) {
		int qos = 0;
		String content ="{9:{1:0}}";
		String topic = "c/c/" + equipment.getEquipmentCode();
		mqttService.sendMessage(content, topic, qos);
	}
	
}
