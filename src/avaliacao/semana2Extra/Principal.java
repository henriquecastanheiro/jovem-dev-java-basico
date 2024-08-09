package avaliacao.semana2Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
	/*
	 * No construtor do programa principal, crie um herói de cada classe e 
	 * faça ele batalhar contra os inimigos especificados, na ordem em que eles aparecem.
	 */
	public static void main(String[] args) {
		
	List<Heroi> pHerois = new ArrayList<Heroi>();
	
	pHerois.add(new Heroi("Mago",30 , 18, 23));
	pHerois.add(new Heroi("Bárbaro",100 , 20, 18));
	pHerois.add(new Heroi("Paladino",50 , 20, 19));
	
	List<Inimigo> pInimigos = new ArrayList<Inimigo>();
	
	pInimigos.add(new Inimigo("Morcego", 10, 5, 5));
	pInimigos.add(new Inimigo("Zumbi", 22, 6, 6));
	pInimigos.add(new Inimigo("Urso", 30, 8, 9));
	pInimigos.add(new Inimigo("Vampiro", 35, 10, 10));
	pInimigos.add(new Inimigo("Arok, Mestre Supremo", 50, 20, 20));
	
	
	for (Personagem heroi : pHerois) {
        System.out.println("Iniciando a batalha com " + heroi.nome + "...");
        try {
            for (Personagem inimigo : pInimigos) {
                System.out.println("Batalha: " + heroi.nome + " vs " + inimigo.nome);
                heroi.batalhar(inimigo);
            }
            System.out.println(heroi.nome + " venceu todas as batalhas e é o campeão!\n");
        } catch (PersonagemDerrotadoException e) {
            System.out.println(e.getMessage());
            System.out.println(heroi.nome + " foi derrotado. Fim de jogo!\n");
        }
    }
}
}
