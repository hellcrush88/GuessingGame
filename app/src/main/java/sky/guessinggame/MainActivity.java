package sky.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generating random number between 1 to 20
        Random randomGenerator = new Random();
        // 20 is the maximum and 1 is the minimum
        number = randomGenerator.nextInt(20) + 1;
    }

    public void guessNumber(View view){
        EditText edit = (EditText)findViewById(R.id.numberEditText);
        // Converting String to Integer
        int numberGuess = Integer.parseInt(String.valueOf(edit.getText()));
        // Alternative to above code
        // int numberGuess = Integer.parseInt(edit.getText().toString());
        // This code would also work for the conversion.

        // If statement to compare the number entered with the generated number
        // Show toast depending on the number entered
        if(numberGuess == number){
            Toast.makeText(this, "You are correct!!", Toast.LENGTH_SHORT).show();
        }else if(numberGuess > number){
            Toast.makeText(this, "Try lower", Toast.LENGTH_SHORT).show();
        }else if(numberGuess < number){
            Toast.makeText(this, "Try higher", Toast.LENGTH_SHORT).show();
        }
    }
}
