package com.teste.TesteUnitario;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteUnitarioApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TesteUnitarioApplication.class, args);
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um cpf:");
		String cpf= teclado.nextLine();
		System.out.println("O cpf digitado é:" + (ValidadorCpf.validar(cpf) ? "Valido" : "Invalido"));
		teclado.close();
	}

}
