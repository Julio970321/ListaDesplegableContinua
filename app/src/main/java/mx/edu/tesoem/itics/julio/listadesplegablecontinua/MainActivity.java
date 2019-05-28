package mx.edu.tesoem.itics.julio.listadesplegablecontinua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner ListaDesplegable;
    GridView Datosgv;
    RadioButton r1,r2,r3,r4:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] Elementossp = {"Suma","Resta","Divicuion","Multiplicacion","Potencia"};
        String[] Elementosgv = {"Nombre","Edad","Correo","Pablo Escobar","22","pablo@tesoem.edu.mx","Jose Ramirez","30",};

        ListaDesplegable = (Spinner) findViewById(R.id.ListaDesplegable);
        Datosgv = (GridView)findViewById(R.id.Datosgv);
        r1 = (RadioButton) findViewById()
        ArrayAdapter<String>elementossp =new ArrayAdapter<String>(this.android.R.layout.simple_spinner_item,Elementossp);
    }
}
