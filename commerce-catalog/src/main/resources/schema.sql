create table catalog (
   id bigint generated by default as identity,
    name varchar(255),
    primary key (id)
);

create table product (
   id bigint generated by default as identity,
    count integer,
    name varchar(255),
    price integer,
    catalog_id bigint not null,
    primary key (id)
);

alter table product
   add constraint FK8oaejqr5kmuivpskpr3fxcg1m
   foreign key (catalog_id)
   references catalog