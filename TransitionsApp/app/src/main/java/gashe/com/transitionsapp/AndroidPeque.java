package gashe.com.transitionsapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class AndroidPeque extends AppCompatActivity {

    ImageView android_peque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_peque);

        android_peque = (ImageView)findViewById(R.id.imagePeque);
        android_peque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroidPeque.this, AndroidGrande.class);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    Log.d(getClass().getCanonicalName(), "LOLLIPOP VERSION");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(AndroidPeque.this, android_peque, "roboto");
                    startActivity(intent, activityOptions.toBundle());
                }else{
                    startActivity(intent);
                }

            }
        });

    }
}
