package br.iftm.edu.testesauto.atividade_a2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.iftm.edu.testesauto.atividade_a2.calculadora.Calculadora;

@SpringBootApplication
public class AtividadeA2Application {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeA2Application.class, args);

		Calculadora calculadora = new Calculadora(3);
		System.out.println("Memoria: " + calculadora.getMemoria());
		calculadora.somar(-3);
		System.out.println("Memoria: " + calculadora.getMemoria());
	}

}
