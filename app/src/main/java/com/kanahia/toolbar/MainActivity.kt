package com.kanahia.toolbar

import androidx.appcompat.app.AppCompatActivity
import com.kanahia.customtoolbar.Toolbar
import android.os.Bundle
import com.kanahia.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b : ActivityMainBinding
    var index = 0
    var items = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        b = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(b.root)

        b.customToolbar.items = items
        b.customToolbar.setSelectedItemIn(index)
        b.textView.text = "Index :$index"

        b.next.setOnClickListener {
            if (index != items-1 ){
                index ++;
                b.customToolbar.setSelectedItemIn(index)
                b.textView.text = "Index :$index"
            }

        }
        b.pre.setOnClickListener {
            if (index != 0){
                index --;
                b.customToolbar.setSelectedItemIn(index)
                b.textView.text = "Index :$index"
            }

        }

    }




}