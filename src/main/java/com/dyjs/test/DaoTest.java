package com.dyjs.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.dyjs.dao.DyEquipmentLogDao;
import com.dyjs.entity.DyEquipmentLog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DaoTest {

	private static Logger logger = Logger.getLogger(DaoTest.class);
//	@Autowired
//	private DyEquipmentTypeAttrDao equipmentTypeAttrDao;
	
//	@Autowired
//	private DyEquipmentGroupDao equipmentGroupDao;
//	@Autowired
//	private DyGroupEquipmentDao groupEquipmentDao;
//	@Autowired
//	private DyEquipmentDao equipmentDao;
	
//	@Autowired
//	private DyEquipmentTimedTasksDao equipmentTimedTasksDao;
//	@Autowired
//	private DyLinkedContentDao linkedContentDao;
	
//	@Autowired
//	private DyLinkedRelationDao linkedRelationDao;
	
//	@Autowired
//	private DyEquipmentLinkedDao equipmentLinkedDao;
	
	@Autowired
	private DyEquipmentLogDao equipmentLogDao;
	@Test
	public void test() {
		//获取用户
		/*String username = "thinkgem";
		String password = "123456";
		SysUser sysUser = sysUserDao.getUser(username, password);
		logger.info("ssssssssssss" + JSON.toJSON(sysUser));*/
		
		//获取设备列表
/*		int pageNo = 0;  
	    int pageSize = 1;  
	    PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
	    List<DyEquipment> list = equipmentDao.selectEquipmentsByPage() ;  
	    for(DyEquipment a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		
		//获取设备属性
		/*String id = "1";
		List<DyEquipmentTypeAttr> list = equipmentTypeAttrDao.getAttrByEquipmentTypeID(id);
		logger.info("ssssssssssss" + list.size());
		for(DyEquipmentTypeAttr a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		
		
		//配置设备属性
		/*List<DyEquipmentAttrConfig> list = new ArrayList<DyEquipmentAttrConfig>();
		DyEquipmentAttrConfig config = new DyEquipmentAttrConfig();
		config.setId("111");
		config.setEquipmentAttrId("2");
		config.setEquipmentId("1");
		config.setConfigContent("20");
		list.add(config);
		
		
		config = new DyEquipmentAttrConfig();
		config.setId("111");
		config.setEquipmentAttrId("3");
		config.setEquipmentId("1");
		config.setConfigContent("30");
		list.add(config);

		
		for(DyEquipmentAttrConfig equipmentAttrConfig:list) {
			int updateCount = equipmentAttrConfigDao.updateConfig(equipmentAttrConfig);
			logger.info("ssssssssssssupdateCount:" + updateCount);
			if(updateCount < 1 ) {
				int i = equipmentAttrConfigDao.insert(equipmentAttrConfig);
				logger.info("ssssssssssss I:" + i);

			}
		}*/
		//获取设备分组
/*		List<DyEquipmentGroup> list = equipmentGroupDao.getEquipmentGroup(null);
		for(DyEquipmentGroup equipmentGroup:list) {
			logger.info("ssssssssssss" + JSON.toJSON(equipmentGroup));
		}
		 List<DyGroupEquipment> list= groupEquipmentDao.getEquipmentByGroupID(groupID);*/
		
		//获取设备定时任务
		/*int pageNo = 0;  
	    int pageSize = 1;  
	    PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。  
		List<DyEquipmentTimedTasks> taskList = equipmentTimedTasksDao.selectTasks();
	    for(DyEquipmentTimedTasks a :taskList ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		//获取设备联动触发
/*		List<DyLinkedContent> list= linkedContentDao.selectContents("1");
		for(DyLinkedContent a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		//设备联动关联
/*		List<DyLinkedRelation> list= linkedRelationDao.selectRelations("1");
		for(DyLinkedRelation a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		//设备联动信息
/*		List<DyEquipmentLinked> list= equipmentLinkedDao.getEquipmentLinked();
		for(DyEquipmentLinked a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}*/
		//设备状态报警
		
		List<DyEquipmentLog> list= equipmentLogDao.selectEquipmentState();
		for(DyEquipmentLog a :list ) {
			logger.info("ssssssssssss" + JSON.toJSON(a));
		}
	}
}