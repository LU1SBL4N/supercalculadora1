/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniluis;

/**
 *
 * @author Luis
 */
import java.util.Scanner;

import com.daniluis.ruffini.Ruffini;
import com.daniluis.aritmetica_basica.Aritmetica;
import com.daniluis.poligonos_regulares.Poligonos_regulares;

public class SuperCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("\nFIGURAS GEOMETRICAS"
                    + "\n---------------------------------"
                    + "\nIntroduzca una opcion"
                    + "\n---------------------------------"
                    + "\n1.Aritmetica."
                    + "\n2.Poligonos."
                    + "\n3.Rufini."
                    + "\n4.Salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    Aritmetica.menuAritmertica();

                    break;

                case 2:

                    Poligonos_regulares.menuPoligonos();

                    break;

                case 3:

                    Ruffini.menu();

                    break;

                default:

                    if (opcion == 4) {

                        System.out.println(" Ha salido de calculadora");

                    } else {

                        System.out.println("Introduzca un valor de 1  a  3");

                    }

            }

        } while (opcion != 4);
        teclado.close();
    }

}
