package com.example.student.homework2;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    Fragment listFragment;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    public void Init() {
        recyclerView = (RecyclerView)findViewById(R.id.list_r_v);
        Config cg = new Config();// Наши данные
        recyclerView.setHasFixedSize(true);//Для улучшения производительности (если уверенны что размер не будет изменяться) /
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);//Создаем наш менеджер компоновки /
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AdapterRecyclerView(cg.getPersonData(), this);//Создаем список из модели адаптер
        recyclerView.setAdapter(adapter);
    }
}
