package com.cod;

/**
 * @author Pablo Lago Castro
 */

public class Main {

   public static void main(String[] args) {
    if (conexion("pepe@danielcastelao.org")) {
      System.out.println("Listo");
    } else {
      System.out.println("Fallo");
    }
    if (conexion2()) {
      System.out.println("Listo ");
    } else {
      System.out.println("Fallo");
    }
    ;
  }
  //Como en la clase comparacion cambiamos los nombres de las clases para facilitar la lectura
  public static boolean conexion(String Direccion) {
    //Creamos una instancia del singleton y la utilizamos
    Comparacion enlace = Comparacion.getInstance(Direccion);
    System.out.println("Conectando a " + enlace.ip + ", con el usuario " + Direccion);
    return enlace.diferenciar();
  }

  public static boolean conexion2() {
    //Repetimos la secuencia anterior
    Comparacion enlace2 = Comparacion.getInstance();
    System.out.println("Conectando a :" + enlace2.ip + ", con el usuario " + enlace2.Direccion);
    return enlace2.diferenciar();
  }
}