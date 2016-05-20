package br.univel;


import static org.junit.Assert.*;

import org.junit.Test;

public class AuthTest {

	@Test
	public void testSenhaCerta() {
		assertTrue(new Auth().usuarioValido("admin", "123"));
	}
	
	@Test
	public void testSenhaErrada() {
		assertFalse(new Auth().usuarioValido("admin", "1234"));
	}

	@Test
	public void testUsuarioErrado() {
		assertFalse(new Auth().usuarioValido("leite", "1234"));
	}
	
	@Test(expected=NullPointerException.class)
	public void testSomenteUsuarioNulo() {
		assertFalse(new Auth().usuarioValido(null, "1234"));
	}
	
	@Test(expected=NullPointerException.class)
	public void testSenhaNula() {
		new Auth().usuarioValido(null, null);
	}

}
