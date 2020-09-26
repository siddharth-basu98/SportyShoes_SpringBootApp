insert into User(userid, firstname, lastname, age, emailid, password) 
values(100,'Siddharth', 'Basu', 22, 'siddharthbasu98@gmail.com', 'siddharth98');
insert into User(userid, firstname, lastname, age, emailid, password) 
values(200,'Saphal', 'Patro', 23, 'saphal98@gmail.com', 'saphal98');


insert into Category(categoryid, name) 
values(100,'electronics');
insert into Category(categoryid, name) 
values(101,'fresh');


insert into Product(productid, name, brand, price, category_categoryid)
values(100, 'Nord', 'OnePlus', 30000, 100) ; 
insert into Product(productid, name, brand, price, category_categoryid)
values(101, 'iPhoneSE', 'Apple', 40000, 100) ; 
insert into Product(productid, name, brand, price, category_categoryid)
values(102, 'TonedMilk', 'Amul', 50, 101) ;


insert into Purchase(purchaseid, quantity, date, user_userid, product_productid)
values(100, 2, sysdate(), 100, 101) ; 
insert into Purchase(purchaseid, quantity, date, user_userid, product_productid)
values(101, 1, sysdate(), 200, 100) ; 
insert into Purchase(purchaseid, quantity, date, user_userid, product_productid)
values(102, 1, sysdate(), 100, 102) ; 
