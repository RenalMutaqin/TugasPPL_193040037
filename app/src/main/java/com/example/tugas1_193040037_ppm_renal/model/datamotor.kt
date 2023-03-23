package com.example.tugas1_193040037_ppm_renal.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataMotor(
    @PrimaryKey val id: String,
    val nomorkendaraan: String,
    val namakendaraan: String,
    val ukuranmesin: String,
    val tahun: String,
    val warnakendaraan: String,


)

