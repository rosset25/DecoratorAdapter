package figuras;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<AsciiArt> cosas = new ArrayList<AsciiArt>();
		cosas.add(new Cuadrado(3, 'o'));
		//cosas.add(new Triangulo(5, 't'));
		
		
		
		
		for(AsciiArt cosa: cosas) {
			//Dibuja(new DuplicaHorizontal(cosa));
			Dibuja(new Marco(new DuplicaHorizontal(cosa), '·'));
		
		}
		
		
	}
	
	public static void Dibuja(AsciiArt asciiArt) {
		for(String linea: asciiArt.getLineas()) {
			System.out.println(linea);
		}
	}

}
