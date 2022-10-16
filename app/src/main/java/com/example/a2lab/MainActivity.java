package com.example.a2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init spinner
        Spinner spinner = (Spinner) findViewById(R.id.spOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void bttnCountOnClick(View view) {
        //get selected option from spinner
        Spinner spinner = (Spinner) findViewById(R.id.spOptions);
        String option = spinner.getSelectedItem().toString();

        //get text from input field
        EditText textField = (EditText) findViewById(R.id.etMain);
        String text = String.valueOf(textField.getText());

        TextView count = (TextView) findViewById(R.id.tvCount);
        //check if text is empty
        if(text.length() == 0){
            count.setText("0");
            Toast.makeText(getApplicationContext(),"Please enter text!",Toast.LENGTH_SHORT).show();
        }
        else{
            //check if selected option is Words
            if(option.equals("Words")){
                //set count
                count.setText(TextCounter.getWordCount(text));
            }
            //check if selected option is Symbols
            else{
                //set count
                count.setText(TextCounter.getCharCount(text));
            }
        }

    }
}