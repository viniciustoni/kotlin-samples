-- Insert into country table
insert into country (id, name, country_code) 
  values(nextval('country_seq'), 'Brazil', '+55');
insert into country (id, name, country_code) 
  values(nextval('country_seq'), 'Poland', '+48');
insert into country (id, name, country_code) 
  values(nextval('country_seq'), 'Ukraine', '+380');
insert into country (id, name, country_code) 
  values(nextval('country_seq'), 'USA', '+1');

-- Insert into client table
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Vinicius Antonio Gai_Pageable', to_date('19881112','YYYYMMDD'), true, 1);
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Frédéric Chopin_Pageable', to_date('18100301','YYYYMMDD'), true, 2);
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Jerzy Kosiński_Pageable', null, true, 2);
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Marie Bashkirtseff_Pageable', null, false, 3);
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Angelo_Pageable', null, true, null);
insert into client (id, name, birth, active, country_id)
  values (nextval('client_seq'), 'Will Smith_Pageable', to_date('19680925','YYYYMMDD'), false, 4);

-- Insert into Address
insert into address(id, type, address, number, complement, zipcode, city, country_id, client_id)
  values (nextval('address_seq'), 'HOME', 'Ul. Grzegorzecka', '456', '10', '31559', 'Krakow', 2, 1);
insert into address(id, type, address, number, complement, zipcode, city, country_id, client_id)
  values (nextval('address_seq'), 'HOME', 'Rua Zuma de sa fernandes', '180', null, '8149000', 'Sao Paulo', 1, 1);
insert into address(id, type, address, number, complement, zipcode, city, country_id, client_id)
  values (nextval('address_seq'), 'WORK', 'Puszkarska', '7K', '7th floor', '30644', 'Krakow', 2, 1);

-- Insert into contact
insert into contact (id, type, contact_value, country_id, phone_number, extension, client_id) 
  values (nextval('contact_seq'), 'EMAIL', 'mypresentation@presentation.com', null, null, null, 1);
insert into contact (id, type, contact_value, country_id, phone_number, extension, client_id) 
  values (nextval('contact_seq'), 'CELLPHONE', null, 2, 456465484, null, 1);