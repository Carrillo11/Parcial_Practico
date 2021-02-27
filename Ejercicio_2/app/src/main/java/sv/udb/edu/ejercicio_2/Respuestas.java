package sv.udb.edu.ejercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Respuestas extends AppCompatActivity {

    private TextView tvtotal;
    private TextView tvp1;
    private TextView tvp2;
    private TextView tvp3;
    private TextView tvp4;
    private TextView tvpo1;
    private TextView tvpo2;
    private TextView tvpo3;
    private TextView tvpo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        tvtotal = (TextView) findViewById(R.id.lvtot);
        tvp1 = (TextView) findViewById(R.id.lv1);
        tvp2 = (TextView) findViewById(R.id.lv2);
        tvp3 = (TextView) findViewById(R.id.lv3);
        tvp4 = (TextView) findViewById(R.id.lv4);
        tvpo1 = (TextView) findViewById(R.id.lvp1);
        tvpo2 = (TextView) findViewById(R.id.lvp2);
        tvpo3 = (TextView) findViewById(R.id.lvp3);
        tvpo4 = (TextView) findViewById(R.id.lvp4);

        Bundle bundle = getIntent().getExtras();
        String votos = bundle.getString("txtvoto");
        String[] words = votos.split(",");
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int no = 0;
        int cont = 0;
        for (int i=0; i < words.length; i++){
            cont = cont + 1;
            int num = Integer.parseInt(words[i]);
            if(num == 1){
                p1 = p1 + 1;
            }else if(num == 2){
                p2 = p2 + 1;
            }else if(num == 3){
                p3 = p3 + 1;
            }else if(num == 4){
                p4 = p4 + 1;
            }else{
                no = no +1;
            }

        }

        double tot1 = (p1 * 100)/cont;
        double tot2 = (p2 * 100)/cont;
        double tot3 = (p3 * 100)/cont;
        double tot4 = (p4 * 100)/cont;

        tvtotal.setText(String.valueOf(cont));
        tvp1.setText(String.valueOf(p1 + " Votos"));
        tvp2.setText(String.valueOf(p2 + " Votos"));
        tvp3.setText(String.valueOf(p3 + " Votos"));
        tvp4.setText(String.valueOf(p4 + " Votos"));
        tvpo1.setText(String.valueOf(tot1 + "%"));
        tvpo2.setText(String.valueOf(tot2 + "%"));
        tvpo3.setText(String.valueOf(tot3 + "%"));
        tvpo4.setText(String.valueOf(tot4 + "%"));

    }
}