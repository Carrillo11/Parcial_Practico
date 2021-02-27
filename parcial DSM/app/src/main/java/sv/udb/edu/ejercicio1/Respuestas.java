package sv.udb.edu.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Respuestas extends AppCompatActivity {

    private TextView tvx1;
    private TextView tvx2;
    private TextView tva;
    private TextView tvb;
    private TextView tvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        Bundle bundle = getIntent().getExtras();
        String X1 = bundle.getString("X1");
        String X2 = bundle.getString("X2");
        String Na = bundle.getString("a");
        String Nb = bundle.getString("b");
        String Nc = bundle.getString("c");

        Toast notification = Toast.makeText(this, "El X positivo es: " + X1 + "", Toast.LENGTH_LONG);
        notification.show();
        Toast notification2 = Toast.makeText(this, "El X negativo es: " + X2 + "", Toast.LENGTH_LONG);
        notification2.show();

        //asignando textos a textview
        tvx1 = (TextView) findViewById(R.id.txtx1);
        tvx1.setText(X1);
        tvx2 = (TextView) findViewById(R.id.txtx2);
        tvx2.setText(X2);
        tva = (TextView) findViewById(R.id.txtNa);
        tva.setText(Na);
        tvb = (TextView) findViewById(R.id.txtNb);
        tvb.setText(Nb);
        tvc = (TextView) findViewById(R.id.txtNc);
        tvc.setText(Nc);
    }
}