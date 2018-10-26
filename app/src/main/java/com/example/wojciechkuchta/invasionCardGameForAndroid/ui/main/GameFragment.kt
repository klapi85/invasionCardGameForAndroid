package com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wojciechkuchta.invasionCardGameForAndroid.R
import kotlinx.android.synthetic.main.game_fragment.kingdomRecycler

class GameFragment : Fragment() {

    private lateinit var kingdomAdapter: KingdomAdapter

    companion object {
        fun newInstance() = GameFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.game_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.initGame()
        kingdomAdapter = KingdomAdapter(this.context!!, viewModel)
        kingdomRecycler.adapter = kingdomAdapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}
