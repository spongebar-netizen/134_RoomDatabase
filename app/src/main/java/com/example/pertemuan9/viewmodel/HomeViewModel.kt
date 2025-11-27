package com.example.pertemuan9.viewmodel


class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    companion object{
        private const val TIMEOUT_MILLS = 5_000L
    }