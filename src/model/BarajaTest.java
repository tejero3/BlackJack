package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BarajaTest {

	
	@Test
	void barajaNuevaTiene52Cartas() {
		//comprueba el requisito de que una baraja nueva contiene las 52 cartas.
		Baraja baraja = new Baraja();

		assertEquals(52, baraja.cartasRestantes());
	}
}