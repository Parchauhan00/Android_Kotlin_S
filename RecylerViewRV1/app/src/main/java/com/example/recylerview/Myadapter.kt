package com.example.recylerview

import android.app.Activity
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.Shapeable

class Myadapter(var newsArrayList : ArrayList<News>, var context : Activity):
RecyclerView.Adapter<Myadapter.MyViewHolder>(){

   // to create new view instance
    // when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myadapter.MyViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
      return MyViewHolder(itemView)
    }
      // populate items with data
    override fun onBindViewHolder(holder: Myadapter.MyViewHolder, position: Int) {
         var currentItem = newsArrayList[position]
          holder.hTitle.text = currentItem.newsheading
          holder.hImage.setImageResource(currentItem.newsImage)
    }
     // how many list item are present in your array
    override fun getItemCount(): Int {
          return newsArrayList.size
    }
    // it holds the view so views are not created everytime, so memory can be saved
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView ){
        val hTitle = itemView.findViewById<TextView>(R.id.headingTitle)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)

    }

}