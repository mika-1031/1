package com.cookandroid.voicenote;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.home:
                Intent homeintent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(homeintent);
                break;
            case R.id.memo:
                Intent memointent = new Intent(getApplicationContext(), memolistActivity.class);
                startActivity(memointent);
        }
        return super.onOptionsItemSelected(item);
    }

}
