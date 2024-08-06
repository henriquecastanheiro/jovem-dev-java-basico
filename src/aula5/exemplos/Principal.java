package aula5.exemplos;

import java.time.LocalDateTime;
import java.util.Optional;

public class Principal {
	
	public static void main(String[] args) {
		
		new Principal();
	}
	
	public Principal( ) {
		String s = getString();
		
		Optional<String> optS = Optional.ofNullable(s);
		
		System.out.println(optS.orElseGet(() -> getValorPadrao()));
		System.out.println(optS.orElseThrow(() -> new IllegalArgumentException("Valor incorreto")));
//		System.out.println(optS.orElseGet(this::getValorPadrao));
//		System.out.println(optS.orElse("Não foi possivel obter String"));
		
//		if(s != null) {
//		System.out.println(s.toUpperCase());
//		} else {
////			System.out.println("Não foi possivel obter String");
//		}
	}
	private String getValorPadrao() {
		System.out.println("ENTROU NO MÉTODO GETVALORPADRAO");
		return "Não foi possível obter uma String";
	}
	private String getString() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
		
	}
}
