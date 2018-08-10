# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigserial not null,
  user_nm                       varchar(255) not null,
  email                         varchar(255) not null,
  password                      varchar(255) not null,
  del_flg                       integer not null,
  create_date                   timestamp not null,
  update_date                   timestamp not null,
  constraint uq_user_user_nm unique (user_nm),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists user cascade;

