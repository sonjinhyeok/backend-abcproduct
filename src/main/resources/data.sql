USE abcproduct;

DELETE FROM stock;
INSERT INTO
 stock(product_id, warehouse_id, stock_count, stock_in, stock_out)
VALUES
(1, 9001, 100, 'false', 'false'), (2, 9002, 200,'false','false'), (3, 9003, 300,'false','false'),
(4, 9001, 150, 'false', 'false'), (5, 9002, 250,'false','false'), (6, 9003, 350,'false','false'),
(7, 9001, 200, 'false', 'false'), (8, 9002, 300,'false','false'), (9, 9003, 400,'false','false'),
(10, 9001, 250,'false','false'),(11, 9002, 100, 'false', 'false'), (12, 9003, 200,'false','false'),
(13, 9001, 300,'false','false'),(14, 9002, 150, 'false', 'false'), (15, 9003, 250,'false','false'),
(16, 9001, 350,'false','false'),(17, 9002, 200, 'false', 'false'), (18, 9003, 300,'false','false'),
(19, 9001, 400,'false','false'),(20, 9002, 100, 'false', 'false'), (21, 9003, 200,'false','false'),
(22, 9001, 450,'false','false'),(23, 9002, 150, 'false', 'false'), (24, 9003, 250,'false','false'),
(25, 9001, 500,'false','false'),(26, 9002, 200, 'false', 'false'), (27, 9003, 300,'false','false'),
(28, 9001, 550,'false','false'),(29, 9002, 100, 'false', 'false'), (30, 9003, 200,'false','false')


DELETE FROM product;
INSERT INTO
 product(product_id, product_name, product_price)
VALUES
 (1,N'AAA自動車',1000),(2,N'BBB自動車',1500),(3,N'CCC自動車',2000),(4,N'DDD自動車',2500),(5,N'EEE自動車',3000),
 (6,N'FFF自動車',3500),(7,N'GGG自動車',4000),(8,N'HHH自動車',4500),(9,N'III自動車',5000), (10,N'JJJ自動車',5500),
 (11,N'KKK自動車',6500),(12,N'LLL自動車',7000),(13,N'MMM自動車',8000),(14,N'NNN自動車',8500), (15,N'OOO自動車',9000),
 (16,N'PPP自動車',9500),(17,N'OOO自動車',10000),(18,N'PPP自動車',10500),(19,N'QQQ自動車',11000), (20,N'RRR自動車',11500),
 (21,N'SSS自動車',12000),(22,N'TTT自動車',12500),(23,N'UUU自動車',13000),(24,N'VVV自動車',13500), (25,N'WWW自動車',14000),
 (26,N'XXX自動車',14500),(27,N'YYY自動車',15000),(28,N'ZZZ自動車',15500),(29,N'ABC自動車',16000), (30,N'DEF自動車',16500)

DELETE FROM warehouse;
INSERT INTO
 warehouse(warehouse_id, warehouse_name, warehouse_address)
VALUES
(9001,N'東京倉庫',N'東京都千代田区1-1-1'),
(9002,N'横浜倉庫',N'神奈川横浜市2-2-2'),
(9003,N'吉祥寺倉庫',N'東京都武蔵野市3-3-3')
