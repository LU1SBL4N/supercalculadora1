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
        boolean salir=false;
        final String  SALIDA, ERROR;
        SALIDA = "Adios";
        ERROR = "Opción incorrecta";

        int opcion = 0, opcionAri=0, opcionPol=0, valorUno, valorDos=0, valorTres;

        do {

//            esto era un print

            opcion = teclado.nextInt();

            switch (opcion) {
              
                /*ARITMETICA*/
                case 1:

                    //esto era un print(Aritmetica.menuAritmertica());
                    opcionAri = teclado.nextInt();
                    if(opcionAri != 0){
                      
                      //esto era un print("Introduce el primer valor :");
                      valorUno = teclado.nextInt(); 

                      //esto era un print ("Introduce el segundo valor :");
                      valorDos = teclado.nextInt();

                      Aritmetica Objeto = new Aritmetica(valorUno, valorDos);
                      
                      
                      switch (opcionAri) {
                        case 1:
                          System.out.println(Objeto.suma());
                          break;
                        case 2:
                          System.out.println(Objeto.resta());
                          break;
                        case 3:
                          System.out.println(Objeto.division());
                          break;
                        case 4:
                          System.out.println(Objeto.multiplicacion());
                          break;
                        case 5:
                          System.out.println(Objeto.pitagoras(valorUno, valorDos));
                          break;
                      
                        default:
                          System.out.println(ERROR);
                      }
                                  
                    }else{
                      System.out.println(SALIDA);
                          salir=true;
                    }
                    
                    break;
                    
                 /*POLIGONOS REGULARES*/   
                case 2:

                    //esto era un print (Poligonos_regulares.menuPoligonos());
                    opcionPol = teclado.nextInt();
                    if(opcionPol != 0){
                      
                      //esto era un print("Introduce el valor :");
                      valorUno = teclado.nextInt(); 
                      
                      if(opcionPol==2){ //solo el rectángulo necesita un segundo valor
                        //esto era un print ("Introduce el segundo valor :");
                        valorDos = teclado.nextInt();
                      }
                       
                      switch (opcionPol) {
                        case 1:
                          System.out.println("El area es "+Poligonos_regulares.areaCirculo(valorUno));
                          break;
                        case 2:
                          System.out.println("El area es "+Poligonos_regulares.areaRectangulo(valorUno, valorDos));
                          break;
                        case 3:
                          System.out.println("El area es "+Math.round(Poligonos_regulares.areaTriangulo(valorUno)));
                          break;
                        case 5:
                          System.out.println("El area es "+Poligonos_regulares.areaPentagono(valorUno));
                          break;
                      
                        default:
                          System.out.println(ERROR);
                      }
                                  
                    }else{
                      System.out.println(SALIDA);
                          salir=true;
                    }
                    
                    break;

                case 3:

                    valorUno = teclado.nextInt();
                    valorDos = teclado.nextInt();
                    valorTres = teclado.nextInt();
                    
                    Ruffini Objeto = new Ruffini(valorUno, valorDos, valorTres);
                    
                    System.out.println("La solución es :"   + Objeto.ecuacion()); // si da no a NaN el valor no es retornable
                    
                    break;

                default:

                    if (opcion == 4) {

                        System.out.println(SALIDA);
                        salir=true;

                    } else {

                        System.out.println(ERROR);

                    }

            }

        } while (salir);
        teclado.close();
    }

}
