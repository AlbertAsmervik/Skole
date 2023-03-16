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


-------------------------------------------------------------------------------------------------

-- Oppg 4)
--        Lag en spørring som viser alle personer født mellom år 2000 og 2010 med et etternavn som begynner på "H". 
--           Listen skal være sortert på navn.

SELECT *
FROM Person
WHERE (YEAR(Fdato) >= 2000 AND YEAR(Fdato) <= 2010) AND Etternavn LIKE 'H%'
ORDER BY Fornavn;


-- Oppg 5)
--        Lag en spørring som viser alle modellfly.

SELECT * 
FROM Gave 
WHERE Navn LIKE 'Modellfly%';

 -- Oppg 6)
--        Lag en spørring som viser alle gaveønskene til person 23 (Ninni Bårdsen). 
--          Utskriften skal vise navnet på hver gave,sammen med prioritet og produksjonstid (prod_tid) for denne gaven. 
--             Vis gavene etter stigende prioritet.


SELECT Gave.Navn, Ønske.Prioritet, Gave.Prod_tid
FROM Gave INNER JOIN Ønske
  ON Gave.Gnr = Ønske.Gnr
WHERE Ønske.Pnr = 23
ORDER BY Ønske.Prioritet ASC;


--- Oppg 7)
--  Lag en spørring som viser hvilke deler som inngår i produksjonen av gave nr. 4, og hvor mange enheter av hver del. 
--    Ta med navn på hver enkelt del i utskriften.

SELECT Del.Dnr, Del.Navn, Oppbygging.Ant
FROM Del INNER JOIN Oppbygging
    ON Del.Dnr = Oppbygging.Dnr
Where Oppbygging.Gnr = 4; 

 



--- Oppg 8)
--  Lag en spørring som teller opp antall ønsker for personer med flere enn 7 ønsker. 
--    Spørreresultatet skal vise personnr, fornavn og etternavn i én kolonne, samt antall ønsker. 
--      Sorter utskriften etter fødselsår, de yngste først.




SELECT CONCAT(Person.Pnr, ' ', Person.Fornavn, ' ', Person.Etternavn) AS Navn, COUNT(Ønske.Ønr) AS AntallØnsker
FROM Person 
JOIN Ønske ON Person.Pnr = Ønske.Pnr
GROUP BY Person.Pnr, Person.Fornavn, Person.Etternavn
HAVING COUNT(Ønske.Ønr) > 7
ORDER BY Person.Fdato ASC;




--- Oppg 9)
--     Det er kommet inn en ønskeliste fra en person som ennå ikke er registrert i systemet. Listen inneholder tre ønsker. 
--         Skriv spørringer for å legge til personen og ønskelisten. 
--           Velg eksempeldata selv, men husk at primærnøkkel i ønskelisten er autonummerert. Tips: Dette må løses med flere spørringer.

INSERT INTO Person (Fornavn, Etternavn, Fdato)
VALUES ('Barack', 'Obama', '1961-04-08');

-- Sjekk personnr -->

INSERT INTO Ønske (Gnr, Prioritet, Pnr)
VALUES (1,1, 101);
INSERT INTO Ønske (Gnr, Prioritet, Pnr)
VALUES (9,2, 101);
INSERT INTO Ønske (Gnr, Prioritet, Pnr)
VALUES (4,3, 101);





--- Oppg 10)
--     Lag en spørring som viser hvor lang tid det vil ta å gjennomføre årets julegaveproduksjon, 
--     for å finne ut om alt vil være klart til jul. 
--       Vi antar at det til enhver tid er 8 nisser på jobb. 
--         Kolonnen prod_tid viser hvor mange minutter det tar for 1 nisse å gjøre ferdig ett eksemplar av denne gaven. 
--           Vi forenkler litt og antar at 2 nisser kan samarbeide perfekt og gjøre jobben på halve tiden, 
--           at 3 nisser kan gjøre jobben på en tredjedel av tiden osv. 
--              Vis svaret både i antall minutter og antall døgn avrundet oppover. 

SELECT CEILING ((SUM(Gave.prod_tid)/1440)/8) AS Dager, CEILING(SUM(Gave.prod_tid)/8) AS Minutter
FROM Ønske INNER JOIN Gave 
     ON Gave.Gnr = Ønske.Gnr;




--- Oppg 11)
-- Lag en spørring som gir en oversikt over de ulike gavene som har blitt ønsket og sumerer produksjonstiden til hver gave.
-- Ha med Gnr, Beskrivelse og (total) prod_tid.
-- Sorter utskriften etter de mest tidskrevende gavene først.

SELECT Gave.Gnr, Gave.Navn, SUM(Gave.Prod_tid) AS TotalProdTid
FROM Gave
JOIN Ønske ON Gave.Gnr = Ønske.Gnr
GROUP BY Gave.Gnr, Gave.Beskrivelse
ORDER BY SUM(Gave.Prod_tid) DESC;




--- Oppg 12)

-- En hjelpetabell koblet opp til ønske tabellens kolone 'Ferdig', som sier om statusen er ferdig eller ikke.
-- Note how weird Oppbygging table is