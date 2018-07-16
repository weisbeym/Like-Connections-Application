package edu.uc.likeconnectionsapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import edu.uc.likeconnectionsapplication.dao.databaseHelper;

public class MainActivity extends AppCompatActivity {

    databaseHelper myDB;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myDB = new databaseHelper(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            /**
             *
             * @param view
             */
            @Override
            public void onClick( View view ) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
<<<<<<< HEAD
=======
    /*
    we inflate the menu in here, resource file
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Currently shows toasts for clicking anything on options menu

        if(item.getItemId() == R.id.menuSearch){
            Toast.makeText(MainActivity.this, "You've Clicked Search", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menuProfile){
            Toast.makeText(MainActivity.this, "You've Clicked Profile", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menuAbout){
            Toast.makeText(MainActivity.this, "You've Clicked About", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menuRegister){
            Toast.makeText(MainActivity.this, "You've Clicked Register", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menuSettings){
            Toast.makeText(MainActivity.this, "You've Clicked Settings", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
>>>>>>> vincenjg_pull
}
