package com.example.finalprojectfall2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivitySSB5 : AppCompatActivity() {

    var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ssb5)

        val smashCharacterSearch: EditText = findViewById(R.id.idEditTextSSB5)
        val smashCharacterButton: Button = findViewById(R.id.idButtonCheckSSB5)
        val characterInkling: TextView = findViewById(R.id.idInkling)
        val characterDaisy: TextView = findViewById(R.id.idDaisy)
        val characterRidley: TextView = findViewById(R.id.idRidley)
        val characterSimon: TextView = findViewById(R.id.idSimon)
        val characterRichter: TextView = findViewById(R.id.idRichter)
        val characterChrom: TextView = findViewById(R.id.idChrom)
        val characterDarkSamus: TextView = findViewById(R.id.idDarkSamus)
        val characterKingKRool: TextView = findViewById(R.id.idKingKRool)
        val characterIsabelle: TextView = findViewById(R.id.idIsabelle)
        val characterKen: TextView = findViewById(R.id.idKen)
        val characterIncineroar: TextView = findViewById(R.id.idIncineroar)
        val characterPiranhaPlant: TextView = findViewById(R.id.idPiranhaPlant)
        val characterJoker: TextView = findViewById(R.id.idJoker)
        val characterHero: TextView = findViewById(R.id.idHero)
        val characterBanjoAndKazooie: TextView = findViewById(R.id.idBanjoAndKazooie)
        val characterTerry: TextView = findViewById(R.id.idTerry)
        val characterByleth: TextView = findViewById(R.id.idByleth)
        val characterMinMin: TextView = findViewById(R.id.idMinMin)
        val characterSteve: TextView = findViewById(R.id.idSteve)
        val scoreKeeper: TextView = findViewById(R.id.idScoreSSB5)

        fun makeCharacterVisible(smashCharacterSearch:EditText, characterAny: TextView) {
            if (characterAny.isInvisible){
                score++
                scoreKeeper.setText("$score/19", TextView.BufferType.EDITABLE)
                smashCharacterSearch.setText("",TextView.BufferType.EDITABLE)
            }
            characterAny.visibility= View.VISIBLE
            if (characterAny == characterBanjoAndKazooie){
                characterBanjoAndKazooie.setText("Banjo & Kazooie")
            }
        }

        smashCharacterButton.setOnClickListener {
            val smashCharacterString = smashCharacterSearch.getText().toString()
            when {
                smashCharacterString.equals("Inkling", true) -> makeCharacterVisible(smashCharacterSearch,characterInkling)
                smashCharacterString.equals("Daisy", true) -> makeCharacterVisible(smashCharacterSearch,characterDaisy)
                smashCharacterString.equals("Ridley", true) -> makeCharacterVisible(smashCharacterSearch,characterRidley)
                smashCharacterString.equals("Simon", true) -> makeCharacterVisible(smashCharacterSearch,characterSimon)
                smashCharacterString.equals("Richter", true) -> makeCharacterVisible(smashCharacterSearch,characterRichter)
                smashCharacterString.equals("Chrom", true) -> makeCharacterVisible(smashCharacterSearch,characterChrom)
                smashCharacterString.equals("Dark Samus", true) -> makeCharacterVisible(smashCharacterSearch,characterDarkSamus)
                smashCharacterString.equals("King K. Rool", true) -> makeCharacterVisible(smashCharacterSearch,characterKingKRool)
                smashCharacterString.equals("King K Rool", true) -> makeCharacterVisible(smashCharacterSearch,characterKingKRool)
                smashCharacterString.equals("Isabelle", true) -> makeCharacterVisible(smashCharacterSearch,characterIsabelle)
                smashCharacterString.equals("Ken", true) -> makeCharacterVisible(smashCharacterSearch,characterKen)
                smashCharacterString.equals("Incineroar", true) -> makeCharacterVisible(smashCharacterSearch,characterIncineroar)
                smashCharacterString.equals("Piranha Plant", true) -> makeCharacterVisible(smashCharacterSearch,characterPiranhaPlant)
                smashCharacterString.equals("Joker", true) -> makeCharacterVisible(smashCharacterSearch,characterJoker)
                smashCharacterString.equals("Hero", true) -> makeCharacterVisible(smashCharacterSearch,characterHero)
                smashCharacterString.equals("Banjo & Kazooie", true) -> makeCharacterVisible(smashCharacterSearch,characterBanjoAndKazooie)
                smashCharacterString.equals("Banjo Kazooie", true) -> makeCharacterVisible(smashCharacterSearch,characterBanjoAndKazooie)
                smashCharacterString.equals("Banjo and Kazooie", true) -> makeCharacterVisible(smashCharacterSearch,characterBanjoAndKazooie)
                smashCharacterString.equals("Terry", true) -> makeCharacterVisible(smashCharacterSearch,characterTerry)
                smashCharacterString.equals("Byleth", true) -> makeCharacterVisible(smashCharacterSearch,characterByleth)
                smashCharacterString.equals("Min Min", true) -> makeCharacterVisible(smashCharacterSearch,characterMinMin)
                smashCharacterString.equals("Steve", true) -> makeCharacterVisible(smashCharacterSearch,characterSteve)
            }
        }
    }
}
