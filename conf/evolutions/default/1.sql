# --- First database schema

# --- !Ups


create table pedidos (
  id                        bigint not null,
  nombre                      varchar(255),
  orden                varchar(255),
  preferencia           varchar(255),
  precio                 bigint not null,
  
  
  constraint pk_pedidos primary key (id))
;

create sequence pedidos_seq start with 1000;





# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists pedidos;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists pedidos_seq;

