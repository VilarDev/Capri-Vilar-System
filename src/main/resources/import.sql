-- TABELAS BASE (mantidas iguais)
INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua das Cabras', 'São Paulo', 'SP', '01000-000', 'Brasil');
INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Avenida Central', 'Rio de Janeiro', 'RJ', '22000-000', 'Brasil');
INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua da Fazenda', 'Belo Horizonte', 'MG', '31000-000', 'Brasil');

INSERT INTO owners (name, email, address_id) VALUES ('Alberto Vilar', 'albertovilar1@email.com', 1);
INSERT INTO owners (name, email, address_id) VALUES ('Maria Oliveira', 'maria@email.com', 2);
INSERT INTO owners (name, email, address_id) VALUES ('Carlos Souza', 'carlos@email.com', 3);

INSERT INTO goat_farms (name, tod, address_id, owner_id) VALUES ('Capril Vilar', 'CAPV-2023', 1, 1);

INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('11987654321', 1, 1);
INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('1133224455', 2, 1);

-- BISAVÓS MATERNOS (com números originais)
INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1403110395', 'NATAL DO JACOMÉ', 'MALE', 'Alpina', 'Indefinida', '2010-01-01', 'ATIVO', 'TR-16422', 'TL-16423', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1650112018', '12018 CAPRIMEL', 'FEMALE', 'Alpina', 'Indefinida', '2012-01-01', 'ATIVO', 'TR-16424', 'TL-16425', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('2104406006', 'HERE DO ANGICANO', 'MALE', 'Alpina', 'Indefinida', '2006-01-01', 'ATIVO', 'TR-16426', 'TL-16427', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('2114510040', 'TOPÁZIO DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2010-01-01', 'ATIVO', 'TR-16428', 'TL-16429', 'PO', NULL, NULL, 1);

-- AVÓS PATERNOS
INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1422915618', 'PETRÓLEO CAPRIVAMAR', 'MALE', 'Alpina', 'Indefinida', '2015-01-01', 'ATIVO', 'TR-16430', 'TL-16431', 'PO', '1403110395', '1650112018', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1422913470', 'BÉLGICA DA CAPRIVAMAR', 'FEMALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16432', 'TL-16433', 'PO', '2104406006', '2114510040', 1);

-- AVÓS MATERNOS
INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1650113018', 'JOSA CAPRIMEL', 'MALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16434', 'TL-16435', 'PO', '1403110395', '1650112018', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('2114513061', 'PANTALONA DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16436', 'TL-16437', 'PO', '2104406006', '2114510040', 1);

-- PAIS
INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1635717065', 'C.V.C SIGNOS PETROLEO', 'MALE', 'Alpina', 'Indefinida', '2017-01-01', 'ATIVO', 'TR-16438', 'TL-16439', 'PO', '1422915618', '1422913470', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('2114517012', 'NAIDE DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2017-01-01', 'ATIVO', 'TR-16440', 'TL-16441', 'PO', '1650113018', '2114513061', 1);

-- FILHOS (COM NÚMEROS ORIGINAIS)
INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1643218012', 'XEQUE V DO CAPRIL VILAR', 'MALE', 'Alpina', 'CHAMOISÉE', '2018-06-27', 'ATIVO', 'TR-16442', 'TL-16443', 'POT', '1635717065', '2114517012', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('1643218013', 'IRMÃO DO XEQUE', 'FEMALE', 'Alpina', 'CHAMOISÉE', '2020-01-01', 'ATIVO', 'TR-16444', 'TL-16445', 'POT', '1635717065', '2114517012', 1);