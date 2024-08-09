package avaliacao.semana2Extra;

public class PersonagemDerrotadoException extends Exception {
/*
 * ● PersonagemDerrotadoException deve ser uma exceção verificada.
 */
	 public PersonagemDerrotadoException(Personagem derrotado, Personagem vencedor) {
	        super(derrotado.nome + " foi derrotado por " + vencedor.nome + "!");
	    }

}
