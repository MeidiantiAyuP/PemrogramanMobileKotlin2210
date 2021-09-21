package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar

class DaftarLahan : AppCompatActivity() {
    var items = arrayOf(
        "MAP", "Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP1","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP2","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP3","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP4","Meidianti Ayu Permatasari", "100", "200", "300",
    )

    lateinit var list_lahan: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_lahan)

        list_lahan= findViewById(R.id.listLahan)
        list_lahan.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        list_lahan.setOnItemClickListener { parent, view, i, l ->
            Snackbar.make(view,"Anda memilih: ${items[i]}",
                Snackbar.LENGTH_LONG).show()
        }
    }
    override fun onCreateContextMenu(menu: ContextMenu?,v: View?,menuInfo: ContextMenu.ContextMenuInfo?
    ) {
             super.onCreateContextMenu(menu, v, menuInfo)
                     val inflater = menuInflater
                     inflater.inflate(R.menu.menu_sample_list_view, menu)
    }
}