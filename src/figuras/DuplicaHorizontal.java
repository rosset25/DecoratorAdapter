package figuras;

public class DuplicaHorizontal extends AsciiArtDecorator{
	private AsciiArt asciiArt;
	
	
	
	public DuplicaHorizontal(AsciiArt asciiArt) {
		super();
		this.asciiArt = asciiArt;
	}
	
	@Override
	public int getAncho() {
		return asciiArt.getAncho() * 2;
	}

	@Override
	public int getAlto() {
		return asciiArt.getAlto();
	}

	@Override
	public String[] getLineas() {
		String[] dibujoAntiguo = asciiArt.getLineas();
		String[] duplicado = new String[this.getAlto()];
		
		for(int i=0; i < duplicado.length; i++) {
			duplicado[i] = dibujoAntiguo[i] + dibujoAntiguo[i] ;
		}

		return duplicado;
	}

}
