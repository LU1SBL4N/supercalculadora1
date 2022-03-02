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


public class RuffiniTest {
    
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
    @DisplayName("Test entrada a Ruffini")
    public void testRuffiniSegundoGrado() {
       
        provideInput("3\n1\n3\n2\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("La solución es: -1.0 y -2.0"));
        
    }  


    @Test
    @DisplayName("Test entrada a Ruffini")
    public void testRuffiniPrimerGrado() {
       
        provideInput("3\n0\n2\n4\n"); // Ruta del main hacia el metodo
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("La solución es: -2"));
        
    }  

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }









}
