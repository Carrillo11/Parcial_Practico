package com.example.ejercicio3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MostrarResultado extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvPuesto;
    private TextView tvHoras;
    private TextView tvSueldo;
    private TextView tvISS;
    private TextView tvAFP;
    private TextView tvRENTA;
    private TextView tvTotal;

    private TextView tvNombre1;
    private TextView tvPuesto1;
    private TextView tvHoras1;
    private TextView tvSueldo1;
    private TextView tvISS1;
    private TextView tvAFP1;
    private TextView tvRENTA1;
    private TextView tvTotal1;

    private TextView tvNombre2;
    private TextView tvPuesto2;
    private TextView tvHoras2;
    private TextView tvSueldo2;
    private TextView tvISS2;
    private TextView tvAFP2;
    private TextView tvRENTA2;
    private TextView tvTotal2;

    private TextView tvMayor;
    private TextView tvMenor;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_resultado);

        tvNombre = (TextView) findViewById(R.id.txtnomr);
        tvPuesto = (TextView) findViewById(R.id.txtpuesto);
        tvHoras = (TextView) findViewById(R.id.txthorasr);
        tvSueldo = (TextView) findViewById(R.id.txtsal);
        tvISS = (TextView) findViewById(R.id.txtISS);
        tvAFP = (TextView) findViewById(R.id.txtAFP);
        tvRENTA = (TextView) findViewById(R.id.txtRENTA);
        tvTotal = (TextView) findViewById(R.id.txtTotal);

        tvNombre1 = (TextView) findViewById(R.id.txtnomr1);
        tvPuesto1 = (TextView) findViewById(R.id.txtpuesto1);
        tvHoras1 = (TextView) findViewById(R.id.txthorasr1);
        tvSueldo1 = (TextView) findViewById(R.id.txtsal1);
        tvISS1 = (TextView) findViewById(R.id.txtISS1);
        tvAFP1 = (TextView) findViewById(R.id.txtAFP1);
        tvRENTA1 = (TextView) findViewById(R.id.txtRENTA1);
        tvTotal1 = (TextView) findViewById(R.id.txtTotal1);

        tvNombre2 = (TextView) findViewById(R.id.txtnomr2);
        tvPuesto2 = (TextView) findViewById(R.id.txtpuesto2);
        tvHoras2 = (TextView) findViewById(R.id.txthorasr2);
        tvSueldo2 = (TextView) findViewById(R.id.txtsal2);
        tvISS2 = (TextView) findViewById(R.id.txtISS2);
        tvAFP2 = (TextView) findViewById(R.id.txtAFP2);
        tvRENTA2 = (TextView) findViewById(R.id.txtRENTA2);
        tvTotal2 = (TextView) findViewById(R.id.txtTotal2);

        tvMayor = (TextView) findViewById(R.id.txtmayor);
        tvMenor = (TextView) findViewById(R.id.txtmenor);
        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("textnombre");
        String puesto = bundle.getString("textpuesto");
        String horas = bundle.getString("texthoras");

        String nombre1 = bundle.getString("textnombre1");
        String puesto1 = bundle.getString("textpuesto1");
        String horas1 = bundle.getString("texthoras1");

        String nombre2 = bundle.getString("textnombre2");
        String puesto2 = bundle.getString("textpuesto2");
        String horas2 = bundle.getString("texthoras2");

        if (Integer.parseInt(horas) > 160) {
            double sld = (160 * 9.75 + (Integer.parseInt(horas) - 160) * 11.50);
            double sliquido = sld - sld * 0.0525 - sld * 0.0688 - sld * 0.1;
            tvNombre.setText(nombre);
            tvPuesto.setText(puesto);
            tvHoras.setText(horas);
            tvSueldo.setText(String.valueOf("$" + sld));
            tvISS.setText(String.valueOf("-$" + Math.round(sld * 0.0525)));
            tvAFP.setText(String.valueOf("-$" + Math.round(sld * 0.0688)));
            tvRENTA.setText(String.valueOf("-$" + Math.round(sld * 0.1)));
            // if(){
            if (puesto.equals("Gerente")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquido) * 0.1 + sliquido)) + "  +10%");
            } else if (puesto.equals("Asistente")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquido) * 0.05 + sliquido)) + "  +5%");
            } else if (puesto.equals("Secretaria")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquido) * 0.03 + sliquido)) + "  +3%");
            } else {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquido) * 0.02 + sliquido)) + "  +2%");
                //    }
            }
        } else {
            double sueldo = ((Integer.parseInt(horas) * 9.75));
            double sliquid = sueldo - sueldo * 0.0525 - sueldo * 0.0688 - sueldo * 0.1;
            tvNombre.setText(nombre);
            tvPuesto.setText(puesto);
            tvHoras.setText(horas);
            tvSueldo.setText(String.valueOf("$" + sueldo));
            tvISS.setText(String.valueOf("-$" + Math.round((sueldo * 0.0525))));
            tvAFP.setText(String.valueOf("-$" + Math.round((sueldo * 0.0688))));
            tvRENTA.setText(String.valueOf("-$" + Math.round((sueldo) * 0.1)));
            if (puesto.equals("Gerente")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquid) * 0.1 + sliquid)) + "  +10%");
            } else if (puesto.equals("Asistente")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquid) * 0.05 + sliquid)) + "  +5%");
            } else if (puesto.equals("Secretaria")) {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquid) * 0.03 + sliquid)) + "  +3%");
            } else {
                tvTotal.setText(String.valueOf("$" + Math.round((sliquid) * 0.02 + sliquid)) + "  +2%");
            }
        }


        if (Integer.parseInt(horas1) > 160) {
            double sld = (160 * 9.75 + (Integer.parseInt(horas1) - 160) * 11.50);
            double sliquido = sld - sld * 0.0525 - sld * 0.0688 - sld * 0.1;
            tvNombre1.setText(nombre1);
            tvPuesto1.setText(puesto1);
            tvHoras1.setText(horas1);
            tvSueldo1.setText(String.valueOf("$" + sld));
            tvISS1.setText(String.valueOf("-$" + Math.round(sld * 0.0525)));
            tvAFP1.setText(String.valueOf("-$" + Math.round(sld * 0.0688)));
            tvRENTA1.setText(String.valueOf("-$" + Math.round(sld * 0.1)));
            if (puesto1.equals("Gerente")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquido) * 0.1 + sliquido)) + "  +10%");
            } else if (puesto1.equals("Asistente")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquido) * 0.05 + sliquido)) + "  +5%");
            } else if (puesto1.equals("Secretaria")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquido) * 0.03 + sliquido)) + "  +3%");
            } else {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquido) * 0.02 + sliquido)) + "  +2%");
            }
        } else {
            double sueldo = ((Integer.parseInt(horas1) * 9.75));
            double sliquid = sueldo - sueldo * 0.0525 - sueldo * 0.0688 - sueldo * 0.1;
            tvNombre1.setText(nombre1);
            tvPuesto1.setText(puesto1);
            tvHoras1.setText(horas1);
            tvSueldo1.setText(String.valueOf("$" + sueldo));
            tvISS1.setText(String.valueOf("-$" + Math.round((sueldo * 0.0525))));
            tvAFP1.setText(String.valueOf("-$" + Math.round((sueldo * 0.0688))));
            tvRENTA1.setText(String.valueOf("-$" + Math.round((sueldo) * 0.1)));
            if (puesto1.equals("Gerente")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquid) * 0.1 + sliquid)) + "  +10%");
            } else if (puesto1.equals("Asistente")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquid) * 0.05 + sliquid)) + "  +5%");
            } else if (puesto1.equals("Secretaria")) {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquid) * 0.03 + sliquid)) + "  +3%");
            } else {
                tvTotal1.setText(String.valueOf("$" + Math.round((sliquid) * 0.02 + sliquid)) + "  +2%");
            }
        }

        if (Integer.parseInt(horas2) > 160) {
            double sld = (160 * 9.75 + (Integer.parseInt(horas2) - 160) * 11.50);
            double sliquido = sld - sld * 0.0525 - sld * 0.0688 - sld * 0.1;
            tvNombre2.setText(nombre2);
            tvPuesto2.setText(puesto2);
            tvHoras2.setText(horas2);
            tvSueldo2.setText(String.valueOf("$" + sld));
            tvISS2.setText(String.valueOf("-$" + Math.round(sld * 0.0525)));
            tvAFP2.setText(String.valueOf("-$" + Math.round(sld * 0.0688)));
            tvRENTA2.setText(String.valueOf("-$" + Math.round(sld * 0.1)));
            if (puesto2.equals("Gerente")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquido) * 0.1 + sliquido)) + "  +10%");
            } else if (puesto2.equals("Asistente")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquido) * 0.05 + sliquido)) + "  +5%");
            } else if (puesto2.equals("Secretaria")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquido) * 0.03 + sliquido)) + "  +3%");
            } else {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquido) * 0.02 + sliquido)) + "  +2%");
            }
        } else {
            double sueldo = ((Integer.parseInt(horas2) * 9.75));
            double sliquid = sueldo - sueldo * 0.0525 - sueldo * 0.0688 - sueldo * 0.1;
            tvNombre2.setText(nombre2);
            tvPuesto2.setText(puesto2);
            tvHoras2.setText(horas2);
            tvSueldo2.setText(String.valueOf("$" + sueldo));
            tvISS2.setText(String.valueOf("-$" + Math.round((sueldo * 0.0525))));
            tvAFP2.setText(String.valueOf("-$" + Math.round((sueldo * 0.0688))));
            tvRENTA2.setText(String.valueOf("-$" + Math.round((sueldo) * 0.1)));
            if (puesto2.equals("Gerente")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquid) * 0.1 + sliquid)) + "  +10%");
            } else if (puesto2.equals("Asistente")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquid) * 0.05 + sliquid)) + "  +5%");
            } else if (puesto2.equals("Secretaria")) {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquid) * 0.03 + sliquid)) + "  +3%");
            } else {
                tvTotal2.setText(String.valueOf("$" + Math.round((sliquid) * 0.02 + sliquid)) + "  +2%");
            }
        }

       /*double sueldotot1 = Double.parseDouble(tvSueldo.getText().toString());
       double sueldotot2 = Double.parseDouble(tvSueldo1.getText().toString());
       double sueldotot3 = Double.parseDouble(tvSueldo2.getText().toString());

       double  salarios[] = {sueldotot1,sueldotot2,sueldotot3};

      double mayor = salarios[0];


        for(int i=1; i<salarios.length; i++){
         double salarioactual =salarios[i];
          if (salarioactual > mayor){
              mayor = salarioactual;
              tvMayor.setText(String.valueOf(mayor));
          }

        }

        double menor = salarios[0];
        for(int i=1; i<salarios.length; i++){
            double salarioactual = salarios[i];
            if(salarioactual < menor){
                menor= salarioactual;
                tvMenor.setText(String.valueOf(menor));
            }
        }

*/
        }
    }
