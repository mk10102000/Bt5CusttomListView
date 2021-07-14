package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChiTietSV extends AppCompatActivity {
ImageView Hinhct;
TextView tenct,masvct;
Button buttonQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chi_tiet_sv);
        Button buttonQuayLai=(Button) findViewById(R.id.buttonQuayLai) ;
        ImageView Hinhct = (ImageView) findViewById(R.id.ImageViewHinhchitet);
        TextView tenct=(TextView) findViewById(R.id.textViewhoten);
        TextView Masvct=(TextView) findViewById(R.id.textViewmasv1);


         Intent intent =getIntent();
         Hinhct.setImageResource(intent.getIntExtra("Hinh",0));
         tenct.setText(intent.getStringExtra("Hoten"));
         Masvct.setText(intent.getStringExtra("Masv"));

buttonQuayLai.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Trangchu.class));
    }
});

    }

}