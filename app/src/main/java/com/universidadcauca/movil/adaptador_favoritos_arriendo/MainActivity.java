package com.universidadcauca.movil.adaptador_favoritos_arriendo;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    int[] imagen_casa = {R.drawable.casa,R.drawable.casa_2,R.drawable.casa_3,R.drawable.casa_4,R.drawable.casa_4};
    String[] descripciones;
    String[] categoria;
    Favoritos_Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lista_favoritos);
        descripciones = getResources().getStringArray(R.array.descripciones_casas);
        categoria= getResources().getStringArray(R.array.tipo);

        int i =0;
        adapter= new Favoritos_Adapter(getApplicationContext(),R.layout.adapter_favoritos);
        listView.setAdapter(adapter);


        for(String descripcion:  descripciones){

            Favoritos_Data_Provider data_provider = new Favoritos_Data_Provider(imagen_casa[i],descripcion,categoria[i]);

            adapter.add(data_provider);
            i++;
        }



    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
