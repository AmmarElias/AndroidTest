package com.example.uicomponenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {
    private String[] text =  {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageId={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog
    ,R.drawable.cat,R.drawable.elephant};

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        List<Map<String,Object>> listItems = new ArrayList<>();
        for(int i =0;i<text.length;i++){
            Map<String,Object> listItem = new HashMap<String, Object>() ;
            listItem.put("text",text[i]);
            listItem.put("imageId",imageId[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.list_item,
                new String[]{"text","imageId"},new int[]{R.id.textView,R.id.iv_imageView});
        this.listView=(ListView)findViewById(R.id.list_view);
        this.listView.setAdapter(simpleAdapter);


        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = text[position];
                Toast.makeText(ListViewActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
