package com.example.pertemuan9.repositori

import android.app.Application
import android.content.Context
import com.example.database.repositori.OfflineRepositoriSiswa
import com.example.database.repositori.RepositoriSiswa
import com.example.pertemuan9.room.DatabaseSiswa

interface ContainerApp{
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class AplikasiSiswa : Application() {
    /**
     * AppContainer insance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}