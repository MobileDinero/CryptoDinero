# CryptoDinero

CryptoDinero is a simple blockchain, cryptocurrency, wallet implementation.
NOTE: This project is in the Beta phase and as of right now, it's still in its testing phase.

## Requirements:
If you are starting a new project make sure you have some dependences and add these 
libraries to the project or classpath:
bcprov-ext-jdk15on-159.jar
beansbinding-1.2.1.jar
gson-2.6.2.jar
PlaceHolder.jar

###### If this is a continuing project you can run the following files:
Main.java - simulates two people with wallets to send coins to one another. This also runs a local P2P.
LoginPage.java - will be the start of the application allowing a user to log into their wallet and create an acc
CDClientUI.java - the GUI of CryptoDinero's wallet

###### Directions to run
(unorthodox method, but oh well)
(Preferably to run on Netbeans)
1. Before running, on Computer 1, open CDClientUI.java and find the main method and change the server and client IP's to the other IP 
of the other computer. Do the same for Computer 2. (Lines 743, 748, 555, 580)
2. On your Computer 1, remove the multi line comment on line 662. This is important to have the genesis block give your
wallet some coins.
3. On the second computer keep everything as is.
4. Run LoginPage.java and you can go and create an account then you will be able to login.
5. With Computer 1, once you login you are greeted to the main page, the Wallet.
6. On the overview tab you can view your public key and it will show in the output/terminal.
7. Make sure you get Computer 2 public key and use that for Computer 1 to be able to send a transaction.
8. On Computer 1, go to the send tab and use Computer 2 public key to send a transaction.

###### Editors notes
This application sometimes like to drop connection, not sure why.
Checking the balance on Computer 2 doesn't seem to update the balance but it ends up in our transaction list.