package com.daniluis.aritmetica_basica;

/**
 *
 * @author Luis
 */
public class Aritmetica {

    private double a;
    private double b;
    private double memoria;
/*
    public Aritmetica(double a) {
        this.a = a;
        this.b = memoria;

    }
*/
    public Aritmetica(double a, double b) {
        this.a = a;
        this.b = b;
        this.memoria=0;
    }
/*
    public double suma(double a) {

        this.memoria += a;
        return this.memoria;

    }
*/
    public double suma() {
        double resultado = this.a + this.b;
        this.memoria = resultado;
        return resultado;

    }
/*
    public double resta(double a) {
        this.memoria -= a;
        return this.memoria;

    }
*/
    public double resta() {
        double resultado = this.a - this.b;
        this.memoria = resultado;
        return resultado;

    }
/*
    public double multiplicacion(double a) {  // pasar dos valores

        this.memoria *= a;
        return this.memoria;

    }
*/
    public double multiplicacion() {
        double resultado = this.a * this.b;
        this.memoria = resultado;
        return resultado;

    }

    public double division() { //valores desde el constructor

        if (this.a == 0) {

            this.a = 1;

        }

        if (this.b == 0) {

            this.b = 1;

        }

        double resultado = this.a / this.b;
        this.memoria = resultado;
        return resultado;

    }
/*
    public double division(double a) { 

        if (this.memoria == 0) {

            this.memoria = 1;

        }

        if (a == 0) {

            a = 1;

        }

        return this.memoria /= a;

    }
*/
    public double pitagoras(double a, double b) {

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    }

    public static String menuAritmertica() {
      String menu="Introduzca la opcion\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Pitagoras\n0.Salir";
      return menu;
    }
    /*menu antiguo*/
//    public static void menuAritmertica() {
//
//        Scanner teclado = new Scanner(System.in);
//
//        int opcion = 0;
//        double valorUno = 0;
//        double valorDos = 0;
//
//        do {
//
//            System.out.println("Introduzca la opcion "
//                    + "\n1.Suma"
//                    + "\n2,Resta"
//                    + "\n3.Multiplicacion"
//                    + "\n4.Division"
//                    + "\n5.Salir");
//
//            opcion = teclado.nextInt();
//
//            Aritmetica Objeto = new Aritmetica(1, 1);
//
//            if (opcion < 5 && opcion > 0) {
//
//                System.out.println("Introduce el primer valor :");
//                valorUno = teclado.nextDouble(); 
//
//                System.out.println("Introduce el segundo valor :");
//                valorDos = teclado.nextDouble();
//
//                Objeto = new Aritmetica(valorUno, valorDos);
//
//            }
//
//            switch (opcion) {
//
//                case 1:
//
//                    if (Objeto.memoria != 0) {
//
//                        System.out.println("Introduzca un valor :");
//                        valorUno = teclado.nextDouble();
//
//                        System.out.println("La suma es :" + Objeto.suma(valorUno));
//
//                    } else {
//
//                        System.out.println("La suma es :" + Objeto.suma());
//
//                    }
//
//                    break;
//
//                case 2:
//
//                    if (Objeto.memoria != 0) {
//
//                        System.out.println("Introduzca un valor :");
//                        valorUno = teclado.nextDouble();
//
//                        System.out.println("La resta es :" + Objeto.resta(valorUno));
//                    } else {
//
//                        System.out.println("La resta es :" + Objeto.resta());
//
//                    }
//
//                    break;
//
//                case 3:
//
//                    if (Objeto.memoria != 0) {
//
//                        System.out.println("Introduzca un valor :");
//                        valorUno = teclado.nextDouble();
//
//                        System.out.println("La multiplicación es :" + Objeto.multiplicacion(valorUno));
//
//                    } else {
//
//                        System.out.println("La multiplicación es :" + Objeto.multiplicacion());
//
//                    }
//
//                    break;
//
//                case 4:
//
//                    if (Objeto.memoria != 0) {
//
//                        System.out.println("Introduzca un valor :");
//                        valorUno = teclado.nextDouble();
//
//                        System.out.println("La división es :" + Objeto.division(valorUno));
//
//                    } else {
//
//                        System.out.println("La división es :" + Objeto.division());
//
//                    }
//
//                    break;
//
//                default:
//
//                    if (opcion == 5) {
//
//                        System.out.println("Saliste de Aritmetica :");
//
//                    } else {
//
//                        System.out.println("Introduzca un numero correcto del 1 al 5");
//                    }
//            }
//
//        } while (opcion < 1);
        //teclado.close();
    //}
}