package com.mina.latihanspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner element
        Spinner spinner = findViewById(R.id.combo);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("Pilih Jurusan");
        categories.add("Bisnis Digital");
        categories.add("Budidaya Tanaman Perkebunan");
        categories.add("Teknik Informatika");
        categories.add("Teknik Otomotif");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }
    public void combo (View view){
        //identifier
        Spinner combo  = findViewById(R.id.combo);
        String item = combo.getSelectedItem().toString(); //ambil item yang dipilih
        //proses -> tampilka item yang dipilih pada toast
        Toast.makeText(this, "Anda Memilih: "+item, Toast.LENGTH_SHORT).show();
    }
}