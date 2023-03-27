package com.example.databasetask

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "contact")
data class DataClass(
    @PrimaryKey(autoGenerate = true)
    val id :Long,
    val name : String,
    val number : String,
    val createdDate: Date
)
