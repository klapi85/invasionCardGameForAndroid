package com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.wojciechkuchta.invasionCardGameForAndroid.R

class KingdomAdapter(val context: Context) : RecyclerView.Adapter<KingdomAdapter.KingdomViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        KingdomViewHolder(inflater.inflate(R.layout.card, parent, false))

    override fun onBindViewHolder(viewHolder: KingdomViewHolder, position: Int) {
        with(viewHolder) {
            cardText.text = "Monster " + position.toString()
            power.text = "2/" + position.toString()
            card.setOnClickListener { Toast.makeText(context, "Click " + position, Toast.LENGTH_SHORT).show() }
        }
    }

    override fun getItemCount(): Int {
        return 9
    }

    class KingdomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val card: LinearLayout = view.findViewById(R.id.card)
        val cardText: TextView = view.findViewById(R.id.cardText)
        val power: TextView = view.findViewById(R.id.power)
    }
}