package servicios.payperview.com.nuevopermiso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Vespertino on 24/01/2018.
 */

public class VerVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Reproduciendo Vídeo", Toast.LENGTH_SHORT).show();
    }
}
