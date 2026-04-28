# AuriviaFinance 
A collaborative Android application built using Kotlin and modern Android architecture. This app helps users track expenses, manage categories, and analyze spending habits through reports and insights.

Git Repo Link: https://github.com/NtokozoNolu24/AuriviaFinance1.git

Team Structure
This project was developed using a role-based approach:

Person 1 — UI & Navigation
Login & Registration screens
Navigation (Dashboard, Expenses, Categories, Reports)
UI design and layout consistency

Person 2 — Database & Data Management 
Implemented Room Database (renamed to Finance Database)
Created entities, DAO, and repository layers
Managed data persistence for users, categories, and expenses

Person 3 — Reports & Analytics
Spending analysis
Budget tracking
Reports and insights

Technologies/Softwares Used
Kotlin
Android SDK
Finance Database 
Coroutines (for background operations)
Material Design Components

Project Structure
com.example.open_sourcepart2
 database/
  - entities/
    -User.kt
     - Category.kt
       - Expense.kt
 dao/
    - UserDao.kt
       - CategoryDao.kt
         -ExpenseDao.kt
 repository/
    -UserRepository.kt
AppDatabase.kt
    -DatabaseProvider.kt
 ui/
    - activities/
      - fragments/
         - adapters/
 MainActivity.kt

Database Overview 
The app uses Room Database (Finance Database) for structured and efficient data handling.

Entities
User
id (Primary Key)
name
email
age
password

Category
id (Primary Key)
name

Expense
id (Primary Key)
amount
categoryId (Foreign reference)
date

DAO (Data Access Objects)

Handles all database operations:
Insert data
Fetch data
Filter by date
Calculate totals

Repository Layer
Acts as a bridge between:
UI (Activities/Fragments)
Database (DAO)

Authentication Flow
User registers → saved in Finance DB
User logs in → validated using DAO query
Successful login → navigates to main dashboard

Core Features
User Registration & Login
Add/Edit/Delete Expenses
Category Management
Persistent data storage

Analytics (Handled by Person 3)
Total spending calculation
Category-based summaries
Date range filtering
Budget alerts

Setup Instructions
Clone or download the project
Open in Android Studio
Sync Gradle
Run on emulator or physical device

Important Notes
The app uses Room Database only (no SQLite helper classes)
Do NOT modify database schema without team agreement
All data operations must go through DAO/Repository

Future Improvements
Graphs and charts (e.g., MPAndroidChart)
Cloud sync (Firebase)
User profile enhancements
Multi-user support

Contribution Guidelines
Use consistent naming conventions
Follow package structure
Test features before merging
Use Git branches for each module

Status
UI Completed
Database Integrated
Analytics & Reports Completed
