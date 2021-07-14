package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Trangchu extends AppCompatActivity {

    ListView lvSinhvien;
     ArrayList<Sinhvien> arraySinhvien;
    SinhvienAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        Anhxa();
        adapter=new SinhvienAdapter(this, R.layout.dong_sv,arraySinhvien);
        lvSinhvien.setAdapter(adapter);
    lvSinhvien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent= new Intent(Trangchu.this,ChiTietSV.class);
            String ten= arraySinhvien.get(i).getTen();
            String Masv= arraySinhvien.get(i).getMasv();
            int Hinh=arraySinhvien.get(i).getHinh();
            intent.putExtra("Hoten",ten);
            intent.putExtra("Masv",Masv);
            intent.putExtra("Hinh",Hinh);
            startActivity(intent);

        }
    });

    }

    private void Anhxa() {
        lvSinhvien = (ListView) findViewById(R.id.listViewSinhvien);
        arraySinhvien= new ArrayList<>();
        arraySinhvien.add(new Sinhvien("Phạm Minh Khánh","1811505310117",R.drawable.hinh1));
        arraySinhvien.add(new Sinhvien("Đỗ Lê Huy","1811505310118",R.drawable.hinh2));
        arraySinhvien.add(new Sinhvien("Phạm Tiến Long","1811505310119",R.drawable.hinh3));
        arraySinhvien.add(new Sinhvien("Lê Việt long","1811505310120",R.drawable.hinh4));
        arraySinhvien.add(new Sinhvien("Nguyễn Văn Long","1811505310121",R.drawable.hinh5));
    }


}