CREATE SEQUENCE country_seq START WITH 1;
create table country (
    id numeric(5) primary key,
    name varchar(100) not null,
    country_code varchar(5) not null UNIQUE,
    PHONE_CODE varchar(5) not null UNIQUE
);

CREATE SEQUENCE client_seq START WITH 1;
create table client (
    id numeric(20) primary key,
    name varchar(100) not null,
    active boolean not null,
    birth date,
    country_id numeric(5) references country(id)
);

CREATE SEQUENCE contact_seq START WITH 1;
create table contact (
    id numeric(20) primary key,
    type varchar(30) not null,
    contact_value varchar(200),
    country_id numeric(5) references country(id),
    phone_number numeric(20),
    extension numeric(5),
    client_id numeric(20) not null references client(id)
);

CREATE SEQUENCE address_seq START WITH 1;
create table address (
    id numeric(20) primary key,
    type varchar(30) not null,
    address varchar(300),
    number varchar(10),
    complement varchar(50),
    city varchar(100),
    country_id numeric(5) references country(id),
    zipcode varchar(30),
    client_id numeric(20) not null references client(id)
);