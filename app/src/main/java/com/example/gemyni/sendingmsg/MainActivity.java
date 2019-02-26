package com.example.gemyni.sendingmsg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    EditText number;
    Button call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        number = findViewById(R.id.etNumber);
        call = findViewById(R.id.btnCall);
        call.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, name.getText() + " đẹp zai");
        i.putExtra("address", "smsto:" + number.getText());
        i.setType("text/plain");
        startActivity(i);


    }
}
