/*
Navicat MySQL Data Transfer

Source Server         : localhost_x5
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2017-11-07 16:26:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dy_equipment`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment`;
CREATE TABLE `dy_equipment` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_type_id` varchar(100) default NULL COMMENT '设备类型ID',
  `equipment_parent_id` varchar(100) default NULL COMMENT '上级设备',
  `equipment_name` varchar(100) default NULL COMMENT '设备名称',
  `equipment_code` varchar(100) default NULL COMMENT '设备编码',
  `equipment_password` varchar(100) default NULL COMMENT '设备密码',
  `equipment_icon` varchar(100) default NULL COMMENT '设备图标',
  `manufacturer` varchar(100) default NULL COMMENT '厂商',
  `supplier` varchar(100) default NULL COMMENT '供应商',
  `brand` varchar(100) default NULL COMMENT '品牌',
  `standard` varchar(100) default NULL COMMENT '规格',
  `product_date` varchar(100) default NULL COMMENT '生产日期',
  `certificate` varchar(100) default NULL COMMENT 'certificate',
  `sort` int(11) default NULL COMMENT 'sort',
  `online_state` int(11) default NULL COMMENT '在线状态',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment
-- ----------------------------
INSERT INTO `dy_equipment` VALUES ('1', '1', '1', '1', '测试1', '测试1', '测试1', '测试1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dy_equipment` VALUES ('2', '2', '2', '2', '测试2', '测试2', '测试2', '测试2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dy_equipment` VALUES ('3', '1', '1', '1', '测试3', '测试3', '测试3', '测试3', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `dy_equipment` VALUES ('4', '1', '1', '1', '测试4', '测试4', '测试4', '测试4', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_attr_config`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_attr_config`;
CREATE TABLE `dy_equipment_attr_config` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_id` varchar(100) default NULL COMMENT '设备ID',
  `equipment_attr_id` varchar(100) default NULL COMMENT '属性ID',
  `config_content` varchar(100) default NULL COMMENT '属性内容',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  `upper_limit` decimal(10,0) default NULL COMMENT '上限值',
  `lower_limit` decimal(10,0) default NULL COMMENT '下限值',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_attr_config
-- ----------------------------
INSERT INTO `dy_equipment_attr_config` VALUES ('1', '3', '1', '3', '789', null, null, null, null, '2017-11-02 11:21:58', null, null, null, null, null);
INSERT INTO `dy_equipment_attr_config` VALUES ('111', '2', '1', '4', '789', null, '2017-11-02 11:17:10', null, null, '2017-11-02 11:21:58', null, null, null, null, null);
INSERT INTO `dy_equipment_attr_config` VALUES ('2', '0', '1', '2', '东南风', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_group`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_group`;
CREATE TABLE `dy_equipment_group` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `parent_id` varchar(100) default NULL COMMENT '父节点',
  `children_id` varchar(100) default NULL COMMENT '子节点',
  `node_type` varchar(100) default NULL COMMENT '节点类型',
  `level` int(11) default NULL COMMENT '级别',
  `group_name` varchar(100) default NULL COMMENT '分组名称',
  `group_type` varchar(100) default NULL COMMENT '分组编码',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_group
-- ----------------------------
INSERT INTO `dy_equipment_group` VALUES ('1', '1', '', null, null, null, '分组一', 'group1', null, null, null, null, '2017-11-02 16:24:16', null, null, null);
INSERT INTO `dy_equipment_group` VALUES ('2', '1', '', null, null, null, '分组二', 'group2', null, null, null, null, '2017-11-02 16:23:34', null, null, null);
INSERT INTO `dy_equipment_group` VALUES ('3', '8', '2', null, null, null, '分组下级', null, null, null, null, null, '2017-11-02 17:11:46', null, null, null);
INSERT INTO `dy_equipment_group` VALUES ('4', '0', '1', null, null, null, '测试insert', 'test insert', '0', '2017-11-02 17:13:23', null, null, '2017-11-02 17:13:23', null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_linked`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_linked`;
CREATE TABLE `dy_equipment_linked` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `link_formula` varchar(100) default NULL COMMENT '公式',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_linked
-- ----------------------------
INSERT INTO `dy_equipment_linked` VALUES ('1', '0', '111', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_log`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_log`;
CREATE TABLE `dy_equipment_log` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_id` varchar(100) default NULL COMMENT '设备ID',
  `equipment_state` int(11) default NULL COMMENT '设备状态',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_log
-- ----------------------------
INSERT INTO `dy_equipment_log` VALUES ('1', '0', '1', '0', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_timed_tasks`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_timed_tasks`;
CREATE TABLE `dy_equipment_timed_tasks` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `timed_type` varchar(200) default NULL COMMENT '定时类型',
  `timed_interval` decimal(18,2) default NULL COMMENT '定时间隔',
  `timed_code` varchar(100) default NULL COMMENT '定时执行代码',
  `timed_content` varchar(500) default NULL COMMENT '定时执行内容',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_timed_tasks
-- ----------------------------
INSERT INTO `dy_equipment_timed_tasks` VALUES ('1', '0', 'second', '10000.00', '{1:9:{0,1,1}}', '设备1 控制1关，控制2开，控制3开', null, null, null, null, null, null, null, null);
INSERT INTO `dy_equipment_timed_tasks` VALUES ('123', '1', 'hour', '3.00', null, '123456', '0', '2017-11-03 14:45:47', null, null, '2017-11-03 14:46:25', null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_type`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_type`;
CREATE TABLE `dy_equipment_type` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `type_name` varchar(100) default NULL COMMENT '类型名称',
  `type_code` varchar(100) default NULL COMMENT '类型编码',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_type
-- ----------------------------
INSERT INTO `dy_equipment_type` VALUES ('1', '1', '测试关联类型', 'test1', '0', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_type_attr`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_type_attr`;
CREATE TABLE `dy_equipment_type_attr` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_type_id` varchar(100) default NULL COMMENT '设备类型ID',
  `type_attr_name` varchar(200) default NULL COMMENT '属性名称',
  `type_attr_code` varchar(200) default NULL COMMENT '属性编码',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  `attr_type` int(11) default NULL COMMENT '属性类别',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_type_attr
-- ----------------------------
INSERT INTO `dy_equipment_type_attr` VALUES ('2', '0', '1', '风速', '2', null, null, null, null, null, null, null, null, null);
INSERT INTO `dy_equipment_type_attr` VALUES ('3', '0', '1', '风向', '1', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_equipment_warning`
-- ----------------------------
DROP TABLE IF EXISTS `dy_equipment_warning`;
CREATE TABLE `dy_equipment_warning` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_id` varchar(100) default NULL COMMENT '设备ID',
  `warning_type` varchar(200) default NULL COMMENT '报警类型',
  `warning_content` varchar(200) default NULL COMMENT '报警内容',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_equipment_warning
-- ----------------------------

-- ----------------------------
-- Table structure for `dy_group_equipment`
-- ----------------------------
DROP TABLE IF EXISTS `dy_group_equipment`;
CREATE TABLE `dy_group_equipment` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `equipment_id` varchar(100) default NULL COMMENT '设备ID',
  `equipment_group_id` varchar(100) default NULL COMMENT '设备分组ID',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_group_equipment
-- ----------------------------
INSERT INTO `dy_group_equipment` VALUES ('1', null, '1', '2', null, null, null, null, null, null, null, null);
INSERT INTO `dy_group_equipment` VALUES ('2', null, '2', '2', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_linked_content`
-- ----------------------------
DROP TABLE IF EXISTS `dy_linked_content`;
CREATE TABLE `dy_linked_content` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `linked_id` varchar(100) default NULL COMMENT '联动ID',
  `linked_content` varchar(100) default NULL COMMENT '联动内容',
  `linked_code` varchar(100) default NULL COMMENT '联动编码',
  `linked_equipment_id` varchar(100) default NULL COMMENT '触发设备ID',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_linked_content
-- ----------------------------
INSERT INTO `dy_linked_content` VALUES ('1', null, '1', 'ceshi2', 'ceshi2', '4', null, null, null, null, null, null, null, null);
INSERT INTO `dy_linked_content` VALUES ('2', null, '1', 'ceshi1', 'ceshi1', '3', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_linked_relation`
-- ----------------------------
DROP TABLE IF EXISTS `dy_linked_relation`;
CREATE TABLE `dy_linked_relation` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `linked_id` varchar(100) default NULL COMMENT '联动ID',
  `equipment_id` varchar(100) default NULL COMMENT '设备ID',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_linked_relation
-- ----------------------------
INSERT INTO `dy_linked_relation` VALUES ('1', null, '1', '2', null, null, null, null, null, null, null, null);
INSERT INTO `dy_linked_relation` VALUES ('2', null, '1', '1', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `dy_operation_log`
-- ----------------------------
DROP TABLE IF EXISTS `dy_operation_log`;
CREATE TABLE `dy_operation_log` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `operate_name` varchar(100) default NULL COMMENT '操作方法',
  `operate_params` varchar(100) default NULL COMMENT '方法参数',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_operation_log
-- ----------------------------
INSERT INTO `dy_operation_log` VALUES ('0377a76576fe4f9b9fab70204fa95dac', '0', 'getLinkedList', '[0, 1]', '0', '2017-11-06 16:20:34', null, null, '2017-11-06 16:20:34', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('28662ad2298840f1bc987db7b0530b44', '0', 'getEquipments', '[0, 2]', '0', '2017-11-07 09:26:17', null, null, '2017-11-07 09:26:17', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('2f9dcea88957428aa27d81e58622c436', '0', 'controlEquipment', '[com.dyjs.entity.DyEquipment@79427613]', '0', '2017-11-07 15:20:11', null, null, '2017-11-07 15:20:11', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('3568806f086f457eb460a78a729c0454', '0', 'getLinkedList', '[0, 1]', '0', '2017-11-06 16:39:54', null, null, '2017-11-06 16:39:54', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('41c223c34c024b44907f074d60c7d240', '0', 'getLinkedList', '[0, 1]', '0', '2017-11-06 16:59:26', null, null, '2017-11-06 16:59:26', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('4a385b6a9b384a50abda07f16ddec031', '0', 'newUserSafety', '[com.dyjs.entity.DyUserSafety@7e37fd35]', '0', '2017-11-06 18:16:07', null, null, '2017-11-06 18:16:07', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('97adfa4641cc450090ac75cfde6534d4', '0', 'getEquipmentStateWarning', '[0, 1]', '0', '2017-11-06 17:16:04', null, null, '2017-11-06 17:16:04', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('a37608051ea84f3caec08327051b6563', '0', 'getEquipmentWarning', '[0, 1]', '0', '2017-11-03 17:47:21', null, null, '2017-11-03 17:47:21', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('b23d93c789944a35b4fb25d569f2153b', '0', 'getEquipmentStateWarning', '[0, 1]', '0', '2017-11-06 17:29:57', null, null, '2017-11-06 17:29:57', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('b9fab96f878449bf85e115285addf5b9', '0', 'updateUserSafety', '[com.dyjs.entity.DyUserSafety@67994fb7]', '0', '2017-11-06 18:19:52', null, null, '2017-11-06 18:19:52', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('bfeb3f597213481d8f39fadacf4142ea', '0', 'updateUserSafety', '[com.dyjs.entity.DyUserSafety@fa26ad8]', '0', '2017-11-06 18:17:11', null, null, '2017-11-06 18:17:11', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('c4c6146aea544918a140d4982d9b3b6e', '0', 'getEquipmentStateWarning', '[0, 1]', '0', '2017-11-06 17:12:20', null, null, '2017-11-06 17:12:20', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('c6e0d8f4a5fc490baee3aef8f0a61a53', '0', 'updateUserSafety', '[com.dyjs.entity.DyUserSafety@4f762cb0]', '0', '2017-11-06 18:18:41', null, null, '2017-11-06 18:18:41', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('cfc66a73393b433bb1fe81cc4b61eeab', '0', 'getEquipments', '[0, 1]', '0', '2017-11-07 09:26:01', null, null, '2017-11-07 09:26:01', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('d502ebe32b054641a5499506c28c108c', '0', 'getUserSafety', '[1]', '0', '2017-11-06 18:16:42', null, null, '2017-11-06 18:16:42', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('dec162ab9ff74ef1a69d801b8d12635e', '0', 'getLinkedList', '[0, 1]', '0', '2017-11-06 16:24:56', null, null, '2017-11-06 16:24:56', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('e9b8265f14d34735ad397ed81d83ad18', '0', 'controlEquipment', '[com.dyjs.entity.DyEquipment@67a83b59]', '0', '2017-11-07 15:44:38', null, null, '2017-11-07 15:44:38', null, null, null);
INSERT INTO `dy_operation_log` VALUES ('fdc6d1a430664508a977b82f6b6288b5', '0', 'getLinkedList', '[0, 1]', '0', '2017-11-06 16:57:09', null, null, '2017-11-06 16:57:09', null, null, null);

-- ----------------------------
-- Table structure for `dy_user_safety`
-- ----------------------------
DROP TABLE IF EXISTS `dy_user_safety`;
CREATE TABLE `dy_user_safety` (
  `ID` varchar(100) NOT NULL default '',
  `version` int(11) default NULL COMMENT '版本',
  `person_id` varchar(100) default NULL COMMENT '人员',
  `question_id` varchar(100) default NULL COMMENT '安全问题ID',
  `answer` varchar(100) default NULL COMMENT '安全问题答案',
  `tab_is_delete` int(11) default NULL COMMENT '删除标识',
  `tab_create_date` datetime default NULL COMMENT '创建时间',
  `tab_creator_id` varchar(100) default NULL COMMENT '创建人ID',
  `tab_creator_name` varchar(100) default NULL COMMENT '创建人',
  `tab_modify_date` datetime default NULL COMMENT '修改时间',
  `tab_modifier_id` varchar(100) default NULL COMMENT '修改人ID',
  `tab_modifier_name` varchar(100) default NULL COMMENT '修改人',
  `tab_remark` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dy_user_safety
-- ----------------------------
INSERT INTO `dy_user_safety` VALUES ('1', '3', '1', '1', '6666', '0', '2017-11-06 18:16:07', null, null, '2017-11-06 18:19:52', null, null, null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(64) NOT NULL COMMENT '编号',
  `company_id` varchar(64) NOT NULL COMMENT '归属公司',
  `office_id` varchar(64) NOT NULL COMMENT '归属部门',
  `login_name` varchar(100) NOT NULL COMMENT '登录名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `no` varchar(100) default NULL COMMENT '工号',
  `name` varchar(100) NOT NULL COMMENT '姓名',
  `email` varchar(200) default NULL COMMENT '邮箱',
  `phone` varchar(200) default NULL COMMENT '电话',
  `mobile` varchar(200) default NULL COMMENT '手机',
  `user_type` char(1) default NULL COMMENT '用户类型',
  `photo` varchar(1000) default NULL COMMENT '用户头像',
  `login_ip` varchar(100) default NULL COMMENT '最后登陆IP',
  `login_date` datetime default NULL COMMENT '最后登陆时间',
  `login_flag` varchar(64) default NULL COMMENT '是否可登录',
  `create_by` varchar(64) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(64) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `remarks` varchar(255) default NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL default '0' COMMENT '删除标记',
  PRIMARY KEY  (`id`),
  KEY `sys_user_office_id` (`office_id`),
  KEY `sys_user_login_name` (`login_name`),
  KEY `sys_user_company_id` (`company_id`),
  KEY `sys_user_update_date` (`update_date`),
  KEY `sys_user_del_flag` (`del_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '1', '2', 'thinkgem', '123456', '0001', '系统管理员', 'thinkgem@163.com', '8675', '8675', null, null, '127.0.0.1', '2017-10-26 09:42:01', '1', '1', '2013-05-27 08:00:00', '1', '2017-11-01 09:35:07', '最高管理员', '0');
INSERT INTO `sys_user` VALUES ('10', '7', '11', 'jn_jsb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0010', '济南技术部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('11', '12', '13', 'lc_admin', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0011', '济南历城领导', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('12', '12', '18', 'lx_admin', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0012', '济南历下领导', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('13', '22', '23', 'gx_admin', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0013', '济南高新领导', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('2', '1', '2', 'sd_admin', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0002', '管理员', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('3', '1', '3', 'sd_zhb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0003', '综合部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('4', '1', '4', 'sd_scb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0004', '市场部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('5', '1', '5', 'sd_jsb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0005', '技术部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('6', '1', '6', 'sd_yfb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0006', '研发部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('7', '7', '8', 'jn_admin', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0007', '济南领导', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('8', '7', '9', 'jn_zhb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0008', '济南综合部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
INSERT INTO `sys_user` VALUES ('9', '7', '10', 'jn_scb', '02a3f0772fcca9f415adc990734b45c6f059c7d33ee28362c4852032', '0009', '济南市场部', null, null, null, null, null, null, null, '1', '1', '2013-05-27 08:00:00', '1', '2013-05-27 08:00:00', null, '0');
