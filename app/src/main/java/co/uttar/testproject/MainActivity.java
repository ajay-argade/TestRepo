package co.uttar.testproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText email, pwd, name;
    public static String SHARED_PREF_NAME = "mySharedPreference";

  SharedPreferences sharedPreferences;
   SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.email);
        pwd = (EditText) findViewById(R.id.pwd);
        name = (EditText) findViewById(R.id.name);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        editor = sharedPreferences.edit();

        name.setText(sharedPreferences.getString("username", null));

        pwd.setText(sharedPreferences.getString("password", null));




    }


    public void Login(View view) {
        String usrname = name.getText().toString();
        String passwrd = pwd.getText().toString();
        if (!name.getText().toString().equals("ajay") &&
                !pwd.getText().toString().equals("ajay")) {

            Log.d("success", "logged in");
            Intent goToHomeActivity = new Intent(this.getApplicationContext(), ActivityHome.class);
            startActivity(goToHomeActivity);

            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
        } else {
            Log.d("fail", "not log in");
            Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_LONG).show();

        }

        editor.putString("username", usrname);
        editor.putString("password", passwrd);
        editor.commit();


    }
}
