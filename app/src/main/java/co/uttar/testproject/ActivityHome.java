package co.uttar.testproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActivityHome extends AppCompatActivity
{
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                moveTaskToBack(true);
                break;

            case R.id.logOut:
                sharedPreferences = getSharedPreferences(MainActivity.SHARED_PREF_NAME, MODE_PRIVATE);
                editor = sharedPreferences.edit();
                editor.remove("password");
                editor.commit();

                Log.d("success", "logged out");
                Intent goToHomeActivity = new Intent(this.getApplicationContext(), MainActivity.class);
                startActivity(goToHomeActivity);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public  void Project(View view)
    {
        Intent goToHomeActivity = new Intent(this.getApplicationContext(), ProjectActivity.class);
        startActivity(goToHomeActivity);
    }
}


