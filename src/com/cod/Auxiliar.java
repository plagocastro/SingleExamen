package com.cod;
public class Comparacion {
String Direccion = "";
String ip = "127.0.0.2";
Comparacion(){
    Direccion="anonymous@danielcastelao.org"; }

    Comparacion(String dire1){
    this.Direccion = dire1;
    }

    public boolean diferenciar() {
        if (Direccion!="anonymous@danielcastelao.org") {
            return true;
        }
        else {
            return false;
        }
    }
}
