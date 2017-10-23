package apps.cursos.com.integrandomapas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardview1;
    CardView cardview2;
    CardView cardview3;
    CardView cardview4;

    public static String EXTRA_LUGAR= "Lugar";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardview1 = (CardView) findViewById(R.id.cvCardview1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this , MapsActivity.class);
                i.putExtra(EXTRA_LUGAR,1);
                startActivity(i);
            }
        });

        cardview2 = (CardView) findViewById(R.id.cvCardview2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this , MapsActivity.class);
                i.putExtra(EXTRA_LUGAR,2);
                startActivity(i);
            }
        });

        cardview3 = (CardView) findViewById(R.id.cvCardview3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this , MapsActivity.class);
                i.putExtra(EXTRA_LUGAR,3);
                startActivity(i);
            }
        });

        cardview4 = (CardView) findViewById(R.id.cvCardview4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this , MapsActivity.class);
                i.putExtra(EXTRA_LUGAR,4);
                startActivity(i);
            }
        });



    }



}
