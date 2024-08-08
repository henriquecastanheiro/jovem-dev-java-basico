package aula6.outros;

import java.time.LocalDateTime;

public class Evento {
	
	String nome;
	private LocalDateTime data;
	private TipoDeEvento tipoEvento;
	
	public Evento(String nome, LocalDateTime data, TipoDeEvento tipoEvento) {
		super();
		this.nome = nome;
		this.data = data;
		this.tipoEvento = tipoEvento;
	}
	public String getNome() {
		return nome;
	}
	public LocalDateTime getData() {
		return data;
	}
	public TipoDeEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public void setTipoEvento(TipoDeEvento tipo) {
		this.tipoEvento = tipo;
	}
	 @Override
	    public String toString() {
	        return "Evento{" +
	                "nome='" + nome + '\'' +
	                ", data=" + data +
	                ", tipoEvento=" + tipoEvento +
	                '}';
	    }
}