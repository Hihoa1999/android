package com.example.dangnhapdangki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.net.MulticastSocket;

public class Dangki extends AppCompatActivity {

    private    String[] user = new String[]
            {
                    "Admin","Abc","Hoa","ChiHoa"
            };
    private    String[] email=new String[]
            {
                    "abc@gmail.com","chihoa@gmail.com","admin@gmail.com"
            };
    private    String[] adress=new String[]
            {
                    "Phu Yen","Binh Dinh","Ha Noi","TP Ho Chi Minh","Hai Phong"
            };
    private AutoCompleteTextView taikhoan;
    private AutoCompleteTextView emaill;
    private MultiAutoCompleteTextView Noio;
    private EditText pass;
    Button bttthoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);

        /*Lay gia tri tu o Edittext*/
        taikhoan=findViewById(R.id.taikhoan);
        /*Khoi tao adapter de lay du lieu tu mang*/
        ArrayAdapter userr=new ArrayAdapter(this,android.R.layout.simple_list_item_1,user);
        taikhoan.setAdapter(userr);

        pass=findViewById(R.id.pass);


        emaill=findViewById(R.id.email);
        ArrayAdapter<String> useremail=new ArrayAdapter(this,android.R.layout.simple_list_item_1,email );
        emaill.setAdapter(useremail);

        Noio=findViewById(R.id.Noio);
        bttthoat=findViewById(R.id.trove);
        bttthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(Dangki.this,MainActivity.class);
                startActivity(it);
            }
        });
        /*
        editText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

         */
    }
    /*
    public void showInput(View v)
    {
        String text=
                "Name :"+this.taikhoan.getText().toString()
                        +"\nTai khoan :" +this.pass.getText().toString()
                        +"\nEmail :"+this.emaill.getText().toString();
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }

     */
    public void showInput(View v)
    {
        String text=
                "Name :"+this.taikhoan.getText().toString();
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
