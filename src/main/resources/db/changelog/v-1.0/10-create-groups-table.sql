create table if not exists groops (
                       id int not null auto_increment,
                       group_name varchar(255) not null,
                       primary key (id)
) engine=InnoDB

GO



alter table groops
    add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (group_name)

GO


INSERT groops (group_name) VALUES
                         ('23-03'),
                         ('22-02');

GO

