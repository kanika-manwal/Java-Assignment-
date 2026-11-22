Run these in mysql
-> CREATE DATABASE company_db;
-> mysql> USE company_db;
-> CREATE TABLE employees (
    ->     emp_id INT PRIMARY KEY,
    ->     name VARCHAR(100),
    ->     department VARCHAR(50),
    ->     salary DECIMAL(10,2)
    -> );

after running  use this command for cheking if databse is connected successfully 
-> USE company_db;
-> SELECT * FROM employees;
