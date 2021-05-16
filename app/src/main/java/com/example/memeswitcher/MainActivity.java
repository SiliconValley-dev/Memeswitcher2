package com.example.memeswitcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Button button_next;
    ImageView Bild1;
    DarkModeManager darkModeManager;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        darkModeManager = new DarkModeManager(this);
        setContentView(R.layout.activity_main);

        button_next = (Button) findViewById(R.id.button_next) ;

        Bild1 = (ImageView) findViewById(R.id.Bild1);









        button_next.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Next Button clicked");

                Toast.makeText(getApplicationContext(), "Next Meme coming",Toast.LENGTH_SHORT).show();
                Bild1.setImageResource(R.drawable.bild2);

            }
        }));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.dark_mode) {
            darkModeManager.toggle();
        }
        return true;
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_settings:
                Intent intent = new Intent(MainActivity.this,Settings_Activity.class);
                startActivity(intent);
                break;

            case R.id.nav_aboutus:

        }

    return true;
    }

}