package br.iftm.edu.testesauto.atividade_a2.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    public static Calculadora calculadoraConstrutorSemParametro;
    public static Calculadora calculadoraConstrutorComParametro;

    @BeforeAll
    public static void Configurartestes(){
        calculadoraConstrutorSemParametro = new Calculadora();
        calculadoraConstrutorComParametro = new Calculadora(3);
    }
    @BeforeEach
    public void zerarMemoria(){
        calculadoraConstrutorComParametro = new Calculadora(3);
    }
    @Test
    public void testarConstrutorSemParametro(){
        //arrange
        //instaciar os objetos
        //Calculadora calculadora = new Calculadora();
        //definir o cenario de teste
            //definir as entradas
        //Integer memoria = calculadora.getMemoria();
        Integer resultadoEsperado = 0;
        //act
        Integer resultadoObtido = calculadoraConstrutorSemParametro.getMemoria();
        //assingn
        Assertions.assertEquals(resultadoEsperado, resultadoObtido); 
    }

    @Test
    public void testarConstrutorComParametroInteiroPositivo(){
        //Arrange
        //instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        //definir o cenario de teste
        Integer resultadoEsperado = 3;
        //Act
        Integer resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        //Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    @Test
    public void testarConstrutorComParametroInteiroNegativo(){
        //Arrange
        //instaciar os objetos
        Calculadora calculadora = new Calculadora(-3);
        //definir o cenario de teste
        Integer resultadoEsperado = -3;
        //Act
        Integer resultadoObtido = calculadora.getMemoria();
        //Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
        
    }

    /**
     * Implemente os testes do método somar: somar um número positivo, somar um número
negativo
     */

    @Test
    public void testarSomarNumeroPositivo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = 3;
        int resultadoEsperado = 6;
        // Act
        calculadoraConstrutorComParametro.somar(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testarSomarNumeroNegativo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = -3;
        int resultadoEsperado = 0;
        // Act
        calculadoraConstrutorComParametro.somar(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     *Implemente os testes do método subtrair: subtrair um número positivo, subtrair um número
    negativo.
     */
    @Test
    public void testarSubtrairNumeroPositivo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = 3;
        int resultadoEsperado = 0;
        // Act
        calculadoraConstrutorComParametro.subtrair(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
    @Test
    public void testarSubtrairNumeroNegativo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = -3;
        int resultadoEsperado = 6;
        // Act
        calculadoraConstrutorComParametro.subtrair(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Implemente os testes do método multiplicar: multiplicar um número positivo e multiplicar
um número negativo.
     */
    @Test
    public void testarMultiplicarNumeroPositivo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = 3;
        int resultadoEsperado = 9;
        // Act
        calculadoraConstrutorComParametro.multiplicar(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
    @Test
    public void testarMultiplicarNumeroNegativo() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = -3;
        int resultadoEsperado = -9;
        // Act
        calculadoraConstrutorComParametro.multiplicar(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Implemente os testes do método dividir: dividir por valor 0, dividir por um valor positivo e
dividir por um valor negativo. A divisão por zero deverá retornar uma exception.

     */
    @Test
    public void testarDividirPorZero() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = 0;
        String resultadoEsperado = "Divisão por zero!!!";
        // Act
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            calculadoraConstrutorComParametro.dividir(segundoNumero);
        });
        String resultadoObtido = exception.getMessage();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void testarDividirPorNumeroPositivo() throws Exception {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = 3;
        int resultadoEsperado = 1;
        // Act
        calculadoraConstrutorComParametro.dividir(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
    @Test
    public void testarDividirPorNumeroNegativo() throws Exception {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int segundoNumero = -3;
        int resultadoEsperado = -1;
        // Act
        calculadoraConstrutorComParametro.dividir(segundoNumero);
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Implemente os testes para o método zerarMemória. (Utilize o método getMemoria para
verificar se o valor da memória é 0).

     */

    @Test
    public void testarZerarMemoria() {
        // Arrange
        // instaciar os objetos
        //Calculadora calculadora = new Calculadora(3);
        // definir o cenario de teste
        // definir as entradas
        int resultadoEsperado = 0;
        // Act
        calculadoraConstrutorComParametro.zerarMemoria();
        int resultadoObtido = calculadoraConstrutorComParametro.getMemoria();
        // Assign
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
}
