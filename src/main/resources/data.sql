insert into user values(90001, sysdate(), 'user1', 'pass123', '701010-1111123');
insert into user values(90002, sysdate(), 'user2', 'pass222', '801010-1111123');
insert into user values(90003, sysdate(), 'user3', 'pass333', '901010-1111123');

insert into post values(10001, 'My first post', 90001);
insert into post values(10002, 'My second post', 90001);
