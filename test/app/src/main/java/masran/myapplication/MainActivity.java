package masran.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout buttonremind = (LinearLayout) findViewById(R.id.buttonremind);
        buttonremind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Remind.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonmap = (LinearLayout) findViewById(R.id.buttonmap);
        buttonmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonhealth = (LinearLayout) findViewById(R.id.buttonhealt);
        buttonhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Health.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonhelp = (LinearLayout) findViewById(R.id.buttonsos);
        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Map.class);
                startActivity(intent);
            }
        });
    }
}