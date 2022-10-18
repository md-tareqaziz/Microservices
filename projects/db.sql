create table project
(
    id serial not null
        constraint project_pk
            primary key,
    name varchar,
    org varchar,
    employee varchar
);

