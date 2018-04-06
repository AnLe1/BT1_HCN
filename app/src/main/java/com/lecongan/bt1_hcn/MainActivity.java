package com.lecongan.bt1_hcn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtChieuDai, edtChieuRong;
    private Button btnTinh;
    private TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtChieuDai = (EditText) findViewById(R.id.edt_cd);
        edtChieuRong = (EditText) findViewById(R.id.edt_cr);
        btnTinh = (Button) findViewById(R.id.btn_tinh);
        tvKQ = (TextView) findViewById(R.id.tv_kq);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtChieuDai.getText().toString().isEmpty() && !edtChieuRong.getText().toString().isEmpty()){
                    double cd = Double.parseDouble(edtChieuDai.getText().toString());
                    double cr = Double.parseDouble(edtChieuRong.getText().toString());
                    double p = (cd + cr)/2;
                    double s = cd * cr;
                    tvKQ.setText("Chu vi là: "+p+"\n"+"Diện tích là: "+s);
                }else {
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
