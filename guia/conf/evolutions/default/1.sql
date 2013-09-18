# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoria (
  id                        bigint not null,
  descricao                 varchar(255),
  constraint pk_categoria primary key (id))
;

create table usuario (
  id                        bigint not null,
  nome                      varchar(255),
  email                     varchar(255),
  login                     varchar(255),
  senha                     varchar(255),
  constraint pk_usuario primary key (id))
;

create sequence categoria_seq;

create sequence usuario_seq;




# --- !Downs

drop table if exists categoria cascade;

drop table if exists usuario cascade;

drop sequence if exists categoria_seq;

drop sequence if exists usuario_seq;

