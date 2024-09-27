-- Database: library

-- DROP
DROP TABLE IF EXISTS book_author;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS category;

DROP SEQUENCE IF EXISTS book_id_seq;
DROP SEQUENCE IF EXISTS author_id_seq;
DROP SEQUENCE IF EXISTS category_id_seq;

-- CATEGORY
CREATE SEQUENCE category_id_seq;

CREATE TABLE category
(
    id INTEGER NOT NULL DEFAULT NEXTVAL('category_id_seq'),
    nome VARCHAR(100) NOT NULL,
    excluded BOOLEAN DEFAULT FALSE,

    CONSTRAINT category_pk PRIMARY KEY (id)
);

-- BOOK
CREATE SEQUENCE book_id_seq;

CREATE TABLE book
(
    id INTEGER NOT NULL DEFAULT NEXTVAL('book_id_seq'),
    nome VARCHAR(100) NOT NULL,
    isbn VARCHAR(30),
    id_category INTEGER NOT NULL,
    excluded BOOLEAN DEFAULT FALSE,

    CONSTRAINT book_pk PRIMARY KEY (id),

    CONSTRAINT book_category_id_category_fk
    FOREIGN KEY (id_category) REFERENCES category (id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- AUTHOR
CREATE SEQUENCE author_id_seq;

CREATE TABLE author
(
    id INTEGER NOT NULL DEFAULT NEXTVAL('author_id_seq'),
    nome VARCHAR(100) NOT NULL,
    excluded BOOLEAN DEFAULT FALSE,

    CONSTRAINT author_pk PRIMARY KEY (id)
);

-- BOOK_AUTHOR
CREATE TABLE book_author
(
    id_author INTEGER NOT NULL,
    id_book INTEGER NOT NULL,

    CONSTRAINT book_author_pk PRIMARY KEY (id_author, id_book),

    CONSTRAINT book_author_author_id_author_fk
    FOREIGN KEY (id_author) REFERENCES author (id)
    ON DELETE NO ACTION ON UPDATE NO ACTION,

    CONSTRAINT book_author_book_id_book_fk
    FOREIGN KEY (id_book) REFERENCES book (id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
);
