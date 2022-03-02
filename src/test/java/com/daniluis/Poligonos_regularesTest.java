package com.daniluis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class Poligonos_regularesTest {
    

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    @DisplayName("Test entrada a Menú de poligonos, opción circulo")
    public void testCirculo() {
       
        provideInput("2\n1\n9\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El area es 254"));
        
    }
    
    @Test
    @DisplayName("Test entrada a Menú de poligonos, opción rectangulo")
    public void testRectangulo() {
       
        provideInput("2\n2\n2\n4\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El area es 8.0"));
        
    }
    
    @Test
    @DisplayName("Test entrada a Menú de poligonos, opción triangulo")
    public void testTriangulo() {
       
        provideInput("2\n3\n5\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El area es 11"));
        
    }
    
    @Test
    @DisplayName("Test entrada a Menú de poligonos, opción pentagono")
    public void testPentagono() {
       
        provideInput("2\n5\n5\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El area es 43"));
        
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

}

