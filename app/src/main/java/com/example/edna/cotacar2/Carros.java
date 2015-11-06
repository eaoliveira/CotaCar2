package com.example.edna.cotacar2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.SparseArray;
import java.util.ArrayList;
import android.view.Menu;
import android.widget.ExpandableListView;


public class Carros extends AppCompatActivity {

    SparseArray<Group> groups = new SparseArray<Group>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carros);
        createData();
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
        MeuAdapter adapter = new MeuAdapter(this, groups);
        listView.setAdapter(adapter);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          }

     public void createData() {
        for (int j = 0; j < 5; j++) {
            Group group = new Group("Test " + j);
            for (int i = 0; i < 2; i++) {
                group.children.add("Sub Item" + i);
            }
            groups.append(j, group);
        }

     }

}
