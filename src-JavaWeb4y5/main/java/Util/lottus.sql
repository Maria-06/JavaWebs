create database lottus;
use lottus;

Create table users_tbl(
                          user_id INT auto_increment primary key,
                          user_firstname VARCHAR(40) not null,
                          user_lastname VARCHAR(40) not null,
                          user_email VARCHAR(60) not null,
                          user_password VARCHAR(256)
);

INSERT INTO users_tbl (user_id,user_firstname,user_lastname,
                       user_email,user_password) VALUES (1,"Maria","Hernandez","lmariahernandez0606@gmail.com","Mari1234");

ALTER TABLE users_tbl ADD COLUMN user_password VARBINARY(255);


/*alteryouthink
$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue*/

INSERT INTO lottus.users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('Maria'), UPPER('Hernandez'), 'lmhernandez2621@gmail.com',
        AES_ENCRYPT('Mari1234',
                    '$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue'));

SELECT *,CAST(AES_DECRYPT(user_password,
                          '$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue') AS CHAR(50))
    end_data FROM users_tbl WHERE user_id = 1;