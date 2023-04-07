package com.example.latihanvieww

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter (var listFilm : ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>(){
    class ViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
        var img = itemView.findViewById<ImageView>(R.id.filmImg)
        var judul = itemView.findViewById<TextView>(R.id.judul)
        var tanggal = itemView.findViewById<TextView>(R.id.Tanggal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.img.setImageResource(data.img)
        holder.judul.text = data.judul
        holder.tanggal.text = data.tanggal
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData(listFilm: ArrayList<DataFilm>)
    {
        this.listFilm=listFilm
    }
}