-- Database: school

-- DROP
DROP TABLE IF EXISTS teacher_lesson;
DROP TABLE IF EXISTS student_group;
DROP TABLE IF EXISTS lesson;
DROP TABLE IF EXISTS classroom;
DROP TABLE IF EXISTS teacher;

DROP SEQUENCE IF EXISTS classroom_id_seq;
DROP SEQUENCE IF EXISTS teacher_id_seq;
DROP SEQUENCE IF EXISTS lesson_id_seq;
DROP SEQUENCE IF EXISTS student_group_id_seq;


-- CLASSROOM
CREATE SEQUENCE IF NOT EXISTS classroom_id_seq;

CREATE TABLE IF NOT EXISTS classroom
(
id INTEGER NOT NULL DEFAULT NEXTVAL('classroom_id_seq'),
code VARCHAR(10) NOT NULL,
active BOOLEAN DEFAULT TRUE,

CONSTRAINT classroom_pk PRIMARY KEY (id)
);

SELECT * FROM classroom;


-- TEACHER
CREATE SEQUENCE IF NOT EXISTS teacher_id_seq;

CREATE TABLE IF NOT EXISTS teacher
(
id INTEGER NOT NULL DEFAULT NEXTVAL('teacher_id_seq'),
nome VARCHAR(100) NOT NULL,
active BOOLEAN DEFAULT TRUE,

CONSTRAINT teacher_pk PRIMARY KEY (id)
);


-- class
CREATE SEQUENCE IF NOT EXISTS class_id_seq;

CREATE TABLE IF NOT EXISTS class
(
id INTEGER NOT NULL DEFAULT NEXTVAL('class_id_seq'),
code VARCHAR(10) NOT NULL,
active BOOLEAN DEFAULT TRUE,
id_classroom INTEGER NOT NULL,
period CHARACTER VARYING(20) NOT NULL,

CONSTRAINT class_pk PRIMARY KEY (id),
FOREIGN KEY (id_classroom) REFERENCES classroom (id)
ON DELETE NO ACTION ON UPDATE NO ACTION
);

SELECT * FROM class;

-- STUDENT_GROUP
CREATE SEQUENCE IF NOT EXISTS student_group_id_seq;

CREATE TABLE IF NOT EXISTS student_group
(
id INTEGER NOT NULL DEFAULT NEXTVAL('student_group_id_seq'),
id_teacher INTEGER NOT NULL,
id_classroom INTEGER NOT NULL,
active BOOLEAN DEFAULT TRUE,

CONSTRAINT student_group_pk PRIMARY KEY (id),
CONSTRAINT student_group_teacher_id_teacher_fk
FOREIGN KEY (id_teacher) REFERENCES teacher (id)
ON DELETE NO ACTION ON UPDATE NO ACTION,
CONSTRAINT student_group_classroom_id_classroom_fk
FOREIGN KEY (id_classroom) REFERENCES classroom (id)
ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- TEACHER_LESSON
CREATE TABLE IF NOT EXISTS teacher_lesson
(
id_teacher INTEGER NOT NULL,
id_lesson INTEGER NOT NULL,

CONSTRAINT teacher_lesson_pk PRIMARY KEY(id_teacher, id_lesson),

-- Teacher Constraint
CONSTRAINT teacher_lesson_teacher_id_teacher_fk
FOREIGN KEY (id_teacher) REFERENCES teacher (id)
ON DELETE NO ACTION ON UPDATE NO ACTION,

-- Lesson Constraint
CONSTRAINT teacher_lesson_lesson_id_lesson_fk
FOREIGN KEY (id_lesson) REFERENCES lesson (id)
ON DELETE NO ACTION ON UPDATE NO ACTION
);