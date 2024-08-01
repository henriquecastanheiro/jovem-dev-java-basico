package aula.exemplos;

import java.util.ArrayList;
import java.util.List;

public class Introducao {
	
	public static void main(String[] args) {
		

		List<String> lista = new ArrayList<String>();
		lista.add("abc");
		lista.add("def");
		lista.add("ghj");
		
		lista.forEach((String s)->{
			System.out.println(s);
		});
	}
}
