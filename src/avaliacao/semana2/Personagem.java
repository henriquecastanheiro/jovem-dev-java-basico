package avaliacao.semana2;

public class Personagem extends Principal {
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

	public String getNome() {
		return nome;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getHp() {
		return hp;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

}
