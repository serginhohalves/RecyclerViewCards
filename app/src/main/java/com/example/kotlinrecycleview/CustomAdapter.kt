package com.example.kotlinrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter:RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    val titles = arrayOf("On the way home", "Devolva-me", "Carpinteiro", "Valerie",
    "Wild Horses", "Sera", "Anjos", "Tearn in heaven", "Civil War")

    val details = arrayOf("Neil Young", "Adriana Calcanhoto", "Ronnie Von","Amy Winehouse",
    "Rolling Stones", "Legiao Urbana","O Rappa","Eric Clapton", "Guns'n Roses")



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,
        viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
      viewHolder.itemMusic.text = titles[i]
        viewHolder.itemArtist.text = details[i]
    }


    override fun getItemCount(): Int {
        return titles.size
    }



    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var itemMusic:TextView
    var itemArtist:TextView

    init {
        itemMusic = itemView.findViewById(R.id.itemTitle)
        itemArtist = itemView.findViewById(R.id.itemArtist)
    }
    }
}