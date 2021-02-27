package sv.udb.edu.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText c;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tomando los campos a ingresar y el boton por su id
        a =(EditText)findViewById(R.id.txta);
        b = (EditText)findViewById(R.id.txtb);
        c = (EditText)findViewById(R.id.txtc);
        btnCalcular = (Button)findViewById(R.id.button);
        //evento del boton que calculara el sueldo
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //realizando conversion
                calcular(view);

            }
        });
    }

    public void calcular(View view) {
        //realizando conversion
        double Na = Double.parseDouble(a.getText().toString());
        double Nb = Double.parseDouble(b.getText().toString());
        double Nc = Double.parseDouble(c.getText().toString());
        double X1 = 0;
        double X2 = 0;
        double ar = 0;
        double r = 0;
        a.setError(null);
        b.setError(null);
        c.setError(null);
        ar = Math.pow(Nb,2) - (4*Na*Nc);
        r = Math.sqrt(ar);
        X1 = (-Nb + r)/(2*Na);
        X2 = (-Nb - r)/(2*Na);

            Intent i = new Intent(this, Respuestas.class);
            i.putExtra("X2", String.valueOf(X2));
            i.putExtra("X1", String.valueOf(X1));
            i.putExtra("a", String.valueOf(Na));
            i.putExtra("b", String.valueOf(Nb));
            i.putExtra("c", String.valueOf(Nc));
            startActivity(i);
    }

}