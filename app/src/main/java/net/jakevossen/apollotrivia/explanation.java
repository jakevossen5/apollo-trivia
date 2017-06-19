package net.jakevossen.apollotrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        setSource();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.info:
                showInfo();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showInfo() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }

    private void setSource() {
        Intent intent = getIntent();
        String source = intent.getStringExtra("source");
        TextView sourceTextView = (TextView)findViewById(R.id.sourceLink);
        sourceTextView.setText(source);
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
