/* Ikke bruke denne, kryssprodukt */ 
SELECT *
FROM Kunde, ordre;
/* Likekobling = INNER JOIN NOTASJON
kun interessante kolonner */ 
SELECT Ordre.*, Kunde.Etternavn
FROM Kunde INNER JOIN Ordre
	ON Kunde.KNr = Ordre.KNr;
/* hva med 3 tabeller? */ 
SELECT Ordre.*, Kunde.Etternavn
FROM Kunde INNER JOIN Ordre
	ON Kunde.KNr = Ordre.KNr and Ordre.Ordrenr = OrdreLinje.OrdreNr;
/* finne ut hvilke tabeller vi skal se i først, list opp FROM først */ 
SELECT Ordre.*, Kunde.Etternavn
FROM OrdreLinje INNER JOIN
    (Kunde INNER JOIN Ordre
	ON Kunde.KNr = Ordre.KNr and Ordre.Ordrenr = OrdreLinje.OrdreNr)
    on Ordre.OrdreNr = OrdreLinje.OrdreNr ;
/* */ 
SELECT AVG(LØNN) AS SnittLønn
FROM Ansatt

/* */ 
SELECT AVG(LØNN) AS SnittLønn for programmerer
FROM Ansatt
Where Stilling = Programmerer;


/*  finn gjennomsnittslønn for hver stillings kategori*/ 
Select Stilling, AVG(Lønn)
FROM Ansatt
GROUP BY Stilling;
/* */ 
/* */ 
/* Snittpris av varer som koster over 100kr
i varekategorier med flere enn 10 varer
ta med antall varer også
Sorter mhp. snittpris. De dyreste først! */ 
SELECT KatNr, AVG(pris) as Snittpris, COUNT(*) AS Antallvarer
FROM Vare
Where Pris > 100 
GROUP BY KatNr
HAVING COUNT(*) > 10
ORDER BY AVG(Pris) DESC;
/*
  KATNR      Snittpris     Antallvarer 
    2           237             17
    7           103             12
    9           147
    Ikke denne
    9           139             8
    */ 


    Vis hele Vare-tabellen, men erstatt katnr med navn på kategorien.

select vare.*, 




/* 
Oppgave 1.
In select i chose wich coloumns i wanna show, 
in FROM i choose wich tables i wanna join
in ON i find the link between the tables, and chose that i want to show the category instead of katnr
*/
SELECT Vnr, Betegnelse, Pris, Antall, Hylle, Kategori.Navn
FROM Kategori 	INNER JOIN Vare
	ON Kategori.Katnr = Vare.KatNr;