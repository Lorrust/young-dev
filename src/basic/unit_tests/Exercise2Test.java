package basic.unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import basic.stream.ZeroBertoException;

class Exercise2Test {

	private List<String> names;
	private static Exercise2 exercicio;

	@BeforeAll
	static void init() {
		exercicio = new Exercise2();
	}

	@BeforeEach
	void setup() {
		names = new ArrayList<>();
	}

	@Test
	void emptyListShouldThrowException() {

		assertThrows(ZeroBertoException.class, () -> exercicio.searchFirstBerto(names));
		
	}

	@Test
	void oneBertoShouldReturnOneBerto() {

		List<String> names = new ArrayList<>();
		names.add("Portis");
		names.add("Humberto");
		names.add("Epis");

		String result = exercicio.searchFirstBerto(names);

		assertEquals("Humberto", result);

	}

	@Test
	void twoBertoShouldReturnFirstBerto() {

		List<String> names = new ArrayList<>();
		names.add("Roberto");
		names.add("Portis");
		names.add("Humberto");

		String result = exercicio.searchFirstBerto(names);

		assertEquals("Roberto", result);

	}

}
