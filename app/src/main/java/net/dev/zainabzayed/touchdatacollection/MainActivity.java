package net.dev.zainabzayed.touchdatacollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        int id=view.getId();
        Intent intent;

        switch(id){
            default:
                break;

            case R.id.btnNewUser:
                intent= new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
                break;

            case R.id.btnNewTrail:
                intent= new Intent(MainActivity.this, TrailActivity.class);
                startActivity(intent);
                break;

            case R.id.btnExit:
                finish();
                System.exit(0);

        }
    }
}
