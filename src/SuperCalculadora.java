/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercalculadora;

/**
 *
 * @author Luis
 */
import java.util.Scanner;
import poligonos_regulares.poligonos_regulares;
import aritmetica_basica.aritmetica;
import ruffini.ruffini;

public class SuperCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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

                    aritmetica.menuAritmertica();

                    break;

                case 2:

                    poligonos_regulares.menuPoligonos();

                    break;

                case 3:

                    ruffini.menu();

                    break;

                default:

                    if (opcion == 4) {

                        System.out.println(" Ha salido de calculadora");

                    } else {

                        System.out.println("Introduzca un valor de 1  a  3");

                    }

            }

        } while (opcion != 4);

    }

}
