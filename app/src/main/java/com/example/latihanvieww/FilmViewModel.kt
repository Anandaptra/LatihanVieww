package com.example.latihanvieww

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {

    val list = arrayListOf(
        DataFilm(R.drawable.jhn, "John Whick Chapter 4", "21 Maret 2023"),
        DataFilm(R.drawable.the, "The Avengers The end", "24 April 2019 "),
        DataFilm(R.drawable.kungfu, "Kungfu Panda", "8 Maret 2016"),
        DataFilm(R.drawable.sponge, "Spongeboob", "30 Juli 2020"),
        DataFilm(R.drawable.nrto, "Naruto The Last Movie", "6 Desember 2014"),
        DataFilm(R.drawable.vgb, "Vagabond", "23 November 2019"),
        DataFilm(R.drawable.dor, "Stand By Me Doraemon 2", "19 Februari 2021"),
        DataFilm(R.drawable.fnf, "Fast n Furious X", "19 Mei 2023")

    )

    val filmlist : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        var stu = list
        filmlist.value = stu
    }
}