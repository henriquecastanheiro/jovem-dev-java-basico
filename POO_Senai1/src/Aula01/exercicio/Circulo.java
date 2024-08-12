package Aula01.exercicio;

public class Circulo {
//Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio e 
//métodos para calcular a área e o perímetro do círculo.
	double raio;
	
	// raio = pi*r²
	public static void calculaAreaCirculo(double raio) {
		double area = Math.pow(raio, 2) * 3.14;
		System.out.println(area);
	}
	// raio = 2*pi*r²
	public static Double calculaPerimetroCirculo(double raio) {
		double perimetro = 2 * Math.PI * raio;
		return perimetro;
	}
}
