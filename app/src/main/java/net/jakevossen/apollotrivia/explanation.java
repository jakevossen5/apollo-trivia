package net.jakevossen.apollotrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class explanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);
        RadioButton answer0 = (RadioButton) findViewById(R.id.answer0RadioButton);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1RadioButton);
        RadioButton answer2 = (RadioButton)findViewById(R.id.answer2RadioButton);
        RadioButton answer3 = (RadioButton)findViewById(R.id.answer3RadioButton);
    }
    public void returnFromExplanation(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("isAnswerCorrect",isAnswerCorrect());
        startActivity(intent);
    }
    public boolean isAnswerCorrect()

}
