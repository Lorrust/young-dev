CREATE TABLE IF NOT EXISTS person (
    id SERIAL NOT NULL,
    name VARCHAR(100) NOT NULL,
    ssn VARCHAR(14) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT un_person_ssn UNIQUE (ssn)
);

CREATE TABLE IF NOT EXISTS state (
    id SERIAL NOT NULL,
    abbreviation CHAR(2) NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS city (
    id SERIAL NOT NULL,
    state_id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_city_state FOREIGN KEY (state_id) REFERENCES state (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS person_complete (
    id INT NOT NULL,
    city_id INT NOT NULL,
    gender CHAR(1) NULL,
    birth_date DATE NULL,
    email VARCHAR(100) NULL,
    phone VARCHAR(15) NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_person_complete_city FOREIGN KEY (city_id) REFERENCES city (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT fk_person_complete_person FOREIGN KEY (id) REFERENCES person (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

INSERT INTO state (abbreviation, name) VALUES ('TX', 'Texas');
INSERT INTO state (abbreviation, name) VALUES ('MD', 'Maryland');

INSERT INTO city (state_id, name) VALUES (2, 'Houston');
INSERT INTO city (state_id, name) VALUES (2, 'Brownsville');
INSERT INTO city (state_id, name) VALUES (1, 'Oakland');
INSERT INTO city (state_id, name) VALUES (1, 'Waldorf');
INSERT INTO city (state_id, name) VALUES (1, 'Elkton');

INSERT INTO person (name, ssn) VALUES ('Mike Smith', '989-28-6140');
INSERT INTO person (name, ssn) VALUES ('John Doe', '539-72-0720');
INSERT INTO person (name, ssn) VALUES ('Paul Johnson', '514-79-2580');
INSERT INTO person (name, ssn) VALUES ('Mark Davis', '617-03-8430');
INSERT INTO person (name, ssn) VALUES ('Carl Brown', '534-19-4820');
INSERT INTO person (name, ssn) VALUES ('Adam May', '573-54-6530');
INSERT INTO person (name, ssn) VALUES ('Mary Johnson', '228-71-1850');
INSERT INTO person (name, ssn) VALUES ('Marlene White', '118-21-4990');
INSERT INTO person (name, ssn) VALUES ('Israel Smith', '930-11-4250');
INSERT INTO person (name, ssn) VALUES ('Donald Lee', '080-56-1850');


INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (1, 1, 'M', '1983-09-01', 'mike.smith@example.com', '(123) 456-7890');
INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (2, 2, 'M', '1983-08-25', 'john.doe@example.com', '(123) 456-7891');
INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (3, 3, 'M', '1982-05-02', 'paul.johnson@example.com', '(123) 456-7892');
INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (4, 4, 'F', '1988-03-20', 'mary.johnson@example.com', '(123) 456-7893');
INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (5, 5, 'F', '1990-01-18', 'marlene.white@example.com', '(123) 456-7894');
-- INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (6, 6, 'M', '1985-07-12', 'israel.smith@example.com', '(123) 456-7895');
-- INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (7, 7, 'M', '1984-11-25', 'mark.davis@example.com', '(123) 456-7896');
-- INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (8, 8, 'M', '1987-04-10', 'carl.brown@example.com', '(123) 456-7897');
-- INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (9, 9, 'M', '1982-09-01', 'adam.may@example.com', '(123) 456-7898');
-- INSERT INTO person_complete (id, city_id, gender, birth_date, email, phone) VALUES (10, 10, 'M', '1980-01-05', 'donald.lee@example.com', '(123) 456-7899');


SELECT *
FROM person p

-- LEFT JOIN person_complete pc ON (p.id = pc.id)
-- LEFT JOIN city c ON (c.id = pc.city_id)
-- LEFT JOIN state s ON (c.state_id = s.id)
-- WHERE pc.id IS NULL;
