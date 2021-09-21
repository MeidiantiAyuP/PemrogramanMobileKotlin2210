package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.R.layout.cv_item_petani
import com.example.myapplication.model.Petani

class PetaniCVAdapter (val petani:List<Petani.Petani>) :
    RecyclerView.Adapter<PetaniCVAdapter.PetaniHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniCVAdapter.PetaniHolder {
        return PetaniHolder(LayoutInflater.from(parent.context).inflate(cv_item_petani,parent,false))
    }
    override fun onBindViewHolder(holder: PetaniCVAdapter.PetaniHolder, position: Int) {
        holder.bindPetani(petani[position])
    }
    override fun getItemCount(): Int {
        return petani.size
    }
    class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUserCV: TextView
        lateinit var txtNamaCV: TextView
        lateinit var txtJumlahLahanCV: TextView
        lateinit var txtIdentifikasiCV: TextView
        lateinit var txtTambahLahanCV: TextView

        fun bindPetani(petani: Petani.Petani) {
            itemView.apply {
                txtUserCV = findViewById(R.id.txtUserCV)
                txtNamaCV = findViewById(R.id.txtNamaCV)
                txtJumlahLahanCV = findViewById(R.id.txtJumlahLahanCV)
                txtIdentifikasiCV = findViewById(R.id.txtIdentifikasiCV)
                txtTambahLahanCV = findViewById(R.id.txtTambahLahanCV)

                txtUserCV.text = petani.user
                txtNamaCV.text = petani.nama
                txtJumlahLahanCV.text = petani.jumlahLahan
                txtIdentifikasiCV.text = petani.identifikasi
                txtTambahLahanCV.text = petani.tambahLahan
            }
        }
    }
}
