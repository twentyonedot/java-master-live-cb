Question1Max. score 2.00
Based on the following tables, what is the output of the SQL query:

CUSTOMER

CUSTID NAME
4000 Mike
5000 Tara
6000 Alice
7000 Bob
8000 Mary
9000 John
ORDERS

ORDERID CUSTID DATE
1 7000 2016/04/17
2 5000 2016/03/17
3 8000 2016/03/29
4 4000 2016/04/25
Query

SELECT NAME FROM CUSTOMER WHERE EXISTS (SELECT \* FROM ORDERS WHERE CUSTOMER.CUSTID = ORDERS.CUSTID) ORDER BY NAME;

1.

NAME
Bob
Tara
Mary
Mike 2.

NAME
Bob
Mary
Mike
Tara 3.

NAME
Mike
Tara
Bob
Mary
1
2
3
Syntax error

Question11Max. score 30.00

# NPCI super application

## Problem statement

It is a tedious task to check an account's balance in an external payment-enabling application. Also, while you are checking the balance, sometimes bank servers become unresponsive.

To solve this issue, you are assigned a task of creating a new NPCI super application in which the balance is displayed at the top of the main page.

## Task

Develop a pseudo full stack application in React and Java Spring Boot with SQL/NoSQL database. This application must have authentication and authorization control for each API using the JWT tokens.

### Minimum requirement (entry-level)

- Display a balance of INR 10,000 in the account at the top of the screen on the main page. Any payment made to other users must be deducted from INR 10,000 and the changes in the balance must be displayed accordingly. Use the JWT token and connect to the database (SQL/NoSQL).
- Use of Web API to fetch the list of user details.
- Utilize the response parameters: [Image, name, id]
- A dropdown must display the name of the users to whom the amount has been transferred. This must also include their images which can be fetched from the given API (People).
- There must be no businesses and bills or promotions (rewards/offers/referrals).
- Submit Source code, Screenshots & detailed deployment instructions.

### Plus point (intermediate)

- Clicking on any user must take us to a screen that has a Pay or Request button. No chat for the simplicity of the application. The history of any transaction must be saved and should be shown after fetching from the database.
- Clicking on Pay must open a tab where the user can enter the amount. Here, the text box must only allow digits.
- On clicking next, it must ask for the UPI code which will be 123456. A successful transaction must display a tick mark and a failed transaction must display a red screen with a X mark.

### Optional (Brownie points)

- Deploy your full stack application on any cloud platform or service. For example, Heroku, AWS Elastic Beanstalk, Microsoft Azure, or any other free alternative.
  Note: This deployment link must be active for at least 2 weeks from the date of submission.
- Provide the deployment URL along with the source code in a .txt file.

## Guide

Users API: https://s3-ap-southeast-1.amazonaws.com/he-public-data/users49b8675.json

Note: Use this API to fetch users and image details.

Upload File
Upload File

Your Answer

Write your answer here

Preview
