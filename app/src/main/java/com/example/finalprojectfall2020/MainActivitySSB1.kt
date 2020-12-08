package com.example.finalprojectfall2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main_ssb1.*
import org.w3c.dom.Text
import java.util.*

class MainActivitySSB1 : AppCompatActivity() {

    var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ssb1)

        val smashCharacterSearch: EditText = findViewById(R.id.idEditTextSSB1)
        val smashCharacterButton: Button = findViewById(R.id.idButtonCheckSSB1)
        val characterMario: TextView = findViewById(R.id.idMario)
        val characterDonkeyKong: TextView = findViewById(R.id.idDonkeyKong)
        val characterLink: TextView= findViewById(R.id.idLink)
        val characterSamus: TextView= findViewById(R.id.idSamus)
        val characterYoshi: TextView= findViewById(R.id.idYoshi)
        val characterKirby: TextView= findViewById(R.id.idKirby)
        val characterFox: TextView= findViewById(R.id.idFox)
        val characterPikachu: TextView= findViewById(R.id.idPikachu)
        val characterLuigi: TextView= findViewById(R.id.idLuigi)
        val characterNess: TextView= findViewById(R.id.idNess)
        val characterCaptainFalcon: TextView= findViewById(R.id.idCaptainFalcon)
        val characterJigglypuff: TextView= findViewById(R.id.idJigglypuff)
        val scoreKeeper: TextView= findViewById(R.id.idScoreSSB1)


        fun makeCharacterVisible(smashCharacterSearch:EditText, characterAny: TextView) {
            if (characterAny.isInvisible){
                score++
                scoreKeeper.setText("$score/12", TextView.BufferType.EDITABLE)
                smashCharacterSearch.setText("",TextView.BufferType.EDITABLE)
            }
            characterAny.visibility= View.VISIBLE
//            if (score == 12) {
//                scoreKeeper.setTextColor(0x29B71C)
//            }
        }

        smashCharacterButton.setOnClickListener {
            val smashCharacterString = smashCharacterSearch.getText().toString()
            when {
                smashCharacterString.equals("Mario", true) -> makeCharacterVisible(smashCharacterSearch,characterMario)
                smashCharacterString.equals("Donkey Kong", true) -> makeCharacterVisible(smashCharacterSearch, characterDonkeyKong)
                smashCharacterString.equals("Link",true) -> makeCharacterVisible(smashCharacterSearch, characterLink)
                smashCharacterString.equals("Samus",true) -> makeCharacterVisible(smashCharacterSearch, characterSamus)
                smashCharacterString.equals("Yoshi",true) -> makeCharacterVisible(smashCharacterSearch, characterYoshi)
                smashCharacterString.equals("Kirby",true) -> makeCharacterVisible(smashCharacterSearch, characterKirby)
                smashCharacterString.equals("Fox",true) -> makeCharacterVisible(smashCharacterSearch, characterFox)
                smashCharacterString.equals("Pikachu",true) -> makeCharacterVisible(smashCharacterSearch, characterPikachu)
                smashCharacterString.equals("Luigi",true) -> makeCharacterVisible(smashCharacterSearch, characterLuigi)
                smashCharacterString.equals("Ness",true) -> makeCharacterVisible(smashCharacterSearch, characterNess)
                smashCharacterString.equals("Captain Falcon",true) -> makeCharacterVisible(smashCharacterSearch, characterCaptainFalcon)
                smashCharacterString.equals("Jigglypuff",true) -> makeCharacterVisible(smashCharacterSearch, characterJigglypuff)

            }


        }
    }
}

