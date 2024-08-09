package avaliacao.semana2;

public class Heroi extends Personagem{

	public Heroi(String nome, int maxHP, int ataque, int defesa) {
		super(nome, maxHP, defesa, defesa);
	}

	@Override
	public String toString() {
		return "Heroi [nome=" + nome + ", maxHP=" + maxHP + ", ataque=" + ataque + ", defesa=" + defesa + "]";
	}
	
}
