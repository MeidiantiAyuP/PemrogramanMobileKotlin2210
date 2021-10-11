package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.PetaniAdapter
import com.example.myapplication.model.Petani

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rc:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)

        rc=findViewById(R.id.rvLatihan)

    val listPetani= listOf(
        Petani(user = "MAP", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
        Petani(user = "MAP1", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
        Petani(user = "MAP2", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
        Petani(user = "MAP3", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300")
    )

        val petaniAdapter = PetaniAdapter(listPetani)

        rc.apply {
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }

    }
}