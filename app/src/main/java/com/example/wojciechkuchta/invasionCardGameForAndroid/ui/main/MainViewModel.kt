package com.example.wojciechkuchta.invasionCardGameForAndroid.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import java.io.Serializable

class MainViewModel : ViewModel() {
    val game = MutableLiveData<Game>()

    fun initGame() {
        game.value = Game(
            0,
            listOf(
                Card("Goblin", 1),
                Card("Orc", 2),
                Card("Dragon", 5)
            ),
            listOf()
        )
    }

    fun getKingdomCardName(position : Int) : String? {
        return game.value?.kingdom?.get(position)?.name
    }

    fun getKingdomCardCounter() : Int? {
        return game.value?.kingdom?.size
    }
}

data class Game(
    val turn: Int,
    val kingdom: List<Card>,
    val hand: List<Card>
) : Serializable

data class Card(
    val name: String,
    val power: Int
) : Serializable