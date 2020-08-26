# Use-batch-update-in-JDBC


LAB221 Assignment	Type:	Short Assignment
	Code:	J2.S.P0117

	LOC:	100
	Slot(s):	2

Title
	Use batch update in JDBC
Background Context
Batch processing is the execution of a series of programs ("jobs") on a computer without manual intervention.
Jobs are set up so they can be run to completion without human interaction. All input parameters are predefined throughscripts, command-line arguments, control files, or job control language. This is in contrast to "online" or interactive programs which prompt the user for such input. A program takes a set of data files as input, processes the data, and produces a set of output data files. This operating environment is termed as "batch processing" because the input data are collected into batches or sets of records and each batch is processed as a unit. The output is another batch that can be reused for computation

Program Specifications
Create a program to update data using transaction in JDBC. The First, student should login MS SQL to create a database name “FU_DB” in MS SQL, then student creates a table name “Stocks” with fields:
-	StockID: type is integer
-	StockName: string
-	Address: string
-	DateAvailable: Date
-	Note: string
Main functions described as below:

Function details:

1.	Generate data and display on the dialog
2.	Use JDBC to insert those data into “Stocks” table (must use batch update technic)
Expectation of User interface:
The screen should be as:

 ![image](https://user-images.githubusercontent.com/48720792/91314614-f35efa80-e7e0-11ea-9c85-c0eebbd9aa4e.png)

Data on the form is generated, when click “Insert to DB” button the data will be store in the database


