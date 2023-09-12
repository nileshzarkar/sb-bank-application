DROP TABLE IF EXISTS loans;

CREATE TABLE loans(
   loan_number INT NOT NULL AUTO_INCREMENT ,
   customer_id INT NOT NULL,
   start_dt date NOT NULL,
   loan_type varchar(100) NOT NULL,
   total_loan INT NOT NULL,
   amount_paid INT NOT NULL,
   outstanding_amount  INT NOT NULL,
   create_dt date DEFAULT NULL,
   PRIMARY KEY (loan_number)
   );
