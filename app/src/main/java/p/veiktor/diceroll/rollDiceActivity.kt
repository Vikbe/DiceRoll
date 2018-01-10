package p.veiktor.diceroll

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_roll_dice2.*
import java.util.*

fun randomRoll(min: Int, max: Int): Int {
    val r = Random()
    return r.nextInt((max - min) + 1) + min
}


class rollDiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice2)

        rollButton.setOnClickListener {
            val roll = randomRoll(1,6)
            when (roll) {
                1 ->  {
                    diceImage.setImageResource(R.drawable.dice1)
                    youRolled.setText(R.string.rolled1)
                }
                2 ->  {
                    diceImage.setImageResource(R.drawable.dice2)
                    youRolled.setText(R.string.rolled2)
                }
                3 -> {
                    diceImage.setImageResource(R.drawable.dice3)
                    youRolled.setText(R.string.rolled3)
                }
                4 ->  {
                    diceImage.setImageResource(R.drawable.dice4)
                    youRolled.setText(R.string.rolled4)
                }
                5 ->  {
                    diceImage.setImageResource(R.drawable.dice5)
                    youRolled.setText(R.string.rolled5)
                }
                6 ->  {
                    diceImage.setImageResource(R.drawable.dice6)
                    youRolled.setText(R.string.rolled6)
                }
            }
        }
    }
}
