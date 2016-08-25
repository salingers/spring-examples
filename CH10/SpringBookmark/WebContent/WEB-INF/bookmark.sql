create database bookmarks;
use bookmarks;

create table user  (
  id INT(11) NOT NULL auto_increment PRIMARY KEY,
  username varchar(16),
  passwd char(16) not null,
  email varchar(100) not null
);

create table bookmark (
  id INT(11) NOT NULL auto_increment PRIMARY KEY,
  username varchar(16) not null,
  bm_URL varchar(255) not null
);

grant select, insert, update, delete
on bookmarks.*
to bm_user@localhost identified by 'password';