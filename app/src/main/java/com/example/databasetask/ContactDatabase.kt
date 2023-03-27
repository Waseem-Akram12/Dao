package com.example.databasetask

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataClass::class], version = 1 )
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactdao() : databaseDAO

}