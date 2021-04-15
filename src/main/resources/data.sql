USE abcproduct;

INSERT INTO
 product(product_id, product_name, product_price)
VALUES
 (1,N'AAA自動車',1000),(2,N'BBB自動車',2000),(3,N'CCC自動車',3000),
 (4,N'DDD自動車',4000),(5,N'EEE自動車',5000),(6,N'FFF自動車',6000),
 (7,N'GGG自動車',7000),(8,N'HHH自動車',8000),(9,N'III自動車',9000), (10,N'JJJ自動車',9500)

INSERT INTO
 warehouse(warehouse_id, warehouse_name, warehouse_address)
VALUES
(9001,N'東京倉庫',N'東京都千代田区1-1-1'),(9002,N'横浜倉庫',N'神奈川横浜市2-2-2'),(9003,N'吉祥寺倉庫',N'東京都武蔵野市3-3-3')

INSERT INTO
 stock(product_id, warehouse_id, stock_count, stock_in, stock_out)
VALUES
(1,9001, 100, 'false', 'false'), (2,9002, 200,'false','false'), (3,9003, 300,'false','false'),
(4,9001, 150, 'false', 'false'), (5,9002, 250,'false','false'), (6,9003, 350,'false','false'),
(7,9001, 200, 'false', 'false'), (8,9002, 300,'false','false'), (9,9003, 400,'false','false'),
(10,9001, 250,'false','false')
