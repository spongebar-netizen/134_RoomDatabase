package com.example.pertemuan9.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan9.repositori.ContainerDataApp
import com.example.pertemuan9.viewmodel.EntryViewModel
import com.example.pertemuan9.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

/**

Fungsi ekstensi query untuk objek Application dan mengembalikan sebuah instance dari AplikasiSiswa*/
fun CreationExtras.aplikasiSiswa(): ContainerDataApp.AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
            ContainerDataApp.AplikasiSiswa)