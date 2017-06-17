package net.jakevossen.apollotrivia;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private Fact newRandFact;
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
        this.newRandFact = newRandFact;

        TextView question = (TextView)findViewById(R.id.question);
        RadioButton answer0 = (RadioButton) findViewById(R.id.answer0RadioButton);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1RadioButton);
        RadioButton answer2 = (RadioButton)findViewById(R.id.answer2RadioButton);
        RadioButton answer3 = (RadioButton)findViewById(R.id.answer3RadioButton);
        //set text
        question.setText(newRandFact.getQuestion());
        answer0.setText(newRandFact.getAnswer(0));
        answer1.setText(newRandFact.getAnswer(1));
        answer2.setText(newRandFact.getAnswer(2));
        answer3.setText(newRandFact.getAnswer(3));
    }

    public static void onRadioButtonClicked(View view){
    }

    public void submitGenButton(View view){
        Intent intent = new Intent(this, explanation.class);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.answersRadioGroup);

        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);

        intent.putExtra("explanation",newRandFact.getExplanation());
        intent.putExtra("isItCorrect",isItCorrect(newRandFact,radioButton));
        intent.putExtra("source",newRandFact.getSource());
        startActivity(intent);
    }

    private boolean isItCorrect(Fact ourFact, RadioButton radioButton) {
        return radioButton.getText().equals(ourFact.getCorrectAnswer());
    }

}
