To run the application using any ide 
1) mvn update
2) mvn clean install
3) right click on com.acmebank.accountmanager.AccountManagerApplication to start the application

Endpoints
1) To get the balance : 
GET http://{domain}:{port}/account/{accountId}
Eg: GET http://localhost:8080/account/12345678
2) Transfer the balance :
POST http://{domain}:{port}/transfer
Request Body:
   {
   "fromAccountId": "xxxxxxxx",
   "toAccountId": "xxxxxxxx",
   "amount": "X"
   }
Eg: POST http://localhost:8080/transfer
   {
   "fromAccountId": "88888888",
   "toAccountId": "12345678",
   "amount": "1000"
   }