/* vis alle etternavn, og stillingene deres */
Select Etternavn, Stilling
FROM Ansatt;

/* vis alle ansatte */
SELECT *
FROM Ansatt

/* vis de som tjener over 500,000 */
SELECT * 
FROM Ansatt
WHERE Lønn > 500000;


/* vis programmere som tjener over 500,000 */
SELECT * 
FROM Ansatt 

WHERE Lønn > 500000 AND Stilling = programmerer;


/* Vis tittel på filmer med aldersgrense lik 7år */
SELECT tittel
FROM film 
WHERE alder = 7 ;

/* Vis titler på filmer produsert før 1990 i USA og norge. Sorter med hensys på produksjonsåret*/

SELECT tittel
FROM film 
WHERE (land = USA) AND (land = Norge)
ORDER BY ÅR ;

/* vis mndlønn, avrundet */
SELECT *, ROUND(Lønn/12,2)  AS MndLønn
FROM Ansatt;