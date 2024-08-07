package aula6.exemplos;

public enum DiaSemanaEnum {
	DOMINGO("Domingo") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	}, SEGUNDA("Segunda-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, TERCA("Terça-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, QUARTA("Quarta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, QUINTA("Quinta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, SEXTA("Sexta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	}, SABADO("Sábado") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	};
	
	String nome;
	
	private DiaSemanaEnum(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}
	
	public abstract boolean isFimDeSemana();
	
	public String toString() {
		String fimDeSemana = isFimDeSemana() ? "Sim" : "Não";
		return String.format("%s - Fim de sema? %s", 
				nome, isFimDeSemana());
	}
	}