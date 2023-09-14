package com.tugas.tugasregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Negara extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView Negara;
    ArrayAdapter<CharSequence> Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);
        Negara= findViewById(R.id.List_negara);

        Adapter= ArrayAdapter.createFromResource(this, R.array.Negara, android.R.layout.simple_expandable_list_item_1);
        Negara.setAdapter(Adapter);
        Negara.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}