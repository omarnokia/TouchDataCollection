package net.dev.zainabzayed.touchdatacollection;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // hide status bar
        // If the Android version is lower than Jellybean, use this call to hide
        // the status bar.
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        else{
            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
            // Remember that you should never show the action bar if the
            // status bar is hidden, so hide that too if necessary.
            //ActionBar actionBar = getActionBar();
            //actionBar.hide();
        }
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
