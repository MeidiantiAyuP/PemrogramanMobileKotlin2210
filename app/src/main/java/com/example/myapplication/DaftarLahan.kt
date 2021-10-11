package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import com.google.android.material.snackbar.Snackbar

class DaftarLahan : AppCompatActivity() {
    var items = arrayOf(
        "MAP", "Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP1","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP2","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP3","Meidianti Ayu Permatasari", "100", "200", "300",
        "MAP4","Meidianti Ayu Permatasari", "100", "200", "300"
    )

    lateinit var lvLahan: ListView
    lateinit var spDaftarLahan: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_lahan)

        lvLahan = findViewById(R.id.lvLahan)
        lvLahan.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        lvLahan.setOnItemClickListener { parent, view, i, l ->
            Snackbar.make(view, "Anda memilih: ${items[i]}", Snackbar.LENGTH_LONG).show()
        }
        spDaftarLahan = findViewById(R.id.spDaftarLahan)
        spDaftarLahan.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,items)
        spDaftarLahan.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view:
            View, position: Int, id: Long) {
                Snackbar.make(lvLahan, "Anda memilih${items[position]}", Snackbar.LENGTH_LONG).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
        registerForContextMenu(lvLahan)
    }

    override fun onCreateContextMenu(menu: ContextMenu?,v: View?,menuInfo: ContextMenu.ContextMenuInfo?
    ) {
             super.onCreateContextMenu(menu, v, menuInfo)
                     val inflater = menuInflater
                     inflater.inflate(R.menu.menu_sample_list_view, menu)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        var info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        when(item.itemId){
            R.id.menu_add -> {
                Snackbar.make(lvLahan,"Anda memilih: Add Item ke-${info.id}", Snackbar.LENGTH_LONG).show()
            }
            R.id.menu_edit -> {
                Snackbar.make(lvLahan,"Anda memilih: Edit Item ke-${info.id}", Snackbar.LENGTH_LONG).show()
            }
            R.id.menu_delete -> {
                Snackbar.make(lvLahan,"Anda memilih: Delete Item ke-${info.id}", Snackbar.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}