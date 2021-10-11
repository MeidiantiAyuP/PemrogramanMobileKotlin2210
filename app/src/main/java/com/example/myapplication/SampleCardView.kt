package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.PetaniCVAdapter
import com.example.myapplication.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var adapter: PetaniCVAdapter
    lateinit var layoutManager: LinearLayoutManager
    lateinit var rvCardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        rvCardView=findViewById(R.id.rvCardView)

        val listPetaniCVAdapter = listOf(
            Petani(user = "MAP", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
            Petani(user = "MAP1", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
            Petani(user = "MAP2", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300"),
            Petani(user = "MAP3", nama = "Meidianti Ayu Permatasari", jumlahLahan = "100", identifikasi = "200", tambahLahan = "300")
        )

        val petaniCVAdapter = PetaniCVAdapter(listPetaniCVAdapter)

        rvCardView.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniCVAdapter
        }
    }
}