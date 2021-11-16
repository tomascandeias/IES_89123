DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
                           firstName VARCHAR(250) NOT NULL,
                           lastName VARCHAR(250) NOT NULL,
                           emailId VARCHAR(250) DEFAULT NULL
);