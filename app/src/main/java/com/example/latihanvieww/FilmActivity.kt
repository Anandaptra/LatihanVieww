package com.example.latihanvieww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanvieww.databinding.ActivityFilmBinding

class FilmActivity : AppCompatActivity() {
    lateinit var rvFilm : RecyclerView
    lateinit var filmVm : FilmViewModel
    lateinit var filmAdapter: FilmAdapter
    lateinit var binding: ActivityFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFilm()
        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)

        filmVm.getFilmList()

        filmVm.filmlist.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }

    private fun initFilm() {
        val gridLayout = GridLayoutManager(baseContext, 2)
        filmAdapter = FilmAdapter(ArrayList())
        binding.rvFilm.layoutManager = gridLayout//LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvFilm.adapter = filmAdapter
    }
}