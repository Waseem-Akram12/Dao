package com.example.databasetask

import android.content.Context
import androidx.room.*

@Database(entities = [DataClass::class], version = 1 )
@TypeConverters(Converters::class)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactdao() : databaseDAO
    companion object {
        @Volatile
        private var INSTANCE: ContactDatabase? = null


        fun getDatabase(context: Context): ContactDatabase {
            if (INSTANCE == null) {
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, ContactDatabase::class.java, "contactDB").build()
                }
            }
            return INSTANCE!!
        }
    }


}