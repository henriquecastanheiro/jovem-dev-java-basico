package aula6.exemplos;

import java.util.Objects;

public class PrincipalObjects {

	public static void main(String[] args) {
		
		new PrincipalObjects();
	}
	
	public PrincipalObjects() {
		String a = null;
		String b = "abc";
		
		System.out.println(Objects.equals(a, b));
	}
}
