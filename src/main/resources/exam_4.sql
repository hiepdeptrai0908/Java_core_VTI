DROP DATABASE IF EXISTS exam_5;
CREATE DATABASE exam_5;
USE exam_5;

create table users (
                       id int primary key auto_increment,
                       full_name varchar(50) NOT NULL,
                       email varchar(50) NOT NULL,
                       password varchar(50) NOT NULL,
                       exp_in_year varchar(50),
                       pro_skill varchar(50),
                       project_id int,
                       role ENUM('MANAGER', 'EMPLOYEE') NOT NULL DEFAULT 'EMPLOYEE'
);

insert into users(id, full_name		    , email                     , password       , exp_in_year, pro_skill, project_id, role)
            value (1, "Nguyễn Văn Khoa" , "nguyenvankhoa@gmail.com" , "Khoa123456789", 1          , null     , 1         , "MANAGER"),
			      (2, "Triệu Quang Hiệp", "trieuquanghiep@gmail.com", "Hiep123456789", null       , "Java"   , 1         , "EMPLOYEE");

DELIMITER $$
CREATE PROCEDURE find_by_email_and_password(IN in_email varchar(50), IN in_password varchar(50))
BEGIN
SELECT * FROM users WHERE email = in_email AND password = in_password;
END $$
DELIMITER ;