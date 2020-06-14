package com.example.dangnhapdangki;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.app.Dialog;
import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import android.widget.AutoCompleteTextView;
import java.net.MulticastSocket;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private String[] userr =new String[]
            {
              "Admin","Hoa","Abc"
            };
Button btbdangnhap,btbdangki,btbthoat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btbdangnhap=findViewById(R.id.dangnhap);
        btbdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangnhap();
            }
        });

        btbdangki=findViewById(R.id.dangki);
        btbdangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(MainActivity.this,Dangki.class);
                startActivity(it);
            }
        });
        btbthoat=findViewById(R.id.thoat);
        btbthoat.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                  openlert();
             }
         });

    }


    public void dangnhap()
    {
      Dialog dialog=new Dialog(this);
      dialog.setContentView(R.layout.edit_dangnhap);
      dialog.show();
    }
    public void openlert()
    {
      AlertDialog.Builder alert=new AlertDialog.Builder(this);
      alert.setTitle("Thong bao");
      alert.setMessage("Ban thuc su muon thoat");
      alert.setIcon(R.mipmap.ic_launcher);
      alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {

          }
      });
      alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {

          }
      });
      alert.show();
    }



}
