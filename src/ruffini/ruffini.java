/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruffini;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ruffini {

    private int x;
    private int n;
    private int xCuadrado;

    public ruffini( int xCuadrado, int x, int n) {
        
        this.xCuadrado = xCuadrado;
        this.x = x;
        this.n = n;
        
    }

    public ruffini(int x, int n) {
        this.x = x;
        this.n = n;
        this.xCuadrado = 0;

    }

    public String ecuacion() {

        String resultado = " ";

        if (xCuadrado > 0) {

            resultado += (-x + Math.sqrt((Math.pow(x, 2) - 4 * xCuadrado * n))) / 2 * xCuadrado;
            resultado += " y " + (-x - Math.sqrt((Math.pow(x, 2) - 4 * xCuadrado * n))) / 2 * xCuadrado;

        } else {

            resultado += -n / x;

        }

        return resultado;

    }

    public static void menu() {

        Scanner teclado = new Scanner(System.in);

        int valorUno = 0;
        int valorDos = 0;
        int valorTres = 0;

        System.out.println("Introduce el valor xCuadrado");
        valorUno = teclado.nextInt();

        System.out.println("Introduce el valor X");
        valorDos = teclado.nextInt();

        System.out.println("Introduce el valor N");

        valorTres = teclado.nextInt();

        ruffini Ruffi = new ruffini(valorUno, valorDos, valorTres); // si da no a NaN el valor no es retornable

       
        
        System.out.println("La solución es :"   + Ruffi.ecuacion());
        
        
    }

}
