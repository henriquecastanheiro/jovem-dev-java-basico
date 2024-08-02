package aula.exemplos;
import javax.swing.JOptionPane;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	Boolean estado;
	
	void ligar() {
		JOptionPane.showMessageDialog(null, "A Lâmpada está ligada!");
		estado = true;
	}
	void desligar() {
		JOptionPane.showMessageDialog(null, "A Lâmpada está desligada!");
		estado = false;
	}
	void mudarEstadoLampada(){
		if(estado) {
			desligar();
		}else {
			ligar();
		}
	}
}
