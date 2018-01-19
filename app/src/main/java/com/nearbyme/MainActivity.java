package com.nearbyme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_near_by_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tv_near_by_me = (TextView) findViewById(R.id.tv_near_by_me);
        tv_near_by_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, NearByMeMainActivity.class);
                startActivity(intent);

            }
        });
    }
}
