INSERT INTO t_permission (role)
VALUES
    ('ROLE_ADMIN'),
    ('ROLE_USER');


INSERT INTO t_users (email, full_name, password)
VALUES
    ('ilyas@gmail.com', 'Ilyas', '$2a$10$Hm3SiQj0ARgdFvCOrPvgSuk6t/0nU2bGQysD8EgO6YicvMbZTwqt6');


INSERT INTO t_users_permissions (user_id, permissions_id)
VALUES
    (1,1);


INSERT INTO t_products (name, description, price)
VALUES
    ('Курица', 'Мясо кур (бедренная и берцовая кость прилегающей к ней мякотью), кг', '1232'),
    ('Говядина', 'Говядина (лопаточно-грудная часть с костями), кг', '2386'),
    ('Мука', 'Мука пшеничная первого сорта, кг', '241'),
    ('Хлеб', 'Хлеб пшеничный из муки первого сорта (формовой). 0.4 кг', '185'),
    ('Рожки', 'Рожки (весовые), кг', '315'),
    ('Яйца', 'Яйцо куриное (I категория), 10 шт', '493'),
    ('Гречка', 'Крупа гречневая (ядрица, весовая), кг', '431'),
    ('Рис', 'Рис шлифованный (круглозерный, весовой), кг', '404'),
    ('Сахар', 'Сахар-белый (песок), кг', '442'),
    ('Подсолнечное масло', 'Масло подсолнечное', '873'),
    ('Сливочное масло', 'Масло сливочное (несоленое, не менее 72,5% жирности, без наполнителей и растительных жиров), кг', '1694'),
    ('Молоко', 'Молоко пастеризованное 2,5% жирности в мягкой упаковке
', '221'),
    ('Кефир', 'Кефир 2,5% жирностей в мягкой упаковке', '397'),
    ('Творог', 'Творог: 5–9 % жирности, кг', '2009'),
    ('Картофель', 'Картофель, кг', '155'),
    ('Лук', 'Лук репчатый, кг', '181'),
    ('Капуста', 'Капуста белокочанная, кг', '119'),
    ('Морковь', 'Морковь столовая, кг', '151'),
    ('Соль', 'Соль поваренная пищевая (кроме ""Экстра""), кг', '65');

INSERT INTO t_pricelist (name, price, product)
VALUES
    ('Магнум', '240', 'Хлеб');
