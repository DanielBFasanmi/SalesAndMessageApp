# SalesAndMessageApp
A message Processing Application.
#
The SMProTest class is the entry point of the application. 
The SalesAndMessageApp is desktop application that takes in messages from external source (in our case a terminal object which implements interface Callable), processes it and performs create or update operation as desired by the sending source. This application has been created according to the processing requirement given.<br />
The application uses collections to hold information about each sale transaction or adjustment transaction perform. It displays a comprehensive information to the user after a number of transaction has been made (in our case, to the console). Reports are displayed to the user after ever 10 transaction performed. This report shows the number of sales of each product and their total value.<br />
Transaction messages could be of the following types:
1.	Message Type 1 – contains the details of 1 sale E.g apple at 10p
2.	Message Type 2 – contains the details of a sale and the number of occurrences of that sale. E.g 20 sales of apples at 10p each.
3.	Message Type 3 – contains the details of a sale and an adjustment operation to be applied to all stored sales of this product type. Operations can be add, subtract, or multiply e.g Add 20p apples would instruct your application to add 20p to each sale of apples you have recorded.
<br />
The SMProTest class is the entry point of the application, it creates object of class terminal a subset of Callable interface. 
The call method of each terminal object runs in a while loop which terminates when the number of messages received by the application is 50, as required. 
When each object runs, it calls a static method of class TransactionMessage which returns a message fashion like any of the three message types described above. Method processMessage of class MessageProcessor is invoked with the generated message as the argument.
The application derives meaning from each transaction message sent from each terminal object, using pattern matching. It chunks out the price, quantity, product name, the operation and the message type. 
The SMPro, Sales and Message objects are created. These objects are initialized accordingly with the chunked information saved in the string array. 
The terminal objects calls on the synchronized method of object of class Sale. The object is responsible for all operations (insert, add, subtract, multiply) performed on each sale. The methods are synchronized to prevent multiple thread from calling the method at the same time. 
When 50 messages has been sent to the application stops receiving messages from the terminal object, each terminal objects logs we are pausing to the console and terminates internally. The application also logs information about every adjustment made to each item.
The application uses List and Map collection to save the created objects for future references.
