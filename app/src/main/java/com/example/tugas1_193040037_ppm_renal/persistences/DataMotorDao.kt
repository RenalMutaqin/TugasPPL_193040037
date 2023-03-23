package com.example.tugas1_193040037_ppm_renal.persistences

import androidx.lifecycle.LiveData

import androidx.room.*
import com.example.tugas1_193040037_ppm_renal.model.DataMotor
@Dao
interface DataMotorDao {
    @Query("SELECT * FROM DataMotor")
    fun loadAll(): LiveData<List<DataMotor>>
    @Query("SELECT * FROM DataMotor WHERE id = :id")
    fun find(id: String): DataMotor?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DataMotor)
    @Delete
    fun delete(item: DataMotor)
}