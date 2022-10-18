create table employee
(
    id serial not null,
    name varchar,
    salary double precision,
    projects text
);

create unique index employee_id_uindex
	on employee (id);

alter table employee
    add constraint employee_pk
        primary key (id);

