package com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wojciechkuchta.invasionCardGameForAndroid.GameActivity
import com.example.wojciechkuchta.invasionCardGameForAndroid.R
import kotlinx.android.synthetic.main.menu_fragment.exit
import kotlinx.android.synthetic.main.menu_fragment.newGame

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.menu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        newGame.setOnClickListener { startGame() }
        exit.setOnClickListener { System.exit(0) }
    }

    private fun startGame() {
        startActivity(GameActivity.createIntent(getContext()!!))
    }

    companion object {
        fun newInstance() = MenuFragment()
    }
}