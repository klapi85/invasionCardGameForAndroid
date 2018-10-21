package com.example.wojciechkuchta.invasionCardGameForAndroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main.KingdomAdapter

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.game_fragment)

        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.menu, GameFragment.newInstance())
//                .commitNow()
        }

        with(findViewById<RecyclerView>(R.id.kingdomRecycler)) {
            adapter = KingdomAdapter(context)
        }
    }

    companion object {
        private const val GAME = "game"

        @JvmStatic
        fun createIntent(context: Context): Intent =
            Intent(context, GameActivity::class.java)
    }
}