package com.example.testes.demo.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testDividirInteiraExata() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 6;
        int segundoNumero = 3;
        int resultadoEsperado = 2;
        //act
        int resultadoobtido = calc.dividir(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }


    @Test
    void testDividirComResto() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 5;
        int segundoNumero = 2;
        int resultadoEsperado = 2;
        //act
        int resultadoobtido = calc.dividir(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }

    @Test
    void testDividirPorZero() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 5;
        int segundoNumero = 0;
        int resultadoEsperado = -1;
        //act
        int resultadoobtido = calc.dividir(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }

    @Test
    void testMultiplicarBasico() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 2;
        int segundoNumero = 3;
        int resultadoEsperado = 6;
        //act
        int resultadoobtido = calc.multiplicar(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }

    @Test
    void testMultiplicarPorZero() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 5;
        int segundoNumero = 0;
        int resultadoEsperado = 0;
        //act
        int resultadoobtido = calc.multiplicar(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }

    
    /*
     * <p>Testar a soma de dois numeros inteiros positivos </p>
     */
    @Test
    void testarDoisNumerosInterirosPositivos() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 2;
        int segundoNumero = 3;
        int resultadoEsperado = 5;
        //act
        int resultadoobtido = calc.somar(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
        
    }

    /*
     * <p>Testar a soma de dois numeros inteiros um positivo e outro negativo </p>
     */
    @Test
    void somarDoisNumerosInteiros() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 5;
        int segundoNumero = -3;
        int resultadoEsperado = 2;
        //act
        int resultadoobtido = calc.somar(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
        
    }

    @Test
    void testSubtrairDoisNumerosPositivos() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 5;
        int segundoNumero = 3;
        int resultadoEsperado = 2;
        //act
        int resultadoobtido = calc.subtrair(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }

    @Test
    void testSubtrairDoisNumerosPositivoNegativo() {
        //arrange
        //instaciar os objetos
        Calculadora calc = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        int primeiroNumero = 3;
        int segundoNumero = -2;
        int resultadoEsperado = 5;
        //act
        int resultadoobtido = calc.subtrair(primeiroNumero, segundoNumero);
        //assign
        Assertions.assertEquals(resultadoEsperado, resultadoobtido);
    }
}
