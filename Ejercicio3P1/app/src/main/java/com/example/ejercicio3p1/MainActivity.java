package com.example.ejercicio3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textNombre;
    private  EditText textPuesto;
    private EditText textHoras;
    private Button btnEnviar;

    private EditText textNombre1;
    private  EditText textPuesto1;
    private EditText textHoras1;


    private EditText textNombre2;
    private  EditText textPuesto2;
    private EditText textHoras2;

    private  int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNombre=(EditText)findViewById(R.id.textnom);
        textPuesto=(EditText)findViewById(R.id.textpuesto);
        textHoras=(EditText)findViewById(R.id.texthoras);

        textNombre1=(EditText)findViewById(R.id.textnom1);
        textPuesto1=(EditText)findViewById(R.id.textpuesto1);
        textHoras1=(EditText)findViewById(R.id.texthoras1);

        textNombre2=(EditText)findViewById(R.id.textnom2);
        textPuesto2=(EditText)findViewById(R.id.textpuesto2);
        textHoras2=(EditText)findViewById(R.id.texthoras2);

        btnEnviar=findViewById(R.id.btnenviar);

        btnEnviar.setOnClickListener((v) -> {
            String nombre = textNombre.getText().toString();
            String puesto = textPuesto.getText().toString();
            String horas = textHoras.getText().toString();

            String nombre1 = textNombre1.getText().toString();
            String puesto1 = textPuesto1.getText().toString();
            String horas1 = textHoras1.getText().toString();

            String nombre2 = textNombre2.getText().toString();
            String puesto2 = textPuesto2.getText().toString();
            String horas2 = textHoras2.getText().toString();

                if (!nombre.equals("") && !puesto.equals("") && !horas.equals("") || !nombre1.equals("") && !puesto1.equals("") && !horas1.equals("") || !nombre2.equals("") && !puesto2.equals("") && !horas2.equals("")) {

                        if (Double.parseDouble(horas) <= 0 || Double.parseDouble(horas1) <= 0|| Double.parseDouble(horas2) <= 0) {
                            Toast toastMessage = Toast.makeText(this, "Los años deben de ser numero positivo o mayor que 0 (cero)", Toast.LENGTH_LONG);
                            toastMessage.show();
                        } else {
                            Intent intent = new Intent(this, MostrarResultado.class);

                            intent.putExtra("textnombre", nombre);
                            intent.putExtra("textpuesto", puesto);
                            intent.putExtra("texthoras", horas);

                            intent.putExtra("textnombre1", nombre1);
                            intent.putExtra("textpuesto1", puesto1);
                            intent.putExtra("texthoras1", horas1);

                            intent.putExtra("textnombre2", nombre2);
                            intent.putExtra("textpuesto2", puesto2);
                            intent.putExtra("texthoras2", horas2);

                            startActivity(intent);

                        }

                }else{
                            Toast toastMessage = Toast.makeText(this, "Tiene que rellenar todos los campos", Toast.LENGTH_LONG);
                            toastMessage.show();
                        }
        });
    }

    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
    }

