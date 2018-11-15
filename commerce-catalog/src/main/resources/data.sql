insert into catalog(name) values('catalog_first');
insert into catalog(name) values('catalog_second');
insert into catalog(name) values('catalog_third');

insert into product(catalog_id, count, name, price)
        values(1, 101, 'product_11', 1);
insert into product(catalog_id, count, name, price)
        values(1, 102, 'product_12', 2);
insert into product(catalog_id, count, name, price)
        values(1, 103, 'product_13', 3);
insert into product(catalog_id, count, name, price)
        values(2, 210, 'product_21', 11);
insert into product(catalog_id, count, name, price)
        values(2, 221, 'product_22', 12);
insert into product(catalog_id, count, name, price)
        values(3, 3311, 'product_31', 111);