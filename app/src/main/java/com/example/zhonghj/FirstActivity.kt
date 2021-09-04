package com.example.zhonghj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button1:Button=findViewById(R.id.button1)
        button1.setOnClickListener {
            //Toast.makeText(this,"this is my program",Toast.LENGTH_SHORT).show()
            val data="Hello jay!"
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("extra_data",data)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //Log.d("FirstActivity", "onActivityResult")
        when (requestCode){
            1->if (resultCode==RESULT_OK){
                val returnData = data?.getStringExtra("data_return")
                Log.d("FirstActivity", "onActivityResult: $returnData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu,menu)
            return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item->Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item->Toast.makeText(this,"You clicked remove",Toast.LENGTH_SHORT).show()
            R.id.Jay_item->Toast.makeText(this,"You clicked jay",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}