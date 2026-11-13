package com.example.myapplication

import android.app.Application
import com.example.myapplication.repositori.ContainerApp
import com.example.myapplication.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    val container: ContainerApp by lazy {
        ContainerDataApp(this)
    }
}
