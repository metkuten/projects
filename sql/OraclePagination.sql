select * from
(
    select    ent.*,rownum r
    from    ENTITLEMENT ent
)
where r >1 and r<4;

//OR
select * from
(
    select    ent.*,rownum r
    from    ENTITLEMENT ent
)
where r between 2 and 4;