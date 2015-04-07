package com.universidadcauca.movil.adaptador_favoritos_arriendo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

/**
 * Created by Alvaro on 06/04/2015.
 */
public class Favoritos_Adapter extends ArrayAdapter {

    List list= new ArrayList();


    public Favoritos_Adapter(Context context, int resource) {
        super(context, resource);
    }

 static class DataHandler{

     ImageView foto;
     TextView descripcion;
     TextView tipo;
 }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        DataHandler handler;

        if(convertView== null){

            LayoutInflater inflater =(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.adapter_favoritos,parent,false);
            handler = new DataHandler();
            handler.foto = (ImageView)row.findViewById(R.id.casas);
            handler.descripcion=(TextView)row.findViewById(R.id.descripcion);
            handler.tipo=(TextView)row.findViewById(R.id.tipo);
            row.setTag(handler);
        }
        else{
            handler = (DataHandler)row.getTag();

        }

        Favoritos_Data_Provider dataProvider;
        dataProvider =(Favoritos_Data_Provider) this.getItem(position);
        handler.foto.setImageResource(dataProvider.getImagen_casa_recurso());
        handler.descripcion.setText(dataProvider.getDescripcion_casa());
        handler.tipo.setText(dataProvider.getTipo_casa());

        return row;
    }
}
