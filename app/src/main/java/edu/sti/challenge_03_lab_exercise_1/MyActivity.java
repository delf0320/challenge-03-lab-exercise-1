package edu.sti.challenge_03_lab_exercise_1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
    }
    public void delete(View view)
    {
        EditText editText = (EditText) findViewById(R.id.message);
        editText.setText(" ");
    }


}
