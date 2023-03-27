package com.example.databasetask

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun fromdatetolong (value:Date):Long {
        return value.time
    }
    @TypeConverter
    fun fromlongtodate (value:Long):Date{
        return Date(value)
    }
}