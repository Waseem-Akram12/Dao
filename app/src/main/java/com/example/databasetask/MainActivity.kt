package com.example.databasetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var database :ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database= ContactDatabase.getDatabase(this)
 //       database = Room.databaseBuilder(applicationContext,ContactDatabase::class.java,"contactDB").build()
        GlobalScope.launch {
            database.contactdao().datainsert(DataClass(0, "ali", "1234", Date()))
        }
    }
}