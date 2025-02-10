INSERT INTO app_user (name, email, password) VALUES
('John Doe', 'john.doe@example.com', 'password123'),
('Alice Smith', 'alice.smith@example.com', 'securePass!'),
('Bob Johnson', 'bob.johnson@example.com', 'qwerty123'),
('Emily Davis', 'emily.davis@example.com', 'abc@123'),
('Michael Brown', 'michael.brown@example.com', 'pass4321'),
('Sophia Wilson', 'sophia.wilson@example.com', 'Sophia@987'),
('Daniel Martinez', 'daniel.martinez@example.com', 'D@nielPass'),
('Olivia Taylor', 'olivia.taylor@example.com', 'Olivia#567'),
('James Anderson', 'james.anderson@example.com', 'James2024!'),
('Emma Thomas', 'emma.thomas@example.com', 'EmmaPass123');

INSERT INTO user_roles (user_id, roles) VALUES
(1, 'RIDER'),
(2, 'DRIVER'),
(3, 'RIDER'),
(4, 'DRIVER'),
(5, 'RIDER'),
(6, 'DRIVER'),
(7, 'RIDER'),
(8, 'DRIVER'),
(9, 'RIDER'),
(10, 'DRIVER'),
(2, 'RIDER'),
(3, 'DRIVER'),
(4, 'RIDER'),
(5, 'DRIVER'),
(6, 'RIDER'),
(7, 'DRIVER'),
(8, 'RIDER'),
(9, 'DRIVER'),
(10, 'RIDER');

INSERT INTO rider (id, user_id, rating) VALUES
(1, 1, 4.9);

INSERT INTO driver (id, user_id, rating, available, current_location) VALUES
(2, 2, 4.7, true, ST_GeomFromText('POINT(77.1025 28.7041)', 4326)), -- Delhi
(3, 3, 4.5, false, ST_GeomFromText('POINT(72.8777 19.0760)', 4326)), -- Mumbai
(4, 4, 4.9, true, ST_GeomFromText('POINT(88.3639 22.5726)', 4326)), -- Kolkata
(5, 5, 4.3, true, ST_GeomFromText('POINT(80.2707 13.0827)', 4326)), -- Chennai
(6, 6, 4.6, false, ST_GeomFromText('POINT(78.4867 17.3850)', 4326)), -- Hyderabad
(7, 7, 4.4, true, ST_GeomFromText('POINT(75.8577 26.9124)', 4326)), -- Jaipur
(8, 8, 4.2, true, ST_GeomFromText('POINT(73.8567 18.5204)', 4326)), -- Pune
(9, 9, 4.7, false, ST_GeomFromText('POINT(76.7794 30.7333)', 4326)), -- Chandigarh
(10, 10, 4.8, true, ST_GeomFromText('POINT(77.2310 28.6129)', 4326)); -- India Gate, Delhi

INSERT INTO wallet (id, user_id, balance) VALUES
(1, 1, 100),
(2,2,500);