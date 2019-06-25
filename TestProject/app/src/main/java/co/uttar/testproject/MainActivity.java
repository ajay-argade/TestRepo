package co.uttar.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {


        private Button b1;
        private EditText email, pwd, name ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)  findViewById(R.id.button);
        email= (EditText) findViewById(R.id.email);
        pwd = (EditText) findViewById(R.id.pwd);

        name = (EditText) findViewById(R.id.name);



    }
    public void Login(View view){
        if( name.getText().toString().equals("ajay") &&
                pwd.getText().toString().equals("ajay"))
        {
            Log.d("success", "logged in");
            Intent gotohomeActivity = new Intent(this.getApplicationContext(),ActivityHome.class);

            startActivity(gotohomeActivity);

            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
        }
        else
        {
            Log.d("fail", "not logg in");
            Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_LONG).show();
        }

    }
}
