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

public class AritmeticaTest {
    
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
    @DisplayName("Test entrada a Menú de Aritmética, opción suma")
    public void testCasoSumaAritmetica() {
       
        provideInput("1\n1\n6\n2\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("8.0"));
        
    }

    @DisplayName("Test entrada a Menú de Aritmética, opción resta")
    public void testCasoRestaAritmetica() {
       
        provideInput("1\n2\n6\n2\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("4.0"));
        
    }

    @DisplayName("Test entrada a Menú de Aritmética, opción multiplicacion")
    public void testCasoDivisionAritmetica() {
       
        provideInput("1\n3\n6\n2\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("12.0"));
        
    }
    @DisplayName("Test entrada a Menú de Aritmética, opción división")
    public void testCasoMultiplicacionAritmetica() {
       
        provideInput("1\n4\n6\n2\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("3.0"));
        
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
}
