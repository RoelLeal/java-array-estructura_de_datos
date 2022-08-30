package com.structure.actividad2_estructuradedatos;
import java.util.Scanner;


public class Actividad2_EstructuraDeDatos {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        double[] arr = new double[10];
        System.out.println("Ingrese 10 numeros: ");
        
        for(int i = 0; i < 10; i++)
            arr[i] = teclado.nextDouble();
        
        for(int i = 0; i < 10; i++)
            System.out.println("Posición: ["+i+"] Valor: "+arr[i]);
    }
    //HOLA
}
