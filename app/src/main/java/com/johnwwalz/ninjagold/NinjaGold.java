package com.johnwwalz.ninjagold;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NinjaGold extends AppCompatActivity {
    private TextView gold;
    private TextView activities;
    private NinjaGoldGame game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja_gold);
        gold = (TextView) findViewById(R.id.score);
        activities = (TextView) findViewById(R.id.activities);
        game = new NinjaGoldGame();
    }
    public void gameButtonPressed(View sender) {
        Button pressedButton = (Button) sender;
        Log.d("gameButtonPressed", pressedButton.getText().toString());
        String result = game.gameTurnWith(pressedButton.getText().toString());
        activities.setText(result);
        gold.setText(game.totalGold());
    }
}
