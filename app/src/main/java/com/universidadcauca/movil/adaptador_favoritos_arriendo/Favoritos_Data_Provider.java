package com.universidadcauca.movil.adaptador_favoritos_arriendo;

/**
 * Created by Alvaro on 06/04/2015.
 */
public class Favoritos_Data_Provider {


    private int imagen_casa_recurso;
    private String descripcion_casa;
    private String tipo_casa;

    public int getImagen_casa_recurso() {
        return imagen_casa_recurso;
    }

    public Favoritos_Data_Provider(int imagen_casa_recurso,String descripcion_casa,String tipo_casa){

        this.setImagen_casa_recurso(imagen_casa_recurso);
        this.setDescripcion_casa(descripcion_casa);
        this.setTipo_casa(tipo_casa);

    }

    public void setImagen_casa_recurso(int imagen_casa_recurso) {
        this.imagen_casa_recurso = imagen_casa_recurso;
    }

    public String getDescripcion_casa() {
        return descripcion_casa;
    }

    public void setDescripcion_casa(String descripcion_casa) {
        this.descripcion_casa = descripcion_casa;
    }

    public String getTipo_casa() {
        return tipo_casa;
    }

    public void setTipo_casa(String tipo_casa) {
        this.tipo_casa = tipo_casa;
    }
}

