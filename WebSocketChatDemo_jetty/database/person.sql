/*
Navicat MySQL Data Transfer

Source Server         : zbqc_yxl
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : zbqc_lf

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2019-07-05 10:41:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `ID` varchar(50) NOT NULL,
  `created` varchar(50) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员表';

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1f894488-4245-41e4-a02a-bccd214361cb', '1549369731881', 'Average Joe', '', '', '');
