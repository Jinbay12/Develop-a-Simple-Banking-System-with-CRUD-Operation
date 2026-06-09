# Banking Database & Audit Log System

A robust, Java Swing-based desktop application integrated with a MySQL database backend. The system tracks customer records, calculates balances, and dynamically records transactions while strictly maintaining an automated security audit trail directly synced to the data layer.

## 🚀 System Overview

This application bridges a core Java desktop Graphical User Interface (GUI) with a secure relational database schema. It features two primary operational frameworks:
1. **Customer Account Dashboard (`CustomerAccountFrame`)**: Allows standard account tracking, querying balances, and updating account statistics.
2. **Transaction History Audit Log (`TransactionLogFrame`)**: A real-time monitoring dashboard that displays the granular detail of every financial transaction executed within the system.

## 🛠️ Tech Stack

* **Front-end UI:** Java Swing (GUI)
* **Back-end Logic:** Java SE (with JDBC API)
* **Database Management System:** MySQL
* **Development Environment:** NetBeans IDE

## 📂 Project Architecture & Frame Responsibilities

The system relies on clear encapsulation and architectural consistency. The primary files and roles include:

### 1. `DBConnection.java`
* Handles the automated JDBC connection lifecycle to the MySQL server.
* Implements a centralized connection mechanism ensuring thread-safe database pooling resources.

### 2. `CustomerAccountFrame.java`
* Acts as the main application dashboard.
* Interacts with the `accounts` table inside the database.
* Triggers updates to accounts and serves as the visual link to navigate towards the audit tracking workspace.

### 3. `TransactionLogFrame.java`
* Implements a dedicated table monitoring view utilizing `JTable`.
* Executes direct structured statements (`SELECT id, account_id, transaction_type...`) ordered chronologically by execution time.
* Seamlessly reads transaction identifiers directly tied to the primary tracking sequence of the database structure.

---

## 🗄️ Database Schema (`mysql_code.sql`)

The backend is structurally configured via the following relational architecture under `banking_db`. It utilizes foreign key relational references coupled with cascading deletes to safely enforce data integrity constraints.

