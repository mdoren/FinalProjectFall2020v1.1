package com.example.finalprojectfall2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivitySSB3 : AppCompatActivity() {

    var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ssb3)

        val smashCharacterSearch: EditText = findViewById(R.id.idEditTextSSB3)
        val smashCharacterButton: Button = findViewById(R.id.idButtonCheckSSB3)
        val characterMetaKnight: TextView = findViewById(R.id.idMetaKnight)
        val characterPit: TextView = findViewById(R.id.idPit)
        val characterZeroSuitSamus: TextView = findViewById(R.id.idZeroSuitSamus)
        val characterWario: TextView = findViewById(R.id.idWario)
        val characterSnake: TextView = findViewById(R.id.idSnake)
        val characterIke: TextView = findViewById(R.id.idIke)
        val characterPokemonTrainer: TextView = findViewById(R.id.idPokemonTrainer)
        val characterDiddyKong: TextView = findViewById(R.id.idDiddyKong)
        val characterLucas: TextView = findViewById(R.id.idLucas)
        val characterSonic: TextView = findViewById(R.id.idSonic)
        val characterKingDedede: TextView = findViewById(R.id.idKingDedede)
        val characterOlimar: TextView = findViewById(R.id.idOlimar)
        val characterLucario: TextView = findViewById(R.id.idLucario)
        val characterROB: TextView = findViewById(R.id.idROB)
        val characterToonLink: TextView = findViewById(R.id.idToonLink)
        val characterWolf: TextView = findViewById(R.id.idWolf)
        val scoreKeeper:TextView = findViewById(R.id.idScoreSSB3)

        fun makeCharacterVisible(smashCharacterSearch:EditText, characterAny: TextView) {
            if (characterAny.isInvisible){
                score++
                scoreKeeper.setText("$score/16", TextView.BufferType.EDITABLE)
                smashCharacterSearch.setText("",TextView.BufferType.EDITABLE)
            }
            characterAny.visibility= View.VISIBLE
        }

        smashCharacterButton.setOnClickListener {
            val smashCharacterString = smashCharacterSearch.getText().toString()
            when {
                smashCharacterString.trim().equals("Meta Knight", true) -> makeCharacterVisible(smashCharacterSearch,characterMetaKnight)
                smashCharacterString.trim().equals("Pit",true) -> makeCharacterVisible(smashCharacterSearch, characterPit)
                smashCharacterString.trim().equals("Zero Suit Samus",true) -> makeCharacterVisible(smashCharacterSearch, characterZeroSuitSamus)
                smashCharacterString.trim().equals("Wario",true) -> makeCharacterVisible(smashCharacterSearch, characterWario)
                smashCharacterString.trim().equals("Snake", true) -> makeCharacterVisible(smashCharacterSearch, characterSnake)
                smashCharacterString.trim().equals("Ike",true) -> makeCharacterVisible(smashCharacterSearch, characterIke)
                smashCharacterString.trim().equals("Pokemon Trainer",true) ->makeCharacterVisible(smashCharacterSearch, characterPokemonTrainer)
                smashCharacterString.trim().equals("Pokémon Trainer",true) -> makeCharacterVisible(smashCharacterSearch, characterPokemonTrainer)
                smashCharacterString.trim().equals("Squirtle",true) -> makeCharacterVisible(smashCharacterSearch, characterPokemonTrainer)
                smashCharacterString.trim().equals("Ivysaur",true) -> makeCharacterVisible(smashCharacterSearch, characterPokemonTrainer)
                smashCharacterString.trim().equals("Charizard",true) -> makeCharacterVisible(smashCharacterSearch, characterPokemonTrainer)
                smashCharacterString.trim().equals("Diddy Kong", true) -> makeCharacterVisible(smashCharacterSearch, characterDiddyKong)
                smashCharacterString.trim().equals("Lucas", true) -> makeCharacterVisible(smashCharacterSearch, characterLucas)
                smashCharacterString.trim().equals("Sonic",true) -> makeCharacterVisible(smashCharacterSearch, characterSonic)
                smashCharacterString.trim().equals("King Dedede",true) -> makeCharacterVisible(smashCharacterSearch, characterKingDedede)
                smashCharacterString.trim().equals("Olimar",true) -> makeCharacterVisible(smashCharacterSearch, characterOlimar)
                smashCharacterString.trim().equals("Lucario",true) -> makeCharacterVisible(smashCharacterSearch, characterLucario)
                smashCharacterString.trim().equals("ROB",true) -> makeCharacterVisible(smashCharacterSearch, characterROB)
                smashCharacterString.trim().equals("R.O.B.",true) -> makeCharacterVisible(smashCharacterSearch, characterROB)
                smashCharacterString.trim().equals("Toon Link", true) -> makeCharacterVisible(smashCharacterSearch, characterToonLink)
                smashCharacterString.trim().equals("Wolf", true) -> makeCharacterVisible(smashCharacterSearch, characterWolf)
            }
        }
    }
}
