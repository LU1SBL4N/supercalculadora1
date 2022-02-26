package com.daniluis.poligonos_regulares;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Poligonos_regulares {

    public static double areaCirculo(double r) {
        final double PI = Math.PI;
        return (PI * r * r);
    }

    public static double areaRectangulo(double x, double y) {
        return (x * y);
    }

    public static double areaTriangulo(double medir) {
        return ((medir * medir) * ((Math.sqrt(3) / 4)));
    }

    public static double areaPentagono(double medir) {

        return (1.72 * (medir * medir));
    }

    // meter pitagoras aquí
    
    public static void menuPoligonos() {
        Scanner teclado = new Scanner(System.in);
        //declaracion de variables
        int poligono;
        double lado, base, radio, area;

        //constantes            
        
        final String CABECERA_MENU, OPCIONES, SALIR, PEDIR_LADO, PEDIR_BASE, PEDIR_RADIO, ERROR, ADIOS, SOL_AREA;
        CABECERA_MENU = "Indique el polígono regular del cual desea calcular su area:";
        OPCIONES = "\n1. Círculo\n2. Rectángulo\n3. Triángulo \n5. Pentágono";
        SALIR = "\nO. pulse 0 para salir\n";
        PEDIR_RADIO = "Introduzca su radio:";
        PEDIR_BASE = "Introduzca la base";
        PEDIR_LADO = "¿Cuánto mide el lado?";
        SOL_AREA = "El area es ";
        
        ERROR = "Error en la introducción";
        ADIOS = "¡Adios!";

        do {

            System.out.println(CABECERA_MENU + OPCIONES + SALIR);
            poligono = teclado.nextInt();

           
            switch (poligono) {
                case 1: //circulo
                    System.out.println(PEDIR_RADIO);
                    radio = teclado.nextDouble();
                    
                    area=areaCirculo(radio);
                    //necesario redondear para poder comparar resultado (test)
                    System.out.println(SOL_AREA+""+Math.round(area));

                    break;
                case 2: //rectangulo
                    System.out.println(PEDIR_BASE);
                    base = teclado.nextDouble();

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                  
                    area=areaRectangulo(base, lado);
                    System.out.println(SOL_AREA+""+area);
                    
                    break;

                case 3: //triangulo
                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                    area = areaTriangulo(lado);
                    System.out.println(SOL_AREA+""+Math.round(area));
                    break;

                case 5: //pentagono  

                    System.out.println(PEDIR_LADO);
                    lado = teclado.nextDouble();
                    
                    area = areaPentagono(lado);
                    System.out.println(SOL_AREA+""+Math.round(area));
                    break;

                default:
                    if (poligono != 0) {
                        System.out.println(ERROR);
                    } else {
                        System.out.println(ADIOS);
                    }
            }
        } while (poligono < 0);
    }
}