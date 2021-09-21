package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.SavedStateViewModelFactory

class SampleList : AppCompatActivity() {
    lateinit var btn_list: Button
    lateinit var btn_rec: Button
    lateinit var btn_car: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btn_list=findViewById(R.id.btnShowList)
        btn_rec=findViewById(R.id.btnSampleRV)
        btn_car=findViewById(R.id.btnCard)

        btn_list.setOnClickListener(View.OnClickListener { view ->  
            var intent= Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })
        btn_rec.setOnClickListener(View.OnClickListener { view ->
            var intent= Intent(this@SampleList, SampleRecyclerView::class.java)
            startActivity(intent)
        })
        btn_car.setOnClickListener(View.OnClickListener { view ->
            var intent= Intent(this@SampleList, SampleCardView::class.java)
            startActivity(intent)
        })
    }
}