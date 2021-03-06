create database [FU_DB]
go
USE [FU_DB]
GO
/****** Object:  Table [dbo].[Stocks]    Script Date: 8/26/2020 5:32:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stocks](
	[StockID] [int] NULL,
	[StockName] [nvarchar](max) NULL,
	[Address] [nvarchar](max) NULL,
	[DateAvailable] [date] NULL,
	[Note] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
