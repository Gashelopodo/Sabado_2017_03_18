package gashe.com.transitionsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    double alpha = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView)findViewById(R.id.myImage);


        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(alpha < 1) {
                    alpha = alpha + 0.1;
                    imageView.setAlpha((float) alpha);
                }
            }
        },0,300);

    }
}


