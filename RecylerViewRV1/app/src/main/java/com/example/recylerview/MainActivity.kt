package com.example.recylerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecylerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

     myRecylerView = findViewById(R.id.recylerView)
        var newsImageArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6

        )

        var newsHeadingArray = arrayOf(
            "Several parts of Telangana, including Hyderabad, also experienced cold wave conditions as mercury levels dropped to single digits in some areas on Monday. "
              ,
            "Cold wave conditions have been prevailing in several parts of the country, including Himachal Pradesh, Jammu & Kashmir "
            ,
            "Rajasthan, Punjab, Telangana, Odisha and also Delhi, where the Air Quality Index (AQI) has plummeted again to ‘severe’ "
            ,
            "category and prompted the need for the reimposition of Stage 4 of the Graded Response Action Plan (GRAP) curbs. "
            ,
            "In parts of Himachal Pradesh and Kashmir, temperatures have gone below freezing point. While Himachal Pradesh's "
            ,
            "Delhi weather: Delhi on Monday recorded a minimum temperature of 4.5 degrees Celsius, 4.1 degrees below normal "

        )
            // layoutmanager is used to set haw and bhaw inside recylerview like vertical scrolling, horizontall
        myRecylerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for (index in newsImageArray.indices) {
            val news = News(newsHeadingArray[index],newsImageArray[index])
            newsArrayList.add(news)

            myRecylerView.adapter = Myadapter(newsArrayList, this)
        }



    }
}