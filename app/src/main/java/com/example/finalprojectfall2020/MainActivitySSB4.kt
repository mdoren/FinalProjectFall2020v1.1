package com.example.finalprojectfall2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import org.w3c.dom.Text

class MainActivitySSB4 : AppCompatActivity() {

    var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ssb4)

        val smashCharacterSearch: EditText = findViewById(R.id.idEditTextSSB4)
        val smashCharacterButton: Button = findViewById(R.id.idButtonCheckSSB4)
        val characterVillager: TextView = findViewById(R.id.idVillager)
        val characterMegaMan: TextView = findViewById(R.id.idMegaMan)
        val characterWiiFitTrainer: TextView = findViewById(R.id.idWiiFitTrainer)
        val characterRosalinaAndLuma: TextView = findViewById(R.id.idRosalinaAndLuma)
        val characterLittleMac: TextView = findViewById(R.id.idLittleMac)
        val characterGreninja: TextView = findViewById(R.id.idGreninja)
        val characterMiiFighter: TextView = findViewById(R.id.idMiiFighter)
        val characterPalutena: TextView = findViewById(R.id.idPalutena)
        val characterDarkPit: TextView = findViewById(R.id.idDarkPit)
        val characterPacMan: TextView = findViewById(R.id.idPacMan)
        val characterLucina: TextView = findViewById(R.id.idLucina)
        val characterRobin: TextView = findViewById(R.id.idRobin)
        val characterShulk: TextView = findViewById(R.id.idShulk)
        val characterBowserJr: TextView = findViewById(R.id.idBowserJr)
        val characterDuckHunt: TextView = findViewById(R.id.idDuckHunt)
        val characterRyu: TextView = findViewById(R.id.idRyu)
        val characterCloud: TextView = findViewById(R.id.idCloud)
        val characterCorrin: TextView = findViewById(R.id.idCorrin)
        val characterBayonetta: TextView = findViewById(R.id.idBayonetta)
        val scoreKeeper: TextView = findViewById(R.id.idScoreSSB4)

        fun makeCharacterVisible(smashCharacterSearch:EditText, characterAny: TextView) {
            if (characterAny.isInvisible){
                score++
                scoreKeeper.setText("$score/19", TextView.BufferType.EDITABLE)
                smashCharacterSearch.setText("",TextView.BufferType.EDITABLE)
            }
            characterAny.visibility= View.VISIBLE
            if (characterAny == characterRosalinaAndLuma){
                characterRosalinaAndLuma.setText("Rosalina & Luma")
            }
        }

        smashCharacterButton.setOnClickListener {
            val smashCharacterString = smashCharacterSearch.getText().toString()
            when {
                smashCharacterString.trim().equals("Villager", true) -> makeCharacterVisible(smashCharacterSearch,characterVillager)
                smashCharacterString.trim().equals("Mega Man", true) -> makeCharacterVisible(smashCharacterSearch,characterMegaMan)
                smashCharacterString.trim().equals("Wii Fit Trainer", true) -> makeCharacterVisible(smashCharacterSearch,characterWiiFitTrainer)
                smashCharacterString.trim().equals("Rosalina and Luma", true) -> makeCharacterVisible(smashCharacterSearch,characterRosalinaAndLuma)
                smashCharacterString.trim().equals("Rosalina & Luma", true) -> makeCharacterVisible(smashCharacterSearch,characterRosalinaAndLuma)
                smashCharacterString.trim().equals("Rosalina", true) -> makeCharacterVisible(smashCharacterSearch,characterRosalinaAndLuma)
                smashCharacterString.trim().equals("Little Mac", true) -> makeCharacterVisible(smashCharacterSearch,characterLittleMac)
                smashCharacterString.trim().equals("Greninja", true) -> makeCharacterVisible(smashCharacterSearch,characterGreninja)
                smashCharacterString.trim().equals("Mii Fighter", true) -> makeCharacterVisible(smashCharacterSearch,characterMiiFighter)
                smashCharacterString.trim().equals("Mii Fighters", true) -> makeCharacterVisible(smashCharacterSearch,characterMiiFighter)
                smashCharacterString.trim().equals("Mii Brawler", true) -> makeCharacterVisible(smashCharacterSearch,characterMiiFighter)
                smashCharacterString.trim().equals("Mii Swordfighter", true) -> makeCharacterVisible(smashCharacterSearch,characterMiiFighter)
                smashCharacterString.trim().equals("Mii Gunner", true) -> makeCharacterVisible(smashCharacterSearch,characterMiiFighter)
                smashCharacterString.trim().equals("Palutena", true) -> makeCharacterVisible(smashCharacterSearch,characterPalutena)
                smashCharacterString.trim().equals("Dark Pit", true) -> makeCharacterVisible(smashCharacterSearch,characterDarkPit)
                smashCharacterString.trim().equals("Pac-Man", true) -> makeCharacterVisible(smashCharacterSearch,characterPacMan)
                smashCharacterString.trim().equals("PacMan", true) -> makeCharacterVisible(smashCharacterSearch,characterPacMan)
                smashCharacterString.trim().equals("Pac Man", true) -> makeCharacterVisible(smashCharacterSearch,characterPacMan)
                smashCharacterString.trim().equals("Lucina", true) -> makeCharacterVisible(smashCharacterSearch,characterLucina)
                smashCharacterString.trim().equals("Robin", true) -> makeCharacterVisible(smashCharacterSearch,characterRobin)
                smashCharacterString.trim().equals("Shulk", true) -> makeCharacterVisible(smashCharacterSearch,characterShulk)
                smashCharacterString.trim().equals("Bowser Jr.", true) -> makeCharacterVisible(smashCharacterSearch,characterBowserJr)
                smashCharacterString.trim().equals("Bowser Jr", true) -> makeCharacterVisible(smashCharacterSearch,characterBowserJr)
                smashCharacterString.trim().equals("Duck Hunt", true) -> makeCharacterVisible(smashCharacterSearch, characterDuckHunt)
                smashCharacterString.trim().equals("Ryu", true) -> makeCharacterVisible(smashCharacterSearch,characterRyu)
                smashCharacterString.trim().equals("Cloud", true) -> makeCharacterVisible(smashCharacterSearch,characterCloud)
                smashCharacterString.trim().equals("Corrin", true) -> makeCharacterVisible(smashCharacterSearch,characterCorrin)
                smashCharacterString.trim().equals("Bayonetta", true) -> makeCharacterVisible(smashCharacterSearch,characterBayonetta)
                }
        }
    }
}
