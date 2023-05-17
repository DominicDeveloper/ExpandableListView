package com.asadbek.expandablelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asadbek.expandablelistview.adapters.AdapterExpandable
import com.asadbek.expandablelistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapterExpandable: AdapterExpandable
    lateinit var list:ArrayList<String>
    lateinit var map:HashMap<String,List<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        map= HashMap()
        dataReLoading()

        adapterExpandable = AdapterExpandable(list,map)
        binding.expandableListView.setAdapter(adapterExpandable)

    }
    private fun dataReLoading(){
        list.add("Group 1")
        list.add("Group 2")
        list.add("Group 3")
        map[list[0]] = arrayListOf("Biloldin","Kamronbek","Ubaydillo")
        map[list[1]] = arrayListOf("Ortig`Ali","Azamatjon","Ali")
        map[list[2]] = arrayListOf("Jamshid","Bobur","Dior")

    }
}