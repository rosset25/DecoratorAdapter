package figuras;

public class Triangulo extends AsciiArt{

	
	public Triangulo(int longitud, char caracter) {
		super();
		StringBuilder lineaTriangulo = new StringBuilder();
		String[] lineasTriangulo = new String[longitud];
		this.lineas = new String[longitud];
		
		for(int i = 0; i < longitud; i++) {
			lineaTriangulo.append(caracter);
			lineasTriangulo[i] = lineaTriangulo.toString();
		}
		
		
		for(int i =0; i < lineasTriangulo.length; i++) {
			StringBuilder blancos = new StringBuilder(lineasTriangulo[i]);
			for(int j = i +1 ; j < longitud ; j++) {
				blancos.append(" ");
				
			}
			
			this.lineas[i] = blancos.toString();
			
		}
		
		
		
	}
}
