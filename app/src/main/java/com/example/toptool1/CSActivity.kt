package com.example.toptool1

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class CSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_csactivity)
        val actionbar=supportActionBar
        actionbar!!.title="Choose ABC"
        //actionbar.setDefaultDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayShowHomeEnabled(true)

        // Fetch the data from server //
        val textshow_error_msg = findViewById<TextView>(R.id.textView1)
        val queue = Volley.newRequestQueue(this)
        val url = "http://springtown.in/test/fetch_scheme.php"
        var scheme_data:String=""
        val stringRequest = StringRequest( Request.Method.GET, url,
            Response.Listener<String> { response ->
                textshow_error_msg.text = "Response is: ${response}"

                if(response != null){
                    scheme_data=response
                    //val intent = Intent(this, MainActivity::class.java)
                    //startActivity(intent)
                }else{
                    Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
                }
            },
            Response.ErrorListener { textshow_error_msg.text = "Failed" })
        // Add the request to the RequestQueue.
        queue.add(stringRequest)
        textshow_error_msg.text = scheme_data
    }
}