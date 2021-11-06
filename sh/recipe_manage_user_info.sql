create table user_info
(
    id          int auto_increment
        primary key,
    uid         varchar(32)                               not null,
    username    varchar(32)                               not null,
    password    varchar(32) default ''                    null,
    role_id     varchar(32)                               null comment '1买家2卖家',
    status      varchar(32)                               null,
    create_time datetime    default CURRENT_TIMESTAMP     not null comment '创建时间',
    update_time datetime    default '1970-01-01 00:00:00' not null on update CURRENT_TIMESTAMP comment '修改时间',
    nick        varchar(255)                              null,
    avatar      varchar(255)                              null,
    constraint user_info_uid_index
        unique (uid),
    constraint user_info_uname_unique
        unique (username)
);

create index user_info_u_p_index
    on user_info (username, password);

INSERT INTO recipe_manage.user_info (id, uid, username, password, role_id, status, create_time, update_time, nick, avatar) VALUES (1, '20887298731', 'admin', '1234', null, 'VALID', '2019-02-05 09:38:58', '2019-03-02 11:05:11', 'admin', 'https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png');