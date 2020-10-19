package id.ac.id.telkomuniversity.tass.oktrizapraktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText user, pass;
    private Button buttonLogin, buttonForget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.login);
        buttonForget = findViewById(R.id.forgetpassword);
    }

    public void actionLogin(View v){
        Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
        intent.putExtra("user",user.getText().toString());
        intent.putExtra("pass",pass.getText().toString());
        startActivity(intent);
    }

    public void actionForget(View v){
        Intent intent = new Intent(MainActivity.this, ActivityKetiga.class);
        intent.putExtra("pass",pass.getText().toString());
        startActivity(intent);
    }
}

