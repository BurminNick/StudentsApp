create table if not exists students(
                                id int not null auto_increment,
                                name varchar(255) not null,
                                date date,
                                group_id int,
                                primary key (id)
) engine=InnoDB

GO

alter table students
    add constraint FKtpkopyby8qwu1noj4n4t3yuig
        foreign key (group_id)
            references groops (id)

GO

INSERT students (name, date, group_id) VALUES
                         ('Иван Иванов', '2023-02-01', 1),
                         ('Петр Петров', '2023-03-01', 1),
                         ('Сидор Сидоров', '2023-04-01', 1),
                         ('Анна Михайловна', '2023-05-01', 2),
                         ('Николай Николаев', '2023-06-01', 2);

GO