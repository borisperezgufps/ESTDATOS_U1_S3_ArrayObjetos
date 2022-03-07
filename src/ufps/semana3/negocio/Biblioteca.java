package ufps.semana3.negocio;

public class Biblioteca {

	private Libro[] libros;
	
	public Biblioteca(int cant) {
		libros = new Libro[cant];
	}
	
	/**
	 * Agrega un libro a la biblioteca. El ID se asigna autom�ticamente con el valor de la posici�n en el arreglo.
	 * @param titulo
	 * @param nombreAutor
	 * @param anio
	 * @param prestado Indica si est� prestado (true) o si no est� prestado (false)
	 * @param activo Indica si est� activo (true) o si est� dado de baja (false)
	 * @return Retorna el identificador del libro
	 */
	public int agregarLibro(String titulo, String nombreAutor, int anio, boolean prestado, boolean activo) {
		
		
		return 0;
	}
	
	/**
	 * Permite que se realice el pr�stamo de un libro, a partir de su identificador
	 * @param idLibro
	 * @throws Exception Lanza excepci�n si el libro no se encuentra en la biblioteca
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
			throw new Exception("El libro no se encontr�. Verifique el identificador");
		
	}
	
	/**
	 * Retira el libro de la biblioteca, y por lo tanto no puede volverse a prestar.
	 * @param idLibro
	 * @throws Exception Lanza excepci�n si el libro no se encuentra en la biblioteca
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
			throw new Exception("El libro no se encontr�. Verifique el identificador");
		
		// Importante, este m�todo afecta a otro m�todo de esta clase ya que no se estar�a
		// considerando si el libro est� activo.
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
	 * a partir del t�tulo
	 * @param titulo
	 * @return
	 */
	public Libro[] encontrarLibrosPorTitulo(String titulo) {

		return null;
	}
	
	/**
	 * Encuentra y retorna un arreglo con todas las coincidencias de libros
	 * que correspondan con el a�o indicado
	 * @param anio
	 * @return
	 */
	public Libro[] encontrarLibrosPorTitulo(int anio) {
		
		return null;
	}
	
}
