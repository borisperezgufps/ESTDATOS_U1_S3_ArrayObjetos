package ufps.semana3.negocio;

public class Biblioteca {

	private Libro[] libros;
	
	public Biblioteca(int cant) {
		libros = new Libro[cant];
	}
	
	/**
	 * Agrega un libro a la biblioteca. El ID se asigna automáticamente con el valor de la posición en el arreglo.
	 * @param titulo
	 * @param nombreAutor
	 * @param anio
	 * @param prestado Indica si está prestado (true) o si no está prestado (false)
	 * @param activo Indica si está activo (true) o si está dado de baja (false)
	 * @return Retorna el identificador del libro
	 */
	public int agregarLibro(String titulo, String nombreAutor, int anio, boolean prestado, boolean activo) {
		
		
		return 0;
	}
	
	/**
	 * Permite que se realice el préstamo de un libro, a partir de su identificador
	 * @param idLibro
	 * @throws Exception Lanza excepción si el libro no se encuentra en la biblioteca
	 */
	public void prestarLibro(int idLibro) throws Exception{
		
		boolean asignado = false;
		
		for(Libro lib : libros) {
			if(lib.getId()==idLibro) {
				lib.setPrestado(true);
				asignado = true;
				break;
			}
		}
		
		if(!asignado)
			throw new Exception("El libro no se encontró. Verifique el identificador");
		
	}
	
	/**
	 * Retira el libro de la biblioteca, y por lo tanto no puede volverse a prestar.
	 * @param idLibro
	 * @throws Exception Lanza excepción si el libro no se encuentra en la biblioteca
	 */
	public void retirarLibro(int idLibro) throws Exception {
		boolean retirado = false;
		
		for(Libro lib : libros) {
			if(lib.getId()==idLibro) {
				lib.setActivo(true);
				retirado = true;
				break;
			}
		}
		
		if(!retirado)
			throw new Exception("El libro no se encontró. Verifique el identificador");
		
		// Importante, este método afecta a otro método de esta clase ya que no se estaría
		// considerando si el libro está activo.
	}
	
	/**
	 * Busca y retorna la primera coincidencia de un libro buscado por el nombre
	 * @param titulo
	 * @return
	 */
	public Libro buscarLibroPorNombre(String titulo){
		Libro libroBuscado = null;
		
		for(Libro lib : libros) {
			if(lib.getTitulo().toLowerCase().indexOf(titulo.toLowerCase())>=0) {
				libroBuscado = lib;
			}
		}
		
		return libroBuscado;
	}
	
	/**
	 * Busca y retorna la primera coincidencia de un libro buscado por el autor
	 * @param nombreAutor
	 * @return
	 */
	public Libro buscarLibroPorAutor(String nombreAutor) {
		Libro libroBuscado = null;
		
		for(Libro lib : libros) {
			if(lib.getNombreAutor().toLowerCase().indexOf(nombreAutor.toLowerCase())>=0) {
				libroBuscado = lib;
			}
		}
		
		return libroBuscado;
	}
	
	// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	// PARA HACER EN CASA
	// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	/**
	 * Encuentra y retorna un arreglo con todas las coincidencias de libros
	 * a partir del título
	 * @param titulo
	 * @return
	 */
	public Libro[] encontrarLibrosPorTitulo(String titulo) {

		return null;
	}
	
	/**
	 * Encuentra y retorna un arreglo con todas las coincidencias de libros
	 * que correspondan con el año indicado
	 * @param anio
	 * @return
	 */
	public Libro[] encontrarLibrosPorTitulo(int anio) {
		
		return null;
	}
	
}
