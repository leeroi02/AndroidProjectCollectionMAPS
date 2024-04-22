package com.example.androidprojectcollection;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);
        btnChanger = findViewById(R.id.btnTransformingButton);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item){
        if (item.getItemId()==R.id.mItemChange){
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==R.id.mItemExit){
            finish();
        }else if (item.getItemId()==R.id.mInvi){
            btnChanger.setVisibility(View.INVISIBLE);
        }else if(item.getItemId()==R.id.mCol){
            btnChanger.setBackgroundColor(MAGENTA);
        }else if(item.getItemId()==R.id.mText){
            btnChanger.setTextColor(GREEN);
        } else if(item.getItemId()==R.id.mBorder){
            btnChanger.setBackgroundResource(R.drawable.border_dashed);
        }else if(item.getItemId()==R.id.mSize){
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width =1200;
            params.height = 1200;
            btnChanger.setLayoutParams(params);

        } else if (item.getItemId()==R.id.mItemReset) {
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width =500;
            params.height = 500;
            btnChanger.setBackgroundColor(RED);
            btnChanger.setLayoutParams(params);
        }


        return true;
    }







}
