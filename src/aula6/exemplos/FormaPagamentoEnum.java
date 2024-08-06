package aula6.exemplos;

public enum FormaPagamentoEnum {
		CARTÃO_CRÉDITO(1, "Cartão de Crédito") {
			@Override
			public double getDesconto() {
				return 0;
			}
		},
		CARTÃO_DÉBITO(2, "Cartão de Débito") {
			@Override
			public double getDesconto() {
				return 0;
			}
		},
		DINHERIO(3, "Dinheiro") {
			@Override
			public double getDesconto() {
				return 0.1;
			}
		}, 
		PIX(4, "Pix") {
			@Override
			public double getDesconto() {
				return 0.1;
			}
		};
	
	private int numero;
	private String descricao;
	
	private FormaPagamentoEnum(int numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
		
	}
	public abstract double getDesconto();

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

}
