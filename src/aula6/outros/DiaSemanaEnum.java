package aula6.outros;

public enum DiaSemanaEnum {
	DOMINGO("Domingo") {
		@Override
		public String isFimDeSemana() {
			return "É final de semana";
		}
	}, SEGUNDA("Segunda-feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, TERCA("Terça-feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, QUARTA("Quarta-feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, QUINTA("Quinta-feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, SEXTA("Sexta-feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, SABADO("Sábado") {
		@Override
		public String isFimDeSemana() {
			return "É final de semana";
		}
	};
	
	String nome;
	
	private DiaSemanaEnum(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}
	
	public abstract String isFimDeSemana();
	
	public String toString() {
		String fimDeSemana = isFimDeSemana() ? "Sim" : "Não";
		return String.format("%s - Fim de sema? %s", nome, isFimDeSemana());
	}
	}
