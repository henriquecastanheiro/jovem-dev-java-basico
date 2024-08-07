package aula6.exemplos;

import java.time.LocalDateTime;

public class Evento {
	
	String nome;
	private LocalDateTime data;
	private TipoEventoEnum tipoEvento;
	
	public Evento(String nome, LocalDateTime data, TipoEventoEnum tipo) {
		super();
		this.nome = nome;
		this.data = data;
		this.tipoEvento = tipo;
	}
	public String getNome() {
		return nome;
	}
	public LocalDateTime getData() {
		return data;
	}
	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public void setTipoEvento(TipoEventoEnum tipo) {
		this.tipoEvento = tipo;
	}
	
}
