package com.example;

public class Main {
    public static void main(String[] args) {

        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Perez";
        boolean esMayorDeEdad = true; 


    // casteo 
    
        int salarioEntero = (int) salario;
        System.out.println(salarioEntero);

        //con el casteo se pierde los decimales

        long codigoPostalLong = (long)codigoPostal;
        System.out.println(codigoPostalLong);

        //con el casteo se cambia el tamaño de almacenamiento de 16 bits a 64 bits

    // parseo

        String numeroStr = "12345678";
        int numeroInt = Integer.parseInt(numeroStr);//convierte la variable a un valor entero utilizado el parseo
        System.out.println(numeroInt);//imprime la variable como un valor entero

        String decimalStr = "3.14159";
        double decimalValor = Double.parseDouble(decimalStr);//convierte a variable a un valor decimal utilizando el metodo parseo
        System.out.println(decimalValor);//imprimer la variable con un valor decimal


        
    }
}