use lottus;

CREATE TABLE users_tbl(
                          user_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                          user_firstname VARCHAR(40)NOT NULL,
                          user_lastname VARCHAR(40)NOT NULL,
                          user_email VARCHAR(60)NOT NULL,
                          user_password VARCHAR(50)NOT NULL
);


CREATE TABLE Category(
                         categoryId  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                         categoryName VARCHAR(50)NOT NULL
);


CREATE TABLE Product(
                        productId  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                        productName VARCHAR(50)NOT NULL,
                        productValue DOUBLE NOT NULL,
                        categoryId INT NOT NULL,
                        FOREIGN KEY(categoryId) REFERENCES Category(CategoryId)
);

select * from product;


INSERT INTO users_tbl (user_id, user_firstname, user_lastname, user_email,user_password)
VALUES (2,"Andrés","Mayorga","andres2621@soy.sena.edu.co","LVU06G");
INSERT INTO Category (categoryId,categoryName) VALUES (1,"Marketing");
INSERT INTO Product (productId,productName, productValue) VALUES (345, "Tapete de yoga", 70.000);

SELECT* FROM users_tbl;
SELECT* FROM Product;
SELECT* FROM Category;



INSERT INTO users_tbl (user_id,user_firstname,user_lastname,user_email,user_password)
VALUES (1,"Maria","Hernandez","lmariahernandez0606@gmail.com","Mari1234");

ALTER TABLE users_tbl MODIFY user_password VARBINARY(255);

/*alteryouthink
$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue*/


INSERT INTO lottus.users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('Maria'), UPPER('Hernandez'), 'lmhernandez2621@gmail.com',
        AES_ENCRYPT('Mari1234',
                    '$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue'));

SELECT *,CAST(AES_DECRYPT(user_password,'$2a$12$5prhuE.f6Kv6PtLg9uBoVO42YMesfohRufohe/tO4zl27AekIEnue') AS CHAR(50))
    end_data FROM users_tbl WHERE user_id = 1;