package com.mina.latihanimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cek (View view){
        //identifier
        CheckBox cb1 = findViewById(R.id.cb1);
        CheckBox cb2 = findViewById(R.id.cb2);
        CheckBox cb3 = findViewById(R.id.cb3);
        //proses
        String pesan ="";
        if (cb1.isChecked())
            pesan = pesan+" -"+cb1.getText();
        if (cb2.isChecked())
            pesan = pesan+" -"+cb2.getText();
        if (cb3.isChecked())
            pesan = pesan+" -"+cb3.getText();
        Toast.makeText(this, "Hobi Kamu: "+pesan, Toast.LENGTH_SHORT).show();
    }
}