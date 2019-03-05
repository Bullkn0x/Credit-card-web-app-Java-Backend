<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Orbitron"
	rel="stylesheet">
<meta charset="UTF-8">
<link rel="stylesheet" href="./style.css" type="text/css">
<title>Credit Card Portal</title>
</head>
<style></style>
<body>
	<p>Credit Card System</p>

	<br>
	<br>
	<br>
	<br>

	<h3>
		Get All transactions in a given <b>zip code</b> for a <b>given
			month</b>
	</h3>
	<form class="form" action="transactionbyzip">
		Enter Zipcode : <input type="text" name="zipcode" placeholder="39120">
		<br>
		<br>

		<p>
			<label for="start"></label> Select Month : <input id="start"
				type="month" value="Month Year" name="date">
		</p>
		<input class="submit" type="submit" value="Submit">
	</form>


	<br>
	<br>
	<br>


	<h3>Get Total transactions and Value for a Given Category</h3>
	<form class="form" action="transactionbytype">
		Enter a Category : <input type="text" name="category"
			placeholder="Enter A Category"> <br>
		<br> <input class="submit" type="submit" value="Submit">
	</form>

	<br>
	<br>
	<br>


	<h3>Get the transactions made by Customers in a given Zipcode for
		during a given time frame</h3>
	<form class="form" action="transactionbetweendates">
		Enter Your Card Number: <input type="text" name="cardNumber"
			placeholder="Enter Credit Card Number"> <br>
		<br> Enter Last 4 of your SS : <input type="text" name="ssn"
			placeholder="1234"> <br>
		<br>
		<p>
			Starting Date : <input id="start"
				type="date" name="startDate" min="2018-01-01" required
				pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" /> <span class="validity"></span>
		</p>

		Ending Date : <input id="end" type="date" name="endDate"
			max="2025-12-31" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" /> <span
			class="validity"></span> <br>
		<br> 
		<input class="submit" type="submit" value="Submit">
	</form>
	<script src="index.js"></script>
</body>
</html>