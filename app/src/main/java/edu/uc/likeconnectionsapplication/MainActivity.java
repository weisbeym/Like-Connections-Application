package edu.uc.likeconnectionsapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import edu.uc.likeconnectionsapplication.dao.databaseHelper;
import edu.uc.likeconnectionsapplication.dto.User;

public class MainActivity extends AppCompatActivity {

    databaseHelper myDB;

    public Button btnRegister;
    public Button buttonSearch;
    public Button buttonSignUp;
    //for recyclerView
    public RecyclerView recyclerView;
    public List<User> users = new ArrayList<>();
    private UserAdapter adapter;


//    public void register(View view){
//        Intent goReg = new Intent(this, Register.class);
//        startActivity(goReg);
//    }

    public void goRegister() {
//        buttonSignUp = (Button) findViewById(R.id.btnSignUp);
//        buttonSignUp.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //to be made
//                //insertData();
//            }
//        });

        buttonSearch = (Button) findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goRegister = new Intent(MainActivity.this, Register.class);
                startActivity(goRegister);
            }
        });
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

        if (item.getItemId() == R.id.menuRegister){
            Intent register = new Intent(MainActivity.this, Register.class);
            startActivity(register);
            return false;
        }
        if (item.getItemId() == R.id.menuProfile){
            Intent profile = new Intent(MainActivity.this, Profile.class);
            startActivity(profile);
            return false;
        }

        if (item.getItemId() == R.id.menuSignin){
            Intent signin = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(signin);
            return false;
        }



        if(item.getItemId() == R.id.menuSettings){
            Toast.makeText(MainActivity.this, "You've Clicked Settings", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);



    }

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
        //goRegister();

        //recyclerView setup
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new UserAdapter(getApplicationContext(), users);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }

    /*
    we inflate the menu in here, resource file
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }




}
