package com.example.finalprojectfall2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivitySSB2 : AppCompatActivity() {

    var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ssb2)

        val smashCharacterSearch: EditText = findViewById(R.id.idEditTextSSB2)
        val smashCharacterButton: Button = findViewById(R.id.idButtonCheckSSB2)
        val characterPeach: TextView = findViewById(R.id.idPeach)
        val characterBowser: TextView = findViewById(R.id.idBowser)
        val characterIceClimbers: TextView = findViewById(R.id.idIceClimbers)
        val characterSheik: TextView = findViewById(R.id.idSheik)
        val characterZelda: TextView = findViewById(R.id.idZelda)
        val characterDrMario: TextView = findViewById(R.id.idDrMario)
        val characterPichu: TextView = findViewById(R.id.idPichu)
        val characterFalco: TextView = findViewById(R.id.idFalco)
        val characterMarth: TextView = findViewById(R.id.idMarth)
        val characterYoungLink: TextView = findViewById(R.id.idYoungLink)
        val characterGanondorf: TextView = findViewById(R.id.idGanondorf)
        val characterMewtwo: TextView = findViewById(R.id.idMewtwo)
        val characterRoy: TextView = findViewById(R.id.idRoy)
        val characterMrGameAndWatch: TextView = findViewById(R.id.idMrGameAndWatch)
        val scoreKeeper:TextView = findViewById(R.id.idScoreSSB2)

        fun makeCharacterVisible(smashCharacterSearch:EditText, characterAny: TextView) {
            if (characterAny.isInvisible){
                score++
                scoreKeeper.setText("$score/14", TextView.BufferType.EDITABLE)
                smashCharacterSearch.setText("",TextView.BufferType.EDITABLE)
            }
            characterAny.visibility= View.VISIBLE
            if (characterAny == characterMrGameAndWatch){
                characterMrGameAndWatch.setText("Mr. Game & Watch")
            }
        }

        smashCharacterButton.setOnClickListener {
            val smashCharacterString = smashCharacterSearch.getText().toString()
            when {
                smashCharacterString.trim().equals("Peach", true) -> makeCharacterVisible(smashCharacterSearch,characterPeach)
                smashCharacterString.trim().equals("Bowser", true) -> makeCharacterVisible(smashCharacterSearch, characterBowser)
                smashCharacterString.trim().equals("Ice Climbers",true) -> makeCharacterVisible(smashCharacterSearch, characterIceClimbers)
                smashCharacterString.trim().equals("Sheik",true) -> makeCharacterVisible(smashCharacterSearch, characterSheik)
                smashCharacterString.trim().equals("Zelda",true) -> makeCharacterVisible(smashCharacterSearch, characterZelda)
                smashCharacterString.trim().equals("Dr Mario",true) -> makeCharacterVisible(smashCharacterSearch, characterDrMario)
                smashCharacterString.trim().equals("Dr. Mario",true) -> makeCharacterVisible(smashCharacterSearch, characterDrMario)
                smashCharacterString.trim().equals("Pichu",true) -> makeCharacterVisible(smashCharacterSearch, characterPichu)
                smashCharacterString.trim().equals("Falco",true) -> makeCharacterVisible(smashCharacterSearch, characterFalco)
                smashCharacterString.trim().equals("Marth",true) -> makeCharacterVisible(smashCharacterSearch, characterMarth)
                smashCharacterString.trim().equals("Young Link",true) -> makeCharacterVisible(smashCharacterSearch, characterYoungLink)
                smashCharacterString.trim().equals("Ganondorf",true) -> makeCharacterVisible(smashCharacterSearch, characterGanondorf)
                smashCharacterString.trim().equals("Mewtwo",true) -> makeCharacterVisible(smashCharacterSearch, characterMewtwo)
                smashCharacterString.trim().equals("Roy",true) -> makeCharacterVisible(smashCharacterSearch, characterRoy)
                smashCharacterString.trim().equals("Mr. Game & Watch",true) -> makeCharacterVisible(smashCharacterSearch, characterMrGameAndWatch)
                smashCharacterString.trim().equals("Mr Game & Watch", true) -> makeCharacterVisible(smashCharacterSearch, characterMrGameAndWatch)
                smashCharacterString.trim().equals("Mr Game and Watch",true) -> makeCharacterVisible(smashCharacterSearch, characterMrGameAndWatch)
                smashCharacterString.trim().equals("Mr. Game and Watch", true) -> makeCharacterVisible(smashCharacterSearch, characterMrGameAndWatch)
            }
        }
    }
}
