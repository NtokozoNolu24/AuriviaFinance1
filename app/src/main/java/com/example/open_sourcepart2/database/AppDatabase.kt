package com.example.open_sourcepart2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.open_sourcepart2.database.dao.BudgetDao
import com.example.open_sourcepart2.database.dao.CategoryDao
import com.example.open_sourcepart2.database.dao.ExpenseDao
import com.example.open_sourcepart2.database.dao.IncomeDao
import com.example.open_sourcepart2.database.dao.UserDao
import com.example.open_sourcepart2.database.entities.Budget
import com.example.open_sourcepart2.database.entities.Category
import com.example.open_sourcepart2.database.entities.Expense
import com.example.open_sourcepart2.database.entities.Income
import com.example.open_sourcepart2.database.entities.User
import com.example.open_sourcepart2.database.utils.Converters

@Database(
    entities = [User::class, Category::class, Expense::class, Budget::class, Income::class],
    version = 5,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun categoryDao(): CategoryDao
    abstract fun expenseDao(): ExpenseDao
    abstract fun budgetDao(): BudgetDao
    abstract fun incomeDao(): IncomeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "budget_tracker.db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}