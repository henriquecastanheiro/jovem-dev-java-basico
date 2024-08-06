package Desafio;

import java.time.LocalDate;

public class ClientePremium extends Cliente {

	// Construtor que chama o construtor da classe pai (Cliente)
	public ClientePremium( String nome, LocalDate dataNascimento) {
	super(nome, dataNascimento);
	}
	
    @Override
    public boolean isPremium() {
        return true;
    }
}

