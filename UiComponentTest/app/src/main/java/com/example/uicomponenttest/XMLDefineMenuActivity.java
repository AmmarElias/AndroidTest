package com.example.uicomponenttest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class XMLDefineMenuActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menutest);
        textView=(TextView)findViewById(R.id.textview);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.font_color_black:
                textView.setTextColor(Color.BLACK);
                break;
            case R.id.font_color_red:
                textView.setTextColor(Color.RED);
                break;
            case R.id.ordinary:
                Toast.makeText(this,"这是普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_font_big:
                textView.setTextSize(20*2);
                break;
            case R.id.menu_font_middle:
                textView.setTextSize(16*2);
                break;
            case R.id.menu_font_small:
                textView.setTextSize(10*2);
                break;
        }
        return true;
    }
}
