package com.structure.actividad2_estructuradedatos;

public class arreglo {
    public static void main (String [] args) {
        //crear la variable i que servirá como indice del arreglo
         int i;
        //creación e inicialización de mi_arreglo con 10 elementos de tipo entero
         int mi_arreglo[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        //obtener la longitud del arreglo e imprimirla
         System.out.println("Arreglo de longitud: " + mi_arreglo.length);
        //imprime un linea vacia para dejar un renglon en blanco
         System.out.println();
        //ciclo para obtener la longitud y generar indices
         for (i = 0; i < mi_arreglo.length; i++) {
        //impresion de indice y valor almacenado en cada posicion recorrida
         System.out.println("Indice: " + i + " valor: " + mi_arreglo[i] );
         }
   }
}
