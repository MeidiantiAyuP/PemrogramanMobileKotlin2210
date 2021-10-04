package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.UsersAdapter
import com.example.myapplication.model.ResponseUsersItem
import com.example.myapplication.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class GetAPIActivity : AppCompatActivity() {
    lateinit var adapter: UsersAdapter
    lateinit var rvUser: Button
    lateinit var layoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)

        NetworkConfig().getService().getUsers().enqueue(object : Callback<List<ResponseUsersItem>> {
            override fun onFailure(call: Call<List<ResponseUsersItem>>, t: Throwable) {
                Toast.makeText(this@GetAPIActivity, t.localizedMessage,
                    Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<List<ResponseUsersItem>>,
                response: Response<List<ResponseUsersItem>>
            ) {
                rvUser.apply{
                    layoutManager = LinearLayoutManager(this@GetAPIActivity)
                    adapter = UsersAdapter(response.body())
                }
            }
        })
    }

}


