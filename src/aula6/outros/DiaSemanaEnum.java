package aula6.outros;

public enum DiaSemanaEnum {
	DOMINGO("Domingo") {
		@Override
		public String isFimDeSemana() {
			return "É final de semana";
		}
	}, SEGUNDA("Segunda-Feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, TERCA("Terça-Feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, QUARTA("Quarta-Feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, QUINTA("Quinta-Feira") {
		@Override
		public String isFimDeSemana() {
			return "Não é final de semana";
		}
	}, SEXTA("Sexta-Feira") {
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
	public abstract String isFimDeSemana();
	
	private DiaSemanaEnum(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}
		
	}
