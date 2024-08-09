package avaliacao.semana2Extra;

import java.util.Random;

public class Personagem extends Principal {
	/*
	 * ● Personagem deve ser uma classe abstrata. 
	 * ● Personagem deve ter um método batalhar. 
	 * ● Deve haver também um método atacar.
	 * 
	 */
	
	public String nome;
	public int maxHP;
	public int hp;
	public int ataque;
	public int defesa;

	public Personagem(String nome, int maxHP, int ataque, int defesa) {
		super();
		this.nome = nome;
		this.maxHP = maxHP;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public void atacar(Personagem inimigos) throws PersonagemDerrotadoException {
		Random jogaDado = new Random();
		int dado = jogaDado.nextInt(6) + 1;
		int danoInimigo = (dado + this.ataque) - inimigos.defesa;

		 String mensagemAtaque = String.format(
				 "%s rolou o dado: %d%n", this.nome, dado);

	        if (danoInimigo > 0) {
	            inimigos.hp -= danoInimigo;
	            mensagemAtaque += String.format(
	            		"%s atacou %s causando %d de dano.%n", this.nome, inimigos.nome, danoInimigo);
	            if (inimigos.hp <= 0) {
	                inimigos.hp = 0;
	                throw new PersonagemDerrotadoException(inimigos, this);
	            }
	        } else {
	            mensagemAtaque += String.format(
	            		"%s atacou %s mas não conseguiu penetrar a defesa.%n", this.nome, inimigos.nome);
	        }
	        mensagemAtaque += String.format(
	        		"Vida de %s: %d/%d%n", inimigos.nome, inimigos.hp, inimigos.maxHP);

	        System.out.print(mensagemAtaque);
	}

	public void batalhar(Personagem inimigos) throws PersonagemDerrotadoException {
		while (this.hp > 0 && inimigos.hp > 0) {
			this.atacar(inimigos);
			if (inimigos.hp > 0) {
				inimigos.atacar(this);
			}

		}
	}
}
