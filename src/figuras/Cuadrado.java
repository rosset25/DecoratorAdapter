package figuras;

public class Cuadrado extends AsciiArt{
	
	public Cuadrado(int longitud, char caracter) {
			super();
			StringBuilder lineaCuadrado = new StringBuilder();
			this.lineas = new String[longitud];
			
			for(int i = 0; i < longitud; i++) {
				lineaCuadrado.append(caracter);
			}
			
			for(int i = 0; i < longitud; i++) {
				lineas[i] = lineaCuadrado.toString();
			}

			
		
		
	}

}
