package com.example.zhonghj

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val extraData=intent.getStringExtra("extra_data")
        Log.d("SecondActivity","extra data is $extraData")

        val button2: Button =findViewById(R.id.button2)
        button2.setOnClickListener {
            //Toast.makeText(this,"this is my program",Toast.LENGTH_SHORT).show()
            //val intent= Intent(this,FirstActivity::class.java)
            //startActivity(intent)
            val intent = Intent()
            intent.putExtra("data_return","hello====================== FirstActivity")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}