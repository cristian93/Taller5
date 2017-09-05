package com.i053114.taller5;

import android.support.annotation.NonNull;


import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:
                        VentanaDos unoFragment = new VentanaDos();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, unoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        Toast.makeText(MainActivity.this, "ITEM1", Toast.LENGTH_SHORT).show();
                        break;



                    case R.id.item_2:
                        Ventana_tres dosFragment = new Ventana_tres();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, dosFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        Toast.makeText(MainActivity.this, "ITEM2", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item:
                        Ventana_cuatro tresFragment = new Ventana_cuatro();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, tresFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        Toast.makeText(MainActivity.this, "ITEM3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });


    }
    public boolean onCreateOptionsMenu (Menu menu1){
        getMenuInflater().inflate(R.menu.menu,menu1);
        return true;

    }
}

