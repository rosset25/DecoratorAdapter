package figuras;

public abstract class AsciiArt {
	protected String[] lineas;
	
	public int getAncho() {return lineas[0].length(); }
	public int getAlto() { return lineas.length;	}
	public String[] getLineas() {return lineas; }
	
	public void Dibuja() {
		for(int i = 0; i < lineas.length; i++) {
			System.out.println(lineas[i]);
		}
	}
	

}
