Polimorfizmus

Úgy is fogalmazhatunk, hogy Többalakúság, egy azon objektum többfélének látszódhat
Ha van egy Macsak objektumunk ami az Allat osztály leszármazottja, akkor ezt úgy is megfogalmazhatjuk,
hogy minden Macska egyfajta Allat. Ez abban nyilvánul meg, hogy a Macska objektumra rámutathatunk
Allat típusú referenciával is.

Gyakorlás (ezt órán elkészítettük)

1) Öröklés
   Allat, Macska, Kutya példa
2) Interface
  Tigris, Ragadozo példa

Interface-k, polimorfizmus gyakorlása 

A, Készítsen egy Szemely osztályt
   -legyen vezetekNev, keresztNev, eletkor adattagja (getter/setter)
   -legyen egy getInformaciok abstract metódusa, amely egy Sting-et ad vissza

B, Készítsen egy IVasarlo(vagy VasarloInterface) nevú interface-t
   -legyen kosarbaRak(Termek termek), kosarbolKivesz(Termek termek) metódusa
   JÓ VOLT AZ ÉSZREVÉTEL, EZT A KETTŐ METÓDUS A KOSÁRBAN KELLENE MEGVALÓSÍTANI (EGYSÉGBEZÁRÁS)
     IKosar interface
     -legyen kosarbaRak(Termek termek), kosarbolKivesz(Termek termek) metódusa

C, Készítsen egy Vasarlo osztályt, amely a Szemely osztály kiterjesztése (és megvalósítja IVasarlo interface-t) EGYSÉGBEZÁRÁS
   -legyen emailCim, szallitasiCim, Kosar adattagja (getter/setter)
   (-legyenek implementálva az interface metódusai) EGYSÉGBEZÁRÁS

D, Készítsen egy Kosar osztályt valósítsa meg az IKosar interface-t
   -lehessen a (Vasarlo osztály) kosarbaRak metódusával a kosárba termékeket tenni max 10 db-ot
   -lehessen a (Vasarlo osztály) kosarbolKivesz metódusával a kosárból kivenni terméket

E, Ha eddig nem tetted volna meg készíts egy Termek osztályt
   -legyen megnevezes, ar, suly adattagja (getter/setter, konstruktor)
   
HáziFeladat (erősen ajánlott)
Az órán elkészített feladat folytatása az alábbi pontokkal
Ha bármi kérdés van, írjatok!!!
 
 A, Készítsünk egy Ugyintézo osztályt, amely a Szemely osztaly leszarmazottja
    -legyen telefonszam, emailCim adattagja
    -legyen konstruktora, getterek/setterek
    -legyen egy kiir metódusa ami kiirja az ügyintéző adatati

 B, Irassuk ki a webáruház összes személyének az alábbi adatatit egyetlen egy for ciklust felhasználva
    (a Szemely osztályt kell használni - polimorfizmus)
    -készítsünk egy tömböt és abba tároljuk a felhasználókat, majd azt irassuk ki, pl:
      " Felhasználó neve:      Dandi Roland"
      "             életkora:  29          "

 C, Mivel a vásárlónak is van emailCim adattagja és az ügyintézőnek is, ezért ezt helyezzük át a
    Szemely osztályba
    -egészítsd ki a konstruktort és vegyél fel getter/setter-ket
    (az Ugyintezo és a Vasarlo osztályból távolítsd el az emailCim adattagot)

 D, Alakítsuk át a B pontban elkészített kiirást, úgy hogy az email címet is kiirja.


