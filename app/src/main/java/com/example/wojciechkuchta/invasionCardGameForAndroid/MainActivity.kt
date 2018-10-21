package com.example.wojciechkuchta.invasionCardGameForAndroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main.MenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MenuFragment.newInstance())
                .commitNow()
        }
    }
}
