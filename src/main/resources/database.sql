DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id 				INT PRIMARY KEY AUTO_INCREMENT,
    full_name 		VARCHAR(50) 	NOT NULL,
    email 			VARCHAR(50) 	NOT NULL UNIQUE KEY,
    password 		VARCHAR(50) 	NOT NULL DEFAULT "123456",
    exp_in_year 	INT,
    pro_skill 		VARCHAR(50),
    project_id 		INT,
    role 			ENUM("MANAGER", "EMPLOYEE", "ADMIN") NOT NULL DEFAULT "EMPLOYEE"
);

INSERT INTO users 	(full_name          , email               , password  	  , exp_in_year, pro_skill    , project_id, role       )
VALUES				("Triệu Quang Hiệp" , "tqh@gmail.com"     , "hiep1234"    , null       , null         , 2         , "ADMIN"    ),
					("Lê Lam Trường"    , "llt@gmail.com"     , "truong1234"  , 3          , null         , 4         , "MANAGER"  ),
					("Phạm Bích Ngọc"   , "pbn@gmail.com"     , "ngoc1234"    , null       , "PHP"        , 2         , "EMPLOYEE" ),
					("Huỳnh Trấn Thành" , "htt@gmail.com"     , "thanh1234"   , null       , "JavaScript" , 2         , "EMPLOYEE" );

DROP PROCEDURE IF EXISTS find_admin_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_admin_by_email_and_password (
	IN in_email			VARCHAR(50),
    IN in_password		VARCHAR(50)
)
BEGIN

	SELECT *
	FROM users
	WHERE email = in_email AND password = in_password and role = "ADMIN";

END $$
DELIMITER ;
