-- table person
DROP TABLE tperson;
CREATE TABLE tperson(
id	VARCHAR(50)	PRIMARY KEY NOT NULL,
name	VARCHAR(50) NOT NULL,
age	INT	NOT NULL,
salary	FLOAT,
score	FLOAT
);