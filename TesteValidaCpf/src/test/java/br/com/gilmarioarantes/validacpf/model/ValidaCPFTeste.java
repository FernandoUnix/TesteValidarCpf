package br.com.gilmarioarantes.validacpf.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidaCPFTeste {
	ValidaCPF app;

	@Before
	public void setup() {
		app = new ValidaCPF();
	}

	// CT1
	@Test
	public void testaCPFVazio() {
		Assert.assertFalse(app.isCPF(""));
	}

	// CT2
	@Test
	public void testaCPFMaiorOnzeDigitos() {
		Assert.assertFalse(app.isCPF("334624611689"));
	}

	// CT3
	@Test
	public void testaCPFResultadoSubtracaoMenor9() {
		Assert.assertTrue(app.isCPF("33462461168"));
	}

	// CT4
	@Test
	public void testaCPFValido3Digitos() {
		Assert.assertTrue(app.isCPF("191"));
	}

	// CT5
	@Test
	public void testaCPFComLetras() {
		Assert.assertFalse(app.isCPF("abcdefghijl"));
	}

	// CT6
	@Test
	public void testaCPFComLetrasENumeros() {
		Assert.assertFalse(app.isCPF("123cdefgh90"));
	}

	// CT7
	@Test
	public void testaCPFResultadoSubtracaoMaior9() {
		Assert.assertTrue(app.isCPF("01234567890"));
	} 
 
	// CT8
	@Test
	public void testaCPFNumerosIguais() {

		String qtde = "???????????";
		for (int i = 0; i <= 9; i++) {
			String repetidos = qtde.replace("?", Integer.toString(i));
			Assert.assertFalse(app.isCPF(repetidos));
		}
	}
}
