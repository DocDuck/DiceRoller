package com.alexmitin.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        rollBtn.text = "Lets Roll!"
        rollBtn.setOnClickListener {
            Toast.makeText(this, "Кубик брошен!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableRes = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableRes)
    }
}
