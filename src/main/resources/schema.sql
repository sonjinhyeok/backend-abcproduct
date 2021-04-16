IF NOT EXISTS (SELECT * FROM master.dbo.sysdatabases WHERE name='abcproduct')
	CREATE DATABASE abcproduct;

USE abcproduct;

IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='info' AND xtype='U')
	CREATE TABLE info(
		[product_id] [INT] NOT NULL PRIMARY KEY,
		[product_name] [NVARCHAR](50),
		[product_price] [INT],
		[stock_count] [INT],
		[warehouse_name] [NVARCHAR](50)
	)

IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='product' AND xtype='U')
	CREATE TABLE product(
    	[product_id] [INT] NOT NULL PRIMARY KEY,
	    [product_name] [NVARCHAR](50) NOT NULL,
    	[product_price] [INT]
	)

IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='warehouse' AND xtype='U')
	CREATE TABLE warehouse(
    	[warehouse_id] [INT] NOT NULL PRIMARY KEY,
	    [warehouse_name] [NVARCHAR](50) NOT NULL,
    	[warehouse_address] [NVARCHAR](100) NOT NULL
	)

IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='stock' AND xtype='U')
	CREATE TABLE stock(
    	[product_id] [INT] NOT NULL,
    	[warehouse_id] [INT] NOT NULL,
	    [stock_count] [INT] NOT NULL,
    	[stock_in] [BIT],
	    [stock_out] [BIT]
	)