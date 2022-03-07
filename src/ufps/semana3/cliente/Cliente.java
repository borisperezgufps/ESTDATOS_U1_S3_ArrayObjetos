package ufps.semana3.cliente;

import ufps.semana3.negocio.Biblioteca;
import ufps.semana3.negocio.Libro;

public class Cliente {

	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca(10);
		
		try {
		
			int idLibroA = bib.agregarLibro("Java en acción", "Ernesto Calderón", 2020, false, true);
			int idLibroB = bib.agregarLibro("Java rules", "Susana Martínez", 2017, false, true);
			int idLibroC = bib.agregarLibro("Java es la solución?", "Rafael Manrique", 2016, false, true);
			int idLibroD = bib.agregarLibro("Java en Ukrania", "Sasha Grey", 2022, false, true);
			
			bib.retirarLibro(idLibroC);
			
			bib.prestarLibro(idLibroA);
			bib.prestarLibro(idLibroD);
			bib.prestarLibro(idLibroC);
			
			Libro libroBuscado = bib.buscarLibroPorNombre("rules");
			System.out.println("Se encontró una coincidencia: "+libroBuscado.getTitulo());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
