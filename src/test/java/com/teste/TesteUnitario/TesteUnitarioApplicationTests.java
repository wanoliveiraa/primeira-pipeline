package com.teste.TesteUnitario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnitarioApplicationTests {

	@Test
	void testandoCPFValido() {
		var valido=ValidadorCpf.validar("879.477.810-87");
		assertEquals(true,valido);
		
	}
	@Test
	void testandoCPFInvalido() {
		boolean  valido=ValidadorCpf.validar("879.477.810-11");
		assertEquals(false,valido);
		
	}

}
