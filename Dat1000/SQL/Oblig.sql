CREATE TABLE IF NOT EXISTS Gave (
     Gnr      INT NOT NULL AUTO_INCREMENT,
     Navn     VARCHAR(45) UNIQUE,
     Prod_tid INT NOT NULL,
     PRIMARY KEY (Gnr)
     );



CREATE TABLE IF NOT EXISTS Del (
   Dnr       INT NOT NULL AUTO_INCREMENT,
   Navn      VARCHAR(45),
   Lager_ant INT NOT NULL,
   PRIMARY KEY (Dnr)
   );


CREATE TABLE IF NOT EXISTS  Person (
   Pnr        INT NOT NULL AUTO_INCREMENT,
   Fornavn    VARCHAR(45) ,
   Etternavn  VARCHAR(45) ,
   Fdato      DATE,
   PRIMARY KEY (Pnr)
   );



CREATE TABLE IF NOT EXISTS Oppbygging (
      Gnr      INT NOT NULL,
	Dnr      INT NOT NULL,
      Ant      INT,
      Primary KEY (Gnr, Dnr)  
      );

ALTER TABLE Oppbygging
ADD FOREIGN KEY (Gnr) REFERENCES  Gave (Gnr);
ALTER TABLE Oppbygging
ADD FOREIGN KEY (Dnr) REFERENCES   Del (Dnr);





CREATE TABLE IF NOT EXISTS Ønske (
   Ønr        INT NOT NULL AUTO_INCREMENT,
   Pnr        INT NOT NULL,
   Gnr        INT NOT NULL,
   Prioritet  INT,
   Ferdig     INT,
   PRIMARY KEY (Ønr)
   );

ALTER TABLE Ønske
ADD FOREIGN KEY (Pnr) REFERENCES Person(Pnr);
ALTER TABLE Ønske
ADD FOREIGN KEY (Gnr) REFERENCES Gave  (Gnr);