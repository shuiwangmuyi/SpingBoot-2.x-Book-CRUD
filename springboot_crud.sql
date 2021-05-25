/*
Navicat MySQL Data Transfer

Source Server         : SSM
Source Server Version : 50605
Source Host           : localhost:3306
Source Database       : springboot_crud

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2021-05-25 18:19:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) DEFAULT NULL,
  `bookCount` int(11) DEFAULT NULL,
  `bookDetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'Java', '10', '从精通到入门');
INSERT INTO `book` VALUES ('2', 'MySQL', '2', '从删库到跑路');
INSERT INTO `book` VALUES ('3', '三国志', '1', '并非三国演义');
INSERT INTO `book` VALUES ('4', '斗罗大陆', '9', '玄幻小说');
INSERT INTO `book` VALUES ('6', '熔岩巨兽玩法教程', '1', '石头人yyds');
INSERT INTO `book` VALUES ('8', '西游记', '4', '四大名著之一');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', 'root');
INSERT INTO `user` VALUES ('2', '小宋', '666');
INSERT INTO `user` VALUES ('3', '张起灵', '1314');
