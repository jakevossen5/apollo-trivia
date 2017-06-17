package net.jakevossen.apollotrivia;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genNewQuestion();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void genNewQuestion() {
        FactGenerator factGenerator = new FactGenerator();
        Facts facts = factGenerator.genFacts();
        Fact newRandFact = facts.getRandomFact();
        TextView question = (TextView)findViewById(R.id.question);
        RadioButton answer0 = (RadioButton) findViewById(R.id.answer0RadioButton);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1RadioButton);
        RadioButton answer2 = (RadioButton)findViewById(R.id.answer2RadioButton);
        RadioButton answer3 = (RadioButton)findViewById(R.id.answer3RadioButton);

        question.setText(newRandFact.getQuestion());
    }

    public static void onRadioButtonClicked(View view){
    }

    public void submitGenButton(View view){
        Intent intent = new Intent(this, explanation.class);
        startActivity(intent);
    }

}
