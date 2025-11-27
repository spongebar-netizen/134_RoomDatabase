package com.example.pertemuan9.viewmodel

import com.example.pertemuan9.room.Siswa

data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telepon: String = "",
)

fun DetailSiswa.toSiswa(): DetailSiswa
)


fun Siswa.