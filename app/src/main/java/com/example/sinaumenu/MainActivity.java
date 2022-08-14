package com.example.sinaumenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = this.getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuNewMsg){
            //Toast.makeText(this, "New Messages di click", Toast.LENGTH_SHORT).show();
            //Intent
            Intent i = new Intent(this, NewMessagesActivity.class);
            this.startActivity(i);
        }
        else if(item.getItemId() == R.id.menuSttg) {
            //Toast.makeText(this, "Settings di click", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, SettingsActivity.class);
            this.startActivity(i);
        }
        else {
            //Toast.makeText(this, "Help di click", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, HelpActivity.class);
            this.startActivity(i);
        }
        return true;
    }
}