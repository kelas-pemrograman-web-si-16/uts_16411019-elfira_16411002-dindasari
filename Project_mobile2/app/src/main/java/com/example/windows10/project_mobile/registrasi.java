package com.example.windows10.project_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class registrasi extends AppCompatActivity {
    @BindView(R.id.edUser)
    EditText edUser;
    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.edpsw)
    EditText edpsw;
    @BindView(R.id.edStatus)
    EditText edstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnd)
    void btnd() {

        String struser, stremail, strpsw, strstatus;

        struser = edUser.getText().toString();
        stremail = edemail.getText().toString();
        strpsw = edpsw.getText().toString();
        strstatus = edstatus.getText().toString();

        if (struser.isEmpty() && stremail.isEmpty() && strpsw.isEmpty() && strstatus.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Lengkapi Data", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(registrasi.this, MainActivity.class);
            a.putExtra("User", struser);
            a.putExtra("Email", stremail);
            a.putExtra("Password", strpsw);
            a.putExtra("Status", strstatus);
            startActivity(a);
            finish();
        }
    }
}
