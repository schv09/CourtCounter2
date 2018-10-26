package com.example.android.courtcounter2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method triggered when Plus 3 button is clicked for Team A.
     * It increases the score for team A by 3.
     * @param view: plus 3 button view ?
     */
    public void plusThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Method triggered when Plus 2 button is clicked for Team A.
     * It increases the score for team A by 2.
     * @param view: plus 2 button view ?
     */
    public void plusTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Method triggered when Free Throw button is clicked for Team A.
     * It increases the score for team A by 1.
     * @param view: Free Throw button view
     */
    public void freeThrowForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Method triggered when Plus 3 button is clicked for Team B.
     * It increases the score for team B by 3.
     * @param view: plus 3 button view ?
     */
    public void plusThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Method triggered when Plus 2 button is clicked for Team B.
     * It increases the score for team B by 2.
     * @param view: plus 2 button view ?
     */
    public void plusTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Method triggered when Free Throw button is clicked for Team B.
     * It increases the score for team B by 1.
     * @param view: Free Throw button view
     */
    public void freeThrowForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method triggered when the Reset button is clicked.
     * It resets the score to 0 for each team.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
