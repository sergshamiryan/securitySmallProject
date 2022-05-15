INSERT IGNORE INTO `spring`.`user` (`id`, `username`, `password`,
`algorithm`) VALUES ('1', 'john', '$2a$12$mCZ8nmCAB7TQECNiJu99tOBJCxPWsvJRyxng7wiOs.YdZ9L65r8hS', 'BCRYPT');
INSERT IGNORE INTO `spring`.`authority` (`id`, `name`, `user`) VALUES ('1',
'READ', '1');
INSERT IGNORE INTO `spring`.`authority` (`id`, `name`, `user`) VALUES ('2',
'WRITE', '1');
INSERT IGNORE INTO `spring`.`product` (`id`, `name`, `price`, `currency`)
VALUES ('1', 'Chocolate', '10', 'USD');

/*
For user John, the password is hashed using bcrypt. The raw password is 12345.

 */