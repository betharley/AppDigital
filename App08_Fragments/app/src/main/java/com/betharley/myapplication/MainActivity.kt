package com.betharley.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        var primeiroFragment = PrimeiroFragment()
        var segundoFragment = SegundoFragment()

        main_primeiroFrag.setOnClickListener {
            setFragment( primeiroFragment )
        }

        main_segundoFrag.setOnClickListener {
            setFragment( segundoFragment )
        }

        setFragment( primeiroFragment )
    }

    fun setFragment(fragment: Fragment){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}