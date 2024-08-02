package aula.exemplos;

public class TesteLampada {
	
	public static void main(String[] args) {
		
	
	Lampada lampada = new Lampada();
	lampada.modelo = "";

	lampada.ligar();
	
	lampada.mudarEstadoLampada();
	
	lampada.mudarEstadoLampada();
	
	lampada.desligar();
}
}
