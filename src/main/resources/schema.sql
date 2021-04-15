USE abcproduct;

DROP TABLE product;

CREATE TABLE product(
    [product_id] [INT] NOT NULL PRIMARY KEY,
    [product_name] [NVARCHAR](50),
    [product_price] [INT]
)

DROP TABLE warehouse;

CREATE TABLE warehouse(
    [warehouse_id] [INT] NOT NULL PRIMARY KEY,
    [warehouse_name] [NVARCHAR](50) NOT NULL,
    [warehouse_address] [NVARCHAR](100) NOT NULL
)

DROP TABLE stock;

CREATE TABLE stock(
    [product_id] [INT] NOT NULL,
    [warehouse_id] [INT] NOT NULL,
    [stock_count] [INT] NOT NULL,
    [stock_in] [BIT],
    [stock_out] [BIT]
)