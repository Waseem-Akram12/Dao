package com.example.databasetask

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface databaseDAO {
    @Insert
    suspend fun datainsert(contact : DataClass)
    @Update
    suspend fun dataupdate(contact : DataClass)
    @Delete
    suspend fun datadelete(contact : DataClass)

    @Query("SELECT * FROM contact")
    fun getcontact() : LiveData<List<DataClass>>

}