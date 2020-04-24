package com.micronautnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NumberClient numberClient;

    EditText inputText;
    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        outputView = findViewById(R.id.outputText);
    }

    public void buttonClicked(View view) {
        String numberToResearch = inputText.getText().toString();
        NumberInfo result = numberClient.researchNumber(numberToResearch);
        outputView.setText(result.getText());
    }
}
