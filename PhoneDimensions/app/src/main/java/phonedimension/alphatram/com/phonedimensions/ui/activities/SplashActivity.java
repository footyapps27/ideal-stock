package phonedimension.alphatram.com.phonedimensions.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Once ready, navigate to the Main Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
