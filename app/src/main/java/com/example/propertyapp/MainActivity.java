package com.example.propertyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView propertyRecyclerView;
    PropertyAdapter propertyAdapter;
    List<com.example.propertyapp.Property> propertyList = new ArrayList<>();

    Integer[] imageList = {R.drawable.burwood, R.drawable.geelong};
    String[] addressList = {"station Street", "South Bank"};
    String[] rentList = {"580 PW", "450 PW"};
    String[] bedRoomList = {"2 BedRoom", "1 BedRoom"};
    String[] bathList = {"2 BathRoom", "1 BathRoom"};
    String[] carList = {"1 CarPark", "1 CarPark"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        propertyRecyclerView = findViewById(R.id.propertyRecyclerView);
        propertyAdapter = new PropertyAdapter(propertyList, MainActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        propertyRecyclerView.setLayoutManager(layoutManager);
        for (int i = 0; i < imageList.length; i++){
            com.example.propertyapp.Property property = new com.example.propertyapp
                    .Property(i, imageList[i], addressList[i], rentList[i], bedRoomList[i], bathList[i], carList[i]);
            propertyList.add(property);
        }
    }
}