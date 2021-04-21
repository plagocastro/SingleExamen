package com.cod;
public class Comparacion {

    /*
    Cambiamos el nombre a los diferentes atributos y metodos para facilitar la lectura
    */
    public static String Direccion = "";
    String ip = "127.0.0.2";

    private static Comparacion instance = null;
/*
Creamos un instance con el que le daremos los metodos al  main y que pueda comprobar si ya esta creada
 */

    public static  Comparacion getInstance(){
        if (instance == null){
            instance = new Comparacion();
        }
        Direccion = "anonymous@danielcastelao.org";
        return instance;
    }
    public static  Comparacion getInstance(String direccion2){
        if (instance == null){
            instance = new Comparacion();
        }
        Direccion = direccion2;
        return instance;
    }

    public boolean diferenciar() {
        if (Direccion != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false ;
        }
    }
}