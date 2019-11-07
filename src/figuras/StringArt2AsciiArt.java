package figuras;


public class StringArt2AsciiArt extends AsciiArt {
	private String[] lineasSinSalto;
	

	
	public StringArt2AsciiArt(StringArt dibujo) {
		super();
		lineasSinSalto = dibujo.Dibujo().split("\n");
		super.lineas = new String[lineasSinSalto.length];

	}
	
	
	@Override
	public int getAncho() { 
		int max = 0;	 
		 for(String lin : lineasSinSalto) {
			 if(lin.length() > max) {
				 max = lin.length();
			 } 
		 }
		 
		 return max;
	 }
	
	@Override
	public int getAlto() { return lineasSinSalto.length;	}
	
	@Override
	public String[] getLineas() {
		this.Dibuja();
		return lineas; 
		}
	
	@Override
	public void Dibuja() {
			
		int max = this.getAncho();
		 
		 for(int i =0; i < lineasSinSalto.length; i++) {
			 String lineaNueva = rehazLinea(lineasSinSalto[i], max);
			 System.out.println(lineaNueva);
			 lineas[i] = lineaNueva; 
		 }
		 
		
	}
	
	
	private String rehazLinea(String lin, int max) {
		int cantidad = max - lin.length();
		
		for(int i = 0; i < cantidad; i++) {
			lin += " ";
		}
		return lin;
	}

}
