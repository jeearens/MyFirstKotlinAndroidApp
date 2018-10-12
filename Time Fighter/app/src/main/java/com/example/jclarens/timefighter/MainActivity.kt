package com.example.jclarens.timefighter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.AbsListView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton : Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView
    internal var score = 0
    internal var gameStarted = false
    internal lateinit var countDownTimer: CountDownTimer
    internal val initialCountDown : Long = 60000
    internal val countDownInterval: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById<Button>(R.id.tap_me_button)
        gameScoreTextView = findViewById<TextView>(R.id.game_score_text_view)
        timeLeftTextView = findViewById<TextView>(R.id.time_left_text_view)

//      gameScoreTextView.text = getString(R.string.your_score,score.toString())
        val a = getString(R.string.your_score,score.toString())
        gameScoreTextView.setText(a)

        tapMeButton.setOnClickListener { view ->
            incrementScore()
        }
    }
        fun resetGame(){
            score = 0
            gameScoreTextView.setText(getString(R.string.your_score,score.toString()))

            val initialTimeLeft = initialCountDown / 1000
            timeLeftTextView.setText(getString(R.string.time_left,initialTimeLeft.toString()))
        }
    private fun incrementScore() {
        score = score+1

        val newScore = getString(R.string.your_score,score.toString())
        gameScoreTextView.setText(newScore)

    }


}
