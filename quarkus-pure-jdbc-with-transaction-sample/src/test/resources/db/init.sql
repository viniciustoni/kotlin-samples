create sequence if not exists client_seq;
create table if not exists client
(
    id         bigint PRIMARY KEY not null DEFAULT nextval('client_seq'),
    name       varchar(50)        not null,
    created_on timestamptz        not null,
    updated_on timestamptz        not null
);