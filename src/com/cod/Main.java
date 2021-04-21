package com.cod;

public class Main {
  public static void main(String[] args) {
      if (conexion("pepe@danielcastelao.org")) {
      System.out.println("Listo");
    }
    else {
      System.out.println("Fallo");
    }
    if(conexion2()) {
      System.out.println("Listo");
    }
    else {System.out.println("Fallo");
    }
  }

  public static boolean conexion(String Direccion){
    Comparacion enlace1 = new Comparacion(Direccion);
    System.out.println("Conectando a " + enlace1.ip + ", con el usuario " + Direccion);
    return enlace1.diferenciar();
  }

  public static boolean conexion2() {
    Comparacion enlace2 = new Comparacion();
    System.out.println("Conectando a " + enlace2.ip + ", con el usuario " + enlace2.Direccion);
    return enlace2.diferenciar();
  }
}
