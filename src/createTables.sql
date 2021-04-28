-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS shop;
CREATE DATABASE shop;
-- -----------------------------------------------------------------------------
-- - Construction de la table des marchands                               ---
-- -----------------------------------------------------------------------------

CREATE TABLE merchant(idMerchant INT NOT NULL PRIMARY KEY,
                      create_date TIMESTAMP,
                      name VARCHAR(128),
                      lastname VARCHAR(128),
                      birthdate DATE);
-- -----------------------------------------------------------------------------
-- - Construction de la table des produits                               ---
-- -----------------------------------------------------------------------------

CREATE TABLE product(idProduct INT NOT NULL PRIMARY KEY,
                     create_date TIMESTAMP,
                     label VARCHAR(256),
                     unit_price DECIMAL(10,2),
                     currency VARCHAR(64),
                     weight DECIMAL(10,2),
                     height DECIMAL(10,2));
-- -----------------------------------------------------------------------------
-- - Construction de la table d'association marchands/produits                              ---
-- -----------------------------------------------------------------------------

CREATE TABLE product_merchant_association(idProduct INT NOT NULL REFERENCES product(idProduct),
                                          idMerchant INT NOT NULL REFERENCES merchant(idMerchant),
                                          association_date TIMESTAMP,
                                          PRIMARY KEY (idProduct,idMerchant,association_date),
                                          FOREIGN KEY(idProduct) REFERENCES product(idProduct),
                                          FOREIGN KEY(idMerchant) REFERENCES merchant(idMerchant));
-- -----------------------------------------------------------------------------
-- - Construction de la table des adresses                               ---
-- -----------------------------------------------------------------------------

CREATE TABLE address(id INT NOT NULL PRIMARY KEY,
                     number INT,
                     street VARCHAR(128),
                     zipcode VARCHAR(64),
                     merchant_id INT NOT NULL,
                     FOREIGN KEY(merchant_id) REFERENCES merchant(idMerchant));