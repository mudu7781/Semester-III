# Semester-III
JAVA GUVI  project for 3rd sem. (SBI ONLINE BANKING SYSTEM)

# SBI Banking Management System (Java Console Application)

## 📌 Overview
This project is a console-based banking management system built using Java.  
It simulates real banking operations such as account creation, deposits, withdrawals, ATM services, cheque operations, OTP-based verification, and persistent data storage using serialization and Database Conmnection.
The system includes exception handling to prevent crashes due to invalid input or system failures. 
The application integrates file-based persistence with JDBC-based transactional operations for critical workflows.
User menu selections act as events, processed synchronously or via multithreaded execution for concurrent operations.
Both client-side (input validation) and server-side (transaction checks) validations are implemented.
Innovative features include OTP-based verification and synchronized multithreaded fund transfers.

---

## ✨ Features

### 👨‍💼 Admin
- Admin Login  
- View All Customers  
- Logout  

---

### 👤 Customer

#### 💰 Bank Teller Operations
- Deposit  
- Withdraw  

#### 🏧 ATM Services
- ATM Deposit  
- ATM Withdrawal  
- Issue ATM Card  
- Change ATM PIN  

#### 📄 Cheque Services
- Issue Cheque Book  
- Cheque Deposit  
- Cheque Withdrawal  

#### 🔐 Account Management
- Change Password  
- View Account Details  
- Check Balance  

#### 💸 Transfers
- Fund Transfer (Account Number Based)

---

## 📝 Account Creation
When creating a new account, user can:
- Set username & password  
- Enter personal details  
- Choose additional features:
  - ATM card  
  - Cheque book  

Each account includes:
- Unique Account Number  
- Initial balance: ₹0  
- Starting cheque number: 100000  

---

## 💾 Data Storage
All customer data is stored using Java serialization in:


The file contains:
- Customer details  
- Balances  
- ATM PINs  
- Cheque book info  
- Username & account mapping  
- Next account number  

This ensures data is saved even after restarting the software.

---

## 🔐 Security Features
- OTP verification for deposits, withdrawals, transfers  
- ATM PIN validation  
- Password-based login  
- Input validation for cheque number, PIN format, etc.  

---

## 🛠️ Technologies Used
- Java  
- OOP Concepts  
- Collections (HashMap)  
- Serialization  
- File Handling  
- Exception Handling  
- Console-Based UI  

---

## ▶️ How to Run

### **Compile**
```bash
javac SBIBanking.java

java SBIBanking



Username: PRAVESH
Password: PRAVESH@123



