package sv.udb.edu.ejercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText voto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        voto = (EditText) findViewById(R.id.txtvoto);
    }

    public void segundaActividad (View v) {

        Intent i = new Intent(this, Respuestas.class);
        i.putExtra("txtvoto", voto.getText().toString());
        startActivity(i);
    }
}