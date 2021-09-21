package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain: TextView
    lateinit var btnInputNama: Button
    lateinit var btnHelp: Button
    lateinit var edInputNama: EditText
    lateinit var btnLinear: Button
    lateinit var btnCons: Button
    lateinit var btnTab : Button
    lateinit var btnPo : Button
    lateinit var btnDuta : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        edInputNama = findViewById(R.id.ed_input_nama)
        btnInputNama = findViewById(R.id.btn_ambil_nama)
        btnHelp = findViewById(R.id.btn_help)
        btnLinear = findViewById(R.id.tes_linear)
        btnCons =  findViewById(R.id.tes_cons)
        btnTab = findViewById(R.id.btn_tabel)
        btnPo = findViewById(R.id.btn_pro)
        btnDuta = findViewById(R.id.btn_duta)

        tvMain.text = getString(R.string.text_progmob_main)


        btnInputNama.setOnClickListener(View.OnClickListener {
            var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp

        })
        btnHelp.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnLinear.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, LinearActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnCons.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, ConstraintActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnTab.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, TableActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnPo.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, ProteinTrackerActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnDuta.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, DutataniActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

    }
}
