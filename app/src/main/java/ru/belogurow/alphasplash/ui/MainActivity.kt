package ru.belogurow.alphasplash.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ru.belogurow.alphasplash.Application
import ru.belogurow.alphasplash.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        GlideApp.get(this).setMemoryCategory(MemoryCategory.HIGH);

        val photosListFragment = PhotosListFragment()
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_container, photosListFragment)
                .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        Application.watchObject(this)
    }
}
