package ExerciciosExtraClasse;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int grupo, sexo, qtddMulheres = 0, qtddHomens = 0;
		double altura, somaHomens = 0, mediaHomens = 0, maior = 0, menor = 0;
		
		System.out.print("Informe a quantidade de pessoas no grupo: ");
		grupo = entrada.nextInt();
		
		for (int i = 0; i < grupo; i++) {
			System.out.print("Escolha o sexo da pessoa: \n1 - Mulher \n2 - Homem ");
			sexo = entrada.nextInt();
			System.out.print("Digite a altura: ");
			altura = entrada.nextFloat();
			if (sexo == 1) {
				qtddMulheres++;
			} else if (sexo == 2) {
				qtddHomens++;
				somaHomens += altura;
			} else {
				System.out.println("Opção sexo inválido!");
			}
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
		}
		mediaHomens = somaHomens / qtddHomens;
		System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
		System.out.println("A média de altura dos homens é " + mediaHomens + " m");
		System.out.println("O número de mulheres é " + qtddMulheres);
		entrada.close();
	}
}
