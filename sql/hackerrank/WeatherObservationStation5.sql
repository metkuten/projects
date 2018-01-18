select *
from
    (   SELECT  UPPER(CITY),LENGTH(CITY)
        FROM STATION
        ORDER BY LENGTH(CITY) asc,city asc
     )
where rownum <=1;
select *
from
    (   SELECT  UPPER(CITY),LENGTH(CITY)
        FROM STATION
        ORDER BY LENGTH(CITY) desc,city desc
     )
where rownum <=1;