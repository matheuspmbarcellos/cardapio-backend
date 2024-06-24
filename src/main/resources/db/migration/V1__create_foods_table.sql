CREATE TABLE IF NOT EXISTS foods (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    image VARCHAR(255),
    price INTEGER
);