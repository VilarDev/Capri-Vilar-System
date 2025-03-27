INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua das Cabras', 'São Paulo', 'SP', '01000-000', 'Brasil');
INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Avenida Central', 'Rio de Janeiro', 'RJ', '22000-000', 'Brasil');
INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua da Fazenda', 'Belo Horizonte', 'MG', '31000-000', 'Brasil');

INSERT INTO owners (name, email, address_id) VALUES ('Alberto Vilar', 'albertovilar1@email.com', 1);
INSERT INTO owners (name, email, address_id) VALUES ('Maria Oliveira', 'maria@email.com', 2);
INSERT INTO owners (name, email, address_id) VALUES ('Carlos Souza', 'carlos@email.com', 3);

INSERT INTO goat_farms (name, tod, address_id, owner_id) VALUES ('Capril Vilar', 'CAPV-2023', 1, 1);

INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('11987654321', 1, 1);
INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('1133224455', 2, 1);

-- Inserção de cabras BISAVÓS MATERNOS

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2010-001', 'NATAL DO JACOMÉ', 'MALE', 'Alpina', 'Indefinida', '2010-01-01', 'ATIVO', 'TR-16422', 'TL-16423', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2012-002', '12018 CAPRIMEL', 'FEMALE', 'Alpina', 'Indefinida', '2012-01-01', 'ATIVO', 'TR-16424', 'TL-16425', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2006-003', 'HERE DO ANGICANO', 'MALE', 'Alpina', 'Indefinida', '2006-01-01', 'ATIVO', 'TR-16426', 'TL-16427', 'PO', NULL, NULL, 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2010-004', 'TOPÁZIO DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2010-01-01', 'ATIVO', 'TR-16428', 'TL-16429', 'PO', NULL, NULL, 1);

-- Inserção de cabras AVÓS PATERNOS

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2015-005', 'PETRÓLEO CAPRIVAMAR', 'MALE', 'Alpina', 'Indefinida', '2015-01-01', 'ATIVO', 'TR-16430', 'TL-16431', 'PO', 'GO-2010-001', 'GO-2012-002', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2013-006', 'BÉLGICA DA CAPRIVAMAR', 'FEMALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16432', 'TL-16433', 'PO', 'GO-2006-003', 'GO-2010-004', 1);

-- Inserção de cabras AVÓS MATERNOS

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2013-007', 'JOSA CAPRIMEL', 'MALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16434', 'TL-16435', 'PO', 'GO-2010-001', 'GO-2012-002', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2013-008', 'PANTALONA DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2013-01-01', 'ATIVO', 'TR-16436', 'TL-16437', 'PO', 'GO-2006-003', 'GO-2010-004', 1);

-- Inserção de cabras PAIS

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2017-009', 'C.V.C SIGNOS PETROLEO', 'MALE', 'Alpina', 'Indefinida', '2017-01-01', 'ATIVO', 'TR-16438', 'TL-16439', 'PO', 'GO-2015-005', 'GO-2013-006', 1);

INSERT INTO goats (registration_number, name, gender, breed, color, birth_date, status, tag_right_ear, tag_left_ear, category, father_id, mother_id, goat_farm_id) VALUES('GO-2017-010', 'NAIDE DO CRS', 'FEMALE', 'Alpina', 'Indefinida', '2017-01-01', 'ATIVO', 'TR-16440', 'TL-16441', 'PO', 'GO-2013-007', 'GO-2013-008', 1);
