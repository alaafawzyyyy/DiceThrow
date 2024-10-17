package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieFragment = DieFragment.newInstance(20)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.dicecontainer,dieFragment)
            .commit()

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener{
            ( supportFragmentManager
                .findFragmentById(R.id.dicecontainer) as DieFragment ).throwDie() //it return an object of type fragment(refernce type) to tell the compiler to refernce the diefragment we casting

        }
    }
}