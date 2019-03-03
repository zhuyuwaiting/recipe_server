/*
Navicat MySQL Data Transfer

Source Server         : zhuyuwaiting
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recipe_manage

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-03-03 21:40:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for enum_info
-- ----------------------------
DROP TABLE IF EXISTS `enum_info`;
CREATE TABLE `enum_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(32) NOT NULL,
  `key_desc` varchar(256) DEFAULT NULL COMMENT '描述',
  `value` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `desc` varchar(256) DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `enum_info_key_value_index` (`key`,`value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enum_info
-- ----------------------------

-- ----------------------------
-- Table structure for medicine
-- ----------------------------
DROP TABLE IF EXISTS `medicine`;
CREATE TABLE `medicine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medicine_no` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL,
  `english_name` varchar(100) DEFAULT NULL,
  `type` varchar(32) NOT NULL,
  `unit` varchar(32) DEFAULT NULL COMMENT '单位',
  `cell_unit` varchar(32) DEFAULT NULL COMMENT '基础单位',
  `cell_num` int(32) DEFAULT NULL COMMENT '每盒中含有cell数量',
  `cell_weight` int(32) DEFAULT NULL COMMENT '基础cell的重量',
  `each_dose` int(32) DEFAULT NULL COMMENT '每次剂量',
  `taking_way` varchar(32) DEFAULT NULL COMMENT '服用方式',
  `daily_times` int(32) DEFAULT NULL COMMENT '每日次数',
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `medicine_no_uq` (`medicine_no`),
  KEY `medicine_no_name_e_index` (`medicine_no`,`name`,`english_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicine
-- ----------------------------

-- ----------------------------
-- Table structure for recipe_detail
-- ----------------------------
DROP TABLE IF EXISTS `recipe_detail`;
CREATE TABLE `recipe_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_no` varchar(32) NOT NULL,
  `medicine_no` varchar(32) NOT NULL,
  `medicine_num` int(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `recipe_detail_no_index` (`recipe_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_detail
-- ----------------------------

-- ----------------------------
-- Table structure for recipe_info
-- ----------------------------
DROP TABLE IF EXISTS `recipe_info`;
CREATE TABLE `recipe_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_no` varchar(32) NOT NULL,
  `patient_name` varchar(32) NOT NULL,
  `patient_sex` tinyint(2) NOT NULL,
  `patient_age` int(3) NOT NULL,
  `pay_type` varchar(32) NOT NULL,
  `disease` varchar(32) NOT NULL,
  `classfication` varchar(32) NOT NULL COMMENT '科别',
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `recipe_info_no_uq` (`recipe_no`),
  KEY `recipe_info_no_name_index` (`recipe_no`,`patient_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_info
-- ----------------------------

-- ----------------------------
-- Table structure for recipe_template
-- ----------------------------
DROP TABLE IF EXISTS `recipe_template`;
CREATE TABLE `recipe_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_template_no` varchar(32) NOT NULL,
  `disease` varchar(32) NOT NULL,
  `classfication` varchar(32) NOT NULL COMMENT '科别',
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `recipe_template_no_uq` (`recipe_template_no`),
  KEY `recipe_template_no_c_index` (`recipe_template_no`,`disease`,`classfication`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_template
-- ----------------------------

-- ----------------------------
-- Table structure for recipe_template_detail
-- ----------------------------
DROP TABLE IF EXISTS `recipe_template_detail`;
CREATE TABLE `recipe_template_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_template_no` varchar(32) NOT NULL,
  `medicine_no` varchar(32) NOT NULL,
  `medicine_num` int(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `recipe_template_detail_no_index` (`recipe_template_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_template_detail
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) DEFAULT '',
  `role_id` varchar(32) DEFAULT NULL COMMENT '1买家2卖家',
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `nick` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_info_uid_index` (`uid`),
  UNIQUE KEY `user_info_uname_unique` (`username`),
  KEY `user_info_u_p_index` (`username`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '20887298731', 'admin', '1234', null, 'VALID', '2019-02-05 09:38:58', '2019-03-02 11:05:11', 'admin', 'https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png');
