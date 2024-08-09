package avaliacao.semana2;

public class Inimigo extends Personagem {

	public Inimigo(String nome, int maxHP, int ataque, int defesa) {
		super(nome, maxHP, defesa, defesa);
	}

	@Override
	public String toString() {
		return "Inimigo [" + nome + ", maxHP=" + maxHP + ", ataque=" + ataque + ", defesa=" + defesa + "]";
	}

}
