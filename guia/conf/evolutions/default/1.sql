# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoria (
  id                        bigint not null,
  descricao                 varchar(255),
  constraint pk_categoria primary key (id))
;

create sequence categoria_seq;




# --- !Downs

drop table if exists categoria cascade;

drop sequence if exists categoria_seq;

