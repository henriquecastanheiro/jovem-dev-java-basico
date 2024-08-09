package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
	
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
	
	try {
		batalhar(pHerois, pInimigos);
		Thread.sleep(3);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void batalhar(List<Heroi> pHerois, List<Inimigo> pInimigos){
		
		Random numeroDado = new Random();
		int dado = numeroDado.nextInt(6)+1;
		
		for (Heroi herois : pHerois) {
			System.out.println(herois);
			
			for(Inimigo inimigos : pInimigos ) {
				System.out.println(inimigos);			
				
				System.out.println(herois.getNome() + " vs " + inimigos.getNome() + "\n'Herói começa atacando' ");	
				System.out.println("'Personagem jogou os dados!' \nNúmero do Dado é: " + dado);
			do {	
				int atqHeroi = dado + herois.getAtaque();
				System.out.println((atqHeroi - inimigos.getDefesa()) - inimigos.getMaxHP());
			
			}while(inimigos.getMaxHP() < 0);
				
			if(herois.getAtaque() < inimigos.getDefesa())
				System.out.println("Ataque fraco! \nInimigo pode atacar!");
			else {
				System.out.println("Ataque com sucesso!\n ");
				if(inimigos.getMaxHP() < 0) {
					System.out.println("Inimigo Derrotado!");
				}
			}
	
			}
				
			}
		}
	}
		
