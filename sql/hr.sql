/*
Navicat MySQL Data Transfer

Source Server         : teacher
Source Server Version : 50520
Source Host           : 192.168.10.78:3306
Source Database       : hr

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-08-12 18:07:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `datadictionary`
-- ----------------------------
DROP TABLE IF EXISTS `datadictionary`;
CREATE TABLE `datadictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL COMMENT '数据字典名称',
  `typeId` int(11) NOT NULL COMMENT '类型编号',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '状态0代表禁用，1启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='数据字典';

-- ----------------------------
-- Records of datadictionary
-- ----------------------------
INSERT INTO `datadictionary` VALUES ('1', '男', '1', '1');
INSERT INTO `datadictionary` VALUES ('2', '女', '1', '1');
INSERT INTO `datadictionary` VALUES ('3', '研究生', '2', '1');
INSERT INTO `datadictionary` VALUES ('4', '本科', '2', '1');
INSERT INTO `datadictionary` VALUES ('5', '专科', '2', '1');
INSERT INTO `datadictionary` VALUES ('6', '专科以下', '2', '1');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `name` varchar(50) NOT NULL COMMENT '部门名称',
  `sorts` int(11) NOT NULL DEFAULT '0' COMMENT '排序，默认为0',
  `parentId` int(11) DEFAULT '0' COMMENT '部门上级编号，如果为0代表顶级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门（N级）';

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `name` varchar(50) NOT NULL COMMENT '角色名称',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态0禁用，1启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户角色';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '1');
INSERT INTO `role` VALUES ('2', '测试1', '1');

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `Column_2` char(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of staff
-- ----------------------------

-- ----------------------------
-- Table structure for `sysusers`
-- ----------------------------
DROP TABLE IF EXISTS `sysusers`;
CREATE TABLE `sysusers` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `loginName` varchar(50) NOT NULL COMMENT '登录名称',
  `loginPwd` varchar(32) NOT NULL COMMENT '登录密码MD5加密的',
  `salt` varchar(5) NOT NULL COMMENT '随机生成盐5位',
  `roleId` int(11) NOT NULL COMMENT '角色编号',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态0禁用，1启用',
  `staffId` int(11) NOT NULL COMMENT '员工编号（外键）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员用户表';

-- ----------------------------
-- Records of sysusers
-- ----------------------------
