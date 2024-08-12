package Aula01.exercicio;

public class Retangulo {
	
	double largura;
	double altura;
	
	public double calculaArea(double largura, double altura) {
		double area = largura * altura;
	return area;
	}
	public double calculaPerimetro(double largura, double altura) {
		double perimetro = (largura + altura)*2;
	return perimetro;
	}
	
}
