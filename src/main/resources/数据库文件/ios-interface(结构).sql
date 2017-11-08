/*
Navicat MySQL Data Transfer

Source Server         : localhost_x5
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2017-11-07 16:26:42
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
