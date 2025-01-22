insert into course(S_NO,full_Name,is_deleted)values(1000,'WEB_SERVICE',false);
insert into course(S_NO,full_Name,is_deleted)values(1001,'WEB_SERVICE',false);
insert into course(S_NO,full_Name,is_deleted)values(1002,'JPS IN 60STEPS',false);
insert into course(S_NO,full_Name,is_deleted)values(1003,'HOW TO BECAME NIGGA',false);

insert into Passport(S_NO,Passport_Number)values(4000,'E1567H');
insert into Passport(S_NO,Passport_Number)values(4001,'A15678K');
insert into Passport(S_NO,Passport_Number)values(4002,'KDHDK9');
insert into Passport(S_NO,Passport_Number)values(4003,'JFHI839');



insert into Student(S_NO,full_Name,Passport_Id)values(5000,'mohan',4000);
insert into Student(S_NO,full_Name,Passport_Id)values(5001,'amar',4001);
insert into Student(S_NO,full_Name,Passport_Id)values(5002,'rajesh',4002);
insert into Student(S_NO,full_Name,Passport_Id)values(5003,'kumar',4003);


insert into Review(S_NO,discription,rating,Course_Id)values(6000,'great course','ONE',1000);
insert into Review(S_NO,discription,rating,Course_Id)values(6001,'good','THREE',1001);
insert into Review(S_NO,discription,rating,Course_Id)values(6002,'worst course','THREE',1002);
insert into Review(S_NO,discription,rating,Course_Id)values(6003,'fuxk course','FOUR',1003);


insert into student_courses(Student_Id,Course_ID)values(5000,1000);
insert into student_courses(Student_Id,Course_ID)values(5001,1002);
insert into student_courses(Student_Id,Course_ID)values(5000,1001);
