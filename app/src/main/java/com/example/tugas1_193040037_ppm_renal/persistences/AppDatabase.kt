package com.example.tugas1_193040037_ppm_renal.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tugas1_193040037_ppm_renal.model.DataMotor


@Database(entities = [DataMotor::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DataMotorDao(): DataMotorDao
}