package com.example.recylerview1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecylerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

myRecylerView = findViewById(R.id.recylerView)

        val newsimageArray = arrayOf(

            R.drawable.img5,
            R.drawable.img35,
            R.drawable.img73,
            R.drawable.img84,
            R.drawable.img102,
            R.drawable.img105

        )

        val newHeadlineArray = arrayOf(
            "In a stark demonstration of its growing military arsenal, Russia fired an experimental hypersonic intermediate-range ballistic missile",
            "The Kremlin on Friday said the strike was designed to warn the West that Moscow will respond to moves by the US and Britain",
            "Kremlin spokesman Dmitry Peskov was speaking a day after President Vladimir Putin said Moscow had fired the new",
            " Russia had not been obliged to warn the United States about the strike, but had informed the US 30 minutes before the launch anyway.",
            "  ts growing military arsenal, Russia fired an experimental hypersonic intermediate-range ballistic ",
            "mitry Peskov was speaking a day after President Vladimir Putin said Moscow had "
        )

        //
        myRecylerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for (index in newsimageArray.indices) {
            val news = News(newHeadlineArray[index],newsimageArray[index])
            newsArrayList.add(news)
        }

        myRecylerView.adapter = MyAdapter(newsArrayList, this)
    }
}