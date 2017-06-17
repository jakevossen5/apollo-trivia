package net.jakevossen.apollotrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class explanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        TextView correctOrNot = (TextView)findViewById(R.id.correctOrNot);
        if (isAnswerCorrect()){
            correctOrNot.setText("Correct!");
        }
        else {
            correctOrNot.setText("Incorrect");
        }

        setExplanation();
    }

    private void setExplanation() {
        Intent intent = getIntent();
        String explanation = intent.getStringExtra("explanation");
        TextView explained = (TextView)findViewById(R.id.explanation);
        explained.setText(explanation);
    }

    public void returnFromExplanation(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("isAnswerCorrect",isAnswerCorrect());
        startActivity(intent);
    }
    public boolean isAnswerCorrect(){
        Intent intent = getIntent();
        boolean isTheAnswerCorrect = intent.getBooleanExtra("isItCorrect",false);
        return isTheAnswerCorrect;
    }

}
