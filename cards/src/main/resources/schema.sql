DROP TABLE IF EXISTS cards;

CREATE TABLE cards (
   card_id INT NOT NULL AUTO_INCREMENT,
   card_number varchar(100) NOT NULL,
   customer_id INT NOT NULL,
   card_type varchar(100) NOT NULL,
   total_limit INT NOT NULL,
   amount_used INT NOT NULL,
   available_amount INT NOT NULL,
   create_dt date DEFAULT NULL,
   PRIMARY KEY (card_id)
);