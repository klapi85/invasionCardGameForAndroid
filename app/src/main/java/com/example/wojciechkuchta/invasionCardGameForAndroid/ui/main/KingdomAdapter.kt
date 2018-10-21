package com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.wojciechkuchta.invasionCardGameForAndroid.R

class KingdomAdapter(context: Context) : RecyclerView.Adapter<KingdomAdapter.KingdomViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        KingdomViewHolder(inflater.inflate(R.layout.card, parent, false))

    override fun onBindViewHolder(viewHolder: KingdomViewHolder, position: Int) {
        viewHolder.message.text = "Monster " + position.toString()
        viewHolder.power.text = "2/" + position.toString()
    }

    override fun getItemCount(): Int {
        return 9
    }

    class KingdomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val message: TextView = view.findViewById(R.id.message)
        val power: TextView = view.findViewById(R.id.power)
    }
}