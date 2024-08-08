package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafio {
	
	public static void main(String[] args) {
		
		List<Evento> lista = new ArrayList<>();
		lista.add(new Evento("Almoço", LocalDateTime.of(2025,  1, 1, 12, 30, 0), TipoDeEvento.SOCIAL));
		lista.add(new Evento("Jantar", LocalDateTime.of(2024,  12, 31, 23, 59, 59), TipoDeEvento.SOCIAL));
		lista.add(new Evento("Vôlei", LocalDateTime.of(2024,  1, 1, 12, 30, 0), TipoDeEvento.LAZER));
		lista.add(new Evento("Festa", LocalDateTime.of(2024,  10, 6, 16, 0, 0), TipoDeEvento.LAZER));
		lista.add(new Evento("Reunião", LocalDateTime.of(2024,  6, 6, 12, 0, 0), TipoDeEvento.PROFISSIONAL));
		lista.add(new Evento("Evento Privado", LocalDateTime.of(2024,  5, 5, 15, 0, 0), TipoDeEvento.OUTROS));
	
		
		String input = JOptionPane.showInputDialog("Digite um evento: ");
		TipoDeEvento tipo = TipoDeEvento.valueOf(input);
		
		Map<Boolean, List<Evento>> mapa = lista
				.stream()
				.filter( e -> e.getTipoEvento().equals(tipo))
				.collect(Collectors.groupingBy(e -> e.getData().isBefore(LocalDateTime.now())));
		
		System.out.println("Eventos que já ocorreram");
		System.out.println(mapa.get(true));
		System.out.println("Eventos que ainda não ocorreram");
		System.out.println(mapa.get(false));
	}
}
