package com.example.windows10.project_mobile;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edpw)
    EditText edpw;
    @BindView(R.id.edemail)
    EditText edemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

@OnClick(R.id.btnSubmit)
    void btnSubmit () {
    String streamail, strpw;

    strpw = edpw.getText().toString();
    streamail = edemail.getText().toString();

    if (strpw.isEmpty() && streamail.isEmpty()){
        Toast.makeText(getApplicationContext(), "Silahkan Daftar Dulu", Toast.LENGTH_LONG).show();


    }else {
        Intent a = new Intent(MainActivity.this, registrasi.class);
        a.putExtra("Password", strpw);
        a.putExtra("Email", streamail);
        startActivity(a);
        finish();
    }
}

        @OnClick (R.id.btndaftar)
        void btndaftar() {
            Intent a = new Intent(MainActivity.this, registrasi.class);
            startActivity(a);
            finish();
    }
                }