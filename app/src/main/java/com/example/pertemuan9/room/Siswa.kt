package com.example.pertemuan9.room

import android.R
import androidx.compose.material.icons.Icons
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int =0,
    val nama: String,
    val alamat: String,
    val telepon: String
)
