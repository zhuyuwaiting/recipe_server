/*
Navicat MySQL Data Transfer

Source Server         : zhuyuwaiting
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recipe_manage

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-04-01 22:34:20
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
  `update_time` timestamp NOT NULL DEFAULT '1970-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `enum_info_key_value_index` (`key`,`value`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enum_info
-- ----------------------------
INSERT INTO `enum_info` VALUES ('4', 'MEDICINE_UNIT_CN', '中药单位', null, null, null, 'VALID', '2019-03-08 23:24:03', '2019-03-13 22:36:20');
INSERT INTO `enum_info` VALUES ('5', 'MEDICINE_CELL_UNIT', '西药基础组成单位', null, null, null, 'VALID', '2019-03-08 23:24:27', '2019-03-27 22:36:20');
INSERT INTO `enum_info` VALUES ('6', 'MEDICINE_TAKING_WAY_CN', '中药服用方式', null, null, null, 'VALID', '2019-03-08 23:24:40', '2019-03-13 22:36:26');
INSERT INTO `enum_info` VALUES ('12', 'MEDICINE_UNIT_EN', '西药单位', null, null, null, 'VALID', '2019-03-27 22:36:51', '2019-03-27 22:37:17');
INSERT INTO `enum_info` VALUES ('13', 'MEDICINE_TAKING_WAY_EN', '西药服用方式', null, null, null, 'VALID', '2019-03-27 22:37:13', '2019-03-27 22:37:20');
INSERT INTO `enum_info` VALUES ('14', 'MEDICINE_UNIT_CN', '中药单位', 'g', '克', 'g', 'VALID', '2019-03-27 22:37:52', '2019-03-27 22:37:52');
INSERT INTO `enum_info` VALUES ('15', 'MEDICINE_UNIT_CN', '中药单位', 'liang', '两', '中药单位两', 'VALID', '2019-03-27 22:38:24', '2019-03-27 22:38:24');
INSERT INTO `enum_info` VALUES ('16', 'MEDICINE_CELL_UNIT', '西药基础组成单位', 'g', 'g', '西药单位', 'VALID', '2019-03-27 22:40:42', '2019-03-27 22:40:42');
INSERT INTO `enum_info` VALUES ('17', 'MEDICINE_CELL_UNIT', '西药基础组成单位', 'mg', '毫克', '西药单位毫克', 'VALID', '2019-03-27 22:43:25', '2019-03-27 22:43:25');
INSERT INTO `enum_info` VALUES ('18', 'MEDICINE_TAKING_WAY_CN', '中药服用方式', 'orally', '口服', '中药口服', 'VALID', '2019-03-27 22:44:08', '2019-03-27 22:44:08');
INSERT INTO `enum_info` VALUES ('19', 'MEDICINE_TAKING_WAY_CN', '中药服用方式', 'fried', '煎服', '中药煎服', 'VALID', '2019-03-27 22:44:37', '2019-03-27 22:44:37');
INSERT INTO `enum_info` VALUES ('20', 'MEDICINE_UNIT_EN', '西药单位', 'pocket', '盒', '西药单位盒', 'VALID', '2019-03-27 22:44:59', '2019-03-27 22:44:59');
INSERT INTO `enum_info` VALUES ('21', 'MEDICINE_TAKING_WAY_EN', '西药服用方式', 'orally', '口服', '西药单位口服', 'VALID', '2019-03-27 22:45:16', '2019-03-27 22:45:16');
INSERT INTO `enum_info` VALUES ('22', 'MEDICINE_TAKING_WAY_EN', '西药服用方式', 'mixWater', '冲服', '冲服', 'VALID', '2019-03-27 22:45:45', '2019-03-27 22:45:45');

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
  `update_time` timestamp NOT NULL DEFAULT '1970-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `medicine_no_uq` (`medicine_no`),
  KEY `medicine_no_name_e_index` (`medicine_no`,`name`,`english_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicine
-- ----------------------------
INSERT INTO `medicine` VALUES ('1', '01243361553698264248000', '当归', null, 'CHINESE_MEDICINE', 'g', null, null, null, null, 'fried', null, 'INVALID', '2019-03-27 22:51:04', '2019-03-27 22:52:42');
INSERT INTO `medicine` VALUES ('2', '01977291553698356589000', '枸杞', null, 'CHINESE_MEDICINE', 'g', null, null, null, null, 'fried', null, 'INVALID', '2019-03-27 22:52:37', '2019-03-27 22:52:40');
INSERT INTO `medicine` VALUES ('3', '01253891553698387642000', '花', null, 'CHINESE_MEDICINE', 'g', null, null, null, null, 'orally', null, 'INVALID', '2019-03-27 22:53:08', '2019-03-27 22:54:31');
INSERT INTO `medicine` VALUES ('4', '01497641553698477350000', '12', null, 'CHINESE_MEDICINE', 'g', null, null, null, null, 'orally', null, 'INVALID', '2019-03-27 22:54:37', '2019-03-27 22:54:40');
INSERT INTO `medicine` VALUES ('5', '01195741553698501006000', '当归', 'dd', 'CHINESE_MEDICINE', 'g', null, null, null, null, 'orally', null, 'INVALID', '2019-03-27 22:55:01', '2019-03-27 22:59:14');
INSERT INTO `medicine` VALUES ('6', '01894931553698533725000', 'ddd', null, 'WESTERN_MEDICINE', 'pocket', 'g', '2', '100', '200', 'orally', '2', 'INVALID', '2019-03-27 22:55:34', '2019-03-27 22:56:30');
INSERT INTO `medicine` VALUES ('7', '01848151553698603853000', '22', '2', 'WESTERN_MEDICINE', 'pocket', 'g', '2', '200', '200', 'mixWater', '2', 'INVALID', '2019-03-27 22:56:44', '2019-03-27 22:59:18');
INSERT INTO `medicine` VALUES ('8', '01911971553787140429000', '2', '12', 'CHINESE_MEDICINE', 'g', null, null, null, null, 'orally', null, 'INVALID', '2019-03-28 23:32:20', '2019-03-28 23:32:34');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_detail
-- ----------------------------
INSERT INTO `recipe_detail` VALUES ('1', '03305811553698696397000', '01195741553698501006000', '1');
INSERT INTO `recipe_detail` VALUES ('2', '03526311553698726819000', '01848151553698603853000', '1');

-- ----------------------------
-- Table structure for recipe_info
-- ----------------------------
DROP TABLE IF EXISTS `recipe_info`;
CREATE TABLE `recipe_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_no` varchar(32) NOT NULL,
  `recipe_type` varchar(32) DEFAULT NULL,
  `patient_name` varchar(32) NOT NULL,
  `patient_sex` tinyint(2) NOT NULL,
  `patient_age` int(3) NOT NULL,
  `pay_type` varchar(32) DEFAULT NULL,
  `disease` varchar(32) NOT NULL,
  `classfication` varchar(32) DEFAULT NULL COMMENT '科别',
  `num` int(11) DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '1970-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `recipe_info_no_uq` (`recipe_no`),
  KEY `recipe_info_no_name_index` (`recipe_no`,`patient_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_info
-- ----------------------------
INSERT INTO `recipe_info` VALUES ('1', '03305811553698696397000', 'CHINESE', 's', '1', '22', null, '22', '22', '2', 'INVALID', '2019-03-27 22:58:16', '2019-03-27 22:59:29');
INSERT INTO `recipe_info` VALUES ('2', '03526311553698726819000', 'WESTERN', '22', '0', '2', null, '2', '2', null, 'INVALID', '2019-03-27 22:58:47', '2019-03-27 22:59:29');

-- ----------------------------
-- Table structure for recipe_template
-- ----------------------------
DROP TABLE IF EXISTS `recipe_template`;
CREATE TABLE `recipe_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recipe_template_no` varchar(32) NOT NULL,
  `recipe_type` varchar(32) DEFAULT NULL,
  `disease` varchar(32) NOT NULL,
  `classfication` varchar(32) DEFAULT NULL COMMENT '科别',
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '1970-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `recipe_template_no_uq` (`recipe_template_no`),
  KEY `recipe_template_no_c_index` (`recipe_template_no`,`disease`,`classfication`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_template
-- ----------------------------
INSERT INTO `recipe_template` VALUES ('1', '02286101553698641964000', 'CHINESE', '1111', '22', 'INVALID', '2019-03-27 22:57:22', '2019-03-27 22:59:23');
INSERT INTO `recipe_template` VALUES ('2', '02799311553698710539000', 'WESTERN', '2', '2', 'INVALID', '2019-03-27 22:58:31', '2019-03-27 22:59:23');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recipe_template_detail
-- ----------------------------
INSERT INTO `recipe_template_detail` VALUES ('2', '02286101553698641964000', '01195741553698501006000', '1');
INSERT INTO `recipe_template_detail` VALUES ('3', '02799311553698710539000', '01848151553698603853000', '1');

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
  `update_time` timestamp NOT NULL DEFAULT '1970-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
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
