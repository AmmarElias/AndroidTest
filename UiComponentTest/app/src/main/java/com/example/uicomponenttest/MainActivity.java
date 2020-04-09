package com.example.uicomponenttest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt_listView;
    private Button bt_alert;
    private Button bt_menu;
    private Button bt_action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_listView=(Button)findViewById(R.id.bt_list_view);
        bt_listView.setOnClickListener((v)->
        {
            Intent intent = new Intent(MainActivity.this,ListViewActivity.class);
            startActivity(intent);
        });

        bt_alert=(Button)findViewById(R.id.bt_alertdialog);
        bt_alert.setOnClickListener((v)->
        {
            AlertDialog.Builder dialog= new AlertDialog.Builder(MainActivity.this).setView(R.layout.custom_dialog)
                    .setCancelable(false)
                    .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dialog.show();
        });

        bt_menu=(Button)findViewById(R.id.bt_xml);
        bt_menu.setOnClickListener((v)->{
            Intent intent = new Intent(MainActivity.this,XMLDefineMenuActivity.class);
            startActivity(intent);
        });

        bt_action=(Button)findViewById(R.id.bt_action_mode);
        bt_action.setOnClickListener((v)->{
            Intent intent = new Intent(MainActivity.this,ContextualActivity.class);
            startActivity(intent);
        });


    }
}
