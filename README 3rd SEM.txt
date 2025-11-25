# **SBI Banking Management System (Java Console Application)**

## **📌 Overview**

A console-based banking management system built in Java that simulates real banking operations like account creation, deposits, withdrawals, ATM services, cheque handling, secure OTP operations, and customer/admin authentication.
All customer data is stored persistently through Java Serialization.

---

## **✨ Features**

### **👨‍💼 Admin**

* Admin Login
* View all customers
* Logout

---

### **👤 Customer**

#### **Bank Teller Operations**

* Deposit
* Withdraw

#### **ATM Operations**

* ATM Deposit
* ATM Withdrawal
* Change ATM PIN
* Issue ATM Card

#### **Account Management**

* Create new account
* Change password
* View account details
* Check balance

#### **Transfers**

* Fund Transfer (Account to Account)

#### **Cheque Book Services**

* Issue Cheque Book
* Cheque Deposit
* Cheque Withdrawal

---

## **📝 Account Creation**

When creating a new account, user provides:

* Username & password
* Personal details (Name, Aadhaar, Age, Mobile, Address, Nominee)
* Optional services:

  * ATM Card (with 4-digit PIN)
  * Cheque Book

Every customer automatically gets:

* Unique account number
* Starting balance: ₹0
* Starting cheque number: **100000**

---

## **💾 Data Storage**

All customer data is saved in a serialized file:

```
bankdata.ser
```

This file stores:

* Customer details
* Balances
* ATM PINs
* Cheque details
* Username and account maps
* Next account number counter

---

## **🔐 Security Measures**

* OTP verification for sensitive transactions
* ATM PIN authentication
* Password verification
* Strict format checks (PIN, cheque number, amounts)

---

## **🛠️ Technologies Used**

* Java
* OOP (Classes, Objects)
* Collections (HashMap)
* File Handling
* Serialization
* Exception Handling
* Console I/O

---

## **▶️ How to Run**

Compile the project:

```bash
javac SBIBanking.java
```

Run the application:

```bash
java SBIBanking
```

Follow the menu on the console.

---

## **🔑 Admin Login**

```
Username: PRAVESH
Password: PRAVESH@123
```

---

## **📚 Folder Structure (Recommended)**

```
/Your-Repo-Name
│
├── SBIBanking.java
├── README.md
└── SBI_Banking_System_Readme.pdf   (optional)
```

> **Do NOT upload:**
> `bankdata.ser` — it's your local database file.

---

## **📌 Future Enhancements (Optional for GitHub)**

* GUI using JavaFX or Swing
* Database integration (MySQL / PostgreSQL)
* Online/Netbanking module
* Transaction history logs

---