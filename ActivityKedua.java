package id.ac.id.telkomuniversity.tass.oktrizapraktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
   private TextView teksUser, teksPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        teksUser = findViewById(R.id.textUsername);
        teksPass = findViewById(R.id.textPassword);

        if(getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            teksUser.setText(getIntent().getStringExtra("user"));
            teksPass.setText(getIntent().getStringExtra("pass"));
        }else{
            teksUser.setText(getIntent().getStringExtra("user"));
            teksPass.setText(getIntent().getStringExtra("pass"));
        }
    }
}