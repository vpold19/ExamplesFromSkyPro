--liquibase formatted sql

--changeset vadimp:1
CREATE TABLE users(
id SERIAL,
email TEXT
)

--changeset vadimp:2
ALTER TABLE users
ADD COLUMN name TEXT;

-- changeset vadimp3:
CREATE INDEX users_name_index ON users(name);