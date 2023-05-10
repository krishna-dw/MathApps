package wishnu.dewabrata.krishna.math.android

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import wishnu.dewabrata.krishna.math.Math
import wishnu.dewabrata.krishna.math.RandomNumbers

class MainActivity : ComponentActivity() {

    private lateinit var numbers: IntArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvA = findViewById<TextView>(R.id.tvA)
        var etAnswer = findViewById<EditText>(R.id.etAnswer)

        etAnswer.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if(keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP){

                Toast.makeText(this, if(Math().multiple(numbers[0], numbers[1]) == etAnswer.text.toString().toInt()) "Correct!" else "Wrong!", Toast.LENGTH_SHORT).show()
                return@OnKeyListener true
            }
            false
        })

        numbers = RandomNumbers(2).generate()
        tvA.text = "${numbers[0]} X ${numbers[1]} ="
    }

}
