
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(400) not null,
    fecha_creacion date not null,
    status tinyint not null,

    primary key(id)

);