CREATE DATABASE IF NOT EXISTS airport_db;

USE airport_db;

CREATE TABLE IF NOT EXISTS pilots (
id INT AUTO_INCREMENT,
first_name VARCHAR(100)NOT NULL,
last_name VARCHAR(100)NOT NULL,
pilot_rank VARCHAR(50)NOT NULL,
pilot_code VARCHAR(10)UNIQUE NOT NULL,
PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS airplanes (
id INT AUTO_INCREMENT,
brand VARCHAR(50) NOT NULL,
model VARCHAR(50) NOT NULL,
passenger_capacity INT NOT NULL,
board_number VARCHAR(7) UNIQUE NOT NULL,
PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS flights (
id INT AUTO_INCREMENT,
airplane_id INT NOT NULL,
pilot_id INT NOT NULL,
flight_date DATE NOT NULL,
flight_time TIME NOT NULL,
flight_number VARCHAR(7) UNIQUE NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (airplane_id) REFERENCES airplanes(id),
FOREIGN KEY (pilot_id) REFERENCES pilots(id)
);





