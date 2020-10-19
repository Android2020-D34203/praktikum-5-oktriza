package id.ac.id.telkomuniversity.tass.oktrizapraktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ActivityKetiga extends AppCompatActivity {
    private EditText reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);
        reset = findViewById(R.id.resetPassword);

        if(getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            reset.setText(getIntent().getStringExtra("pass"));
        }else{
            reset.setText(getIntent().getStringExtra("pass"));
        }
    }
}