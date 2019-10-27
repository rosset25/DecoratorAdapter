package figuras;

public class Marco extends AsciiArtDecorator{
	private AsciiArt asciiArt;
	private char caracterMarco;
	
	
	
	public Marco(AsciiArt asciiArt, char caracterMarco) {
		this.asciiArt = asciiArt;
		this.caracterMarco = caracterMarco;
	}


	@Override
	public int getAncho() {
		return asciiArt.getAncho() + 2;
	}


	@Override
	public int getAlto() {
		return asciiArt.getAlto() + 2;
	}


	@Override
	public String[] getLineas() {
		
		StringBuilder lineaMarco = new StringBuilder();
		String[] marcoFinal = new String[this.getAlto()];
		
		for(int i = 0; i < this.getAncho(); i++) {
			lineaMarco.append(this.caracterMarco);
		}
		
		//Rellenadas la primera y la última línea del marco
		marcoFinal[0] = lineaMarco.toString();
		marcoFinal[this.getAlto() -1] = lineaMarco.toString(); 
		
		String[] dibujoAntiguo = asciiArt.getLineas();
		
		
		for(int i = 0; i < dibujoAntiguo.length; i++) {
			StringBuilder lineaIntermedia = new StringBuilder();
			lineaIntermedia.append(caracterMarco);

			lineaIntermedia.append(dibujoAntiguo[i]);
			lineaIntermedia.append(caracterMarco);
			marcoFinal[i+1] = lineaIntermedia.toString();
			
		}
		return marcoFinal;

	}

}
