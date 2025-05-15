package org.fis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PuebasUnitarias {
	
	
	@Test
	void test1() {
		String urlPrueba="htt";
		Libro libro = new Libro.Builder()
            .setTitulo("Cien años de soledad")
            .setAutor("Gabriel García Márquez")
            .setGenero("Realismo mágico")
            .setAnioPublicacion(1967)
            .setNumeroCopiasDisponibles(5)
            .build();
		assertNotNull(libro);   //comprobar que se crea la instancia
	}

  @Test
	void test2() {
		String urlPrueba="htt";
		Libro libro = new Libro.Builder()
            .setTitulo("Cien años de soledad")
            .setAutor("Gabriel García Márquez")
            .setGenero("Realismo mágico")
            .setAnioPublicacion(1967)
            .setNumeroCopiasDisponibles(5)
            .build();
		assertEquals(libro.getTitulo(),"Cien años de soledad");      //comprobar que el titulo es el correcto
	}

  @Test
	void test3() {
		String urlPrueba="htt";
		Libro libro = new Libro.Builder()
            .setTitulo("Cien años de soledad")
            .setAutor("Gabriel García Márquez")
            .setGenero("Realismo mágico")
            .setAnioPublicacion(1967)
            .setNumeroCopiasDisponibles(5)
            .build();
		assertEquals(libro.getAutor(),"Gabriel García Márquez");      //comprobar que el autor es el correcto
	}

  @Test
	void test4() {
		String urlPrueba="htt";
		Libro libro = new Libro.Builder()
            .setTitulo("Cien años de soledad")
            .setAutor("Gabriel García Márquez")
            .setGenero("Realismo mágico")
            .setAnioPublicacion(1967)
            .setNumeroCopiasDisponibles(5)
            .build();
		assertEquals(libro.getGenero(),"Realismo mágico");             //comprobar que el genero es el correcto
	}

  @Test
	void test5() {
		String urlPrueba="htt";
		Libro libro = new Libro.Builder()
            .setTitulo("Cien años de soledad")
            .setAutor("Gabriel García Márquez")
            .setGenero("Realismo mágico")
            .setAnioPublicacion(1967)
            .setNumeroCopiasDisponibles(5)
            .build();
		assertNotEquals(libro.setAnioPublicacion(),1968);              //negativa que el año es el correcto
	}
  
}
