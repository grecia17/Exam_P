package com.example.exam_p;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class pest2 extends AppCompatActivity {
    BottomNavigationItemView bottomNavigationItemView;

    Item_BlankFragment item01fragment = new Item_BlankFragment();
    Item02_BlankFragment item02fragment = new Item02_BlankFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.corazon:
                Toast.makeText(this,"Corazón",Toast.LENGTH_LONG).show();
            case R.id.search:
                Toast.makeText(this,"Search",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}