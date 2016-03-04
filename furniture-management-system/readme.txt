1 搭建开发环境
 	1.1 导入jar包
 		c3p0-0.9.5.2.jar
		commons-beanutils-1.8.3.jar
		commons-dbutils-1.6.jar
		commons-fileupload-1.2.1.jar
		commons-io-2.4.jar
		commons-logging-1.2.jar
		jstl.jar
		log4j-1.2.17.jar
		mchange-commons-java-0.2.11.jar
		mysql-connector-java-5.1.38-bin.jar
		standard.jar
	1.2 创建包名
		







create database if not exists furniture;
use furniture;

create table if not exists consumer(
	cid int(11) auto_increment primary key,
	cname varchar(20) default null,
	cpassword varchar(20) default null COMMENT '密码',
	ctel varchar(11) not null COMMENT '手机号',
	cmoney int(10) default null,
	ostatus int(10) default null
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

create table furniture(
	fid int(11) auto_increment primary key,
	fname varchar(20) not null,
	fsummary varchar(50) default null,
	fnum int(11) default null,
	fmoney int(10) default null,
	fpic varchar(40) default null
)ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

create table oorder(
	orderID int(11) auto_increment primary key,
	bnumber int(11) default null,
	username varchar(20) default null,
	Truename varchar(20) default null,
	address varchar(100) default null,
	OrderDate timestamp null default current_timestamp,
	enforce int(10) default null,
	bz varchar(200) default null
)ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

create table operator(
	oid int(11) primary key auto_increment,
	opassword varchar(20) default null,
	oname varchar(20) default null,
	ostatus int(10) default null
)ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

create table order_detail(
	ID int(11) primary key auto_increment,
	orderID int(11),
	goodsID int(11),
	price int(11),
	number int(11)
)ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

create table placard(
	ID int(11) auto_increment primary key,
	title varchar(100),
	content mediumtext
)ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

alter table order_detail add constraint orderID_FK foreign key(orderID) references oorder(orderID);
alter table order_detail add constraint fid_FK foreign key(goodsid) references furniture(fid);