package com.example.testes.demo.calculadora;

public class TesteManual {
    public static void main(String[] args) {
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
        System.out.println(resultadoobtido);
    }

}
