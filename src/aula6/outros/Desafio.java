package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Desafio {

	/*
	 * Crie uma classe chamada Evento que vai possuir 
	 * descricao (String), dataHora (LocalDateTime) e tipo de evento (enum)
	 * Os eventos podem ser categorizados em SOCIAL, LAZER, PROFISSIONAL e OUTROS.
	 * 
	 * Crie alguns eventos
	 * Em seguida peça para o usuário digitar um tipo de evento e 
	 * agrupe os eventos daquele tipo em duas categorias:
	 * eventos que já ocorreram e eventos que ainda não ocorreram.
	 * 
	 */
	public static void main(String[] args) {
		
		List<Evento> lista = new ArrayList<>();
		Evento evento = null;
		
		String descricao = JOptionPane.showInputDialog("Digite a descrição do evento: ");

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dataHora = null;
		while (dataHora == null) {
			String strdataHora = JOptionPane
					.showInputDialog("Digite a Data e Hora deste evento: (dd/MM/yyyy HH:mm)");
			try {
				dataHora = LocalDateTime.parse(strdataHora, format);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data e Hora inválidas, Por favor tente novamente.");
			}
		}
		
		lista.add(evento);
        
        String strTipoEventoAgrupar = JOptionPane.showInputDialog("Digite o tipo de evento para agrupar (SOCIAL, LAZER, PROFISSIONAL, OUTROS):");
        TipoDeEvento tipoEventoAgrupar;
        try {
            tipoEventoAgrupar = TipoDeEvento.valueOf(strTipoEventoAgrupar.toUpperCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de evento inválido!");
            return;
        }

        List<Evento> eventosOcorridos = new ArrayList<>();
        List<Evento> eventosFuturos = new ArrayList<>();

        for (Evento eventos : lista) {
            switch (tipoEventoAgrupar) {
                case SOCIAL:
                case LAZER:
                case PROFISSIONAL:
                case OUTROS:
                    if (eventos.isOcorrido()) {
                        eventosOcorridos.add(eventos);
                    } else if (eventos.isFuturo()) {
                        eventosFuturos.add(eventos);
                    }
                    break;
            }
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("Eventos do tipo ").append(tipoEventoAgrupar.name().toLowerCase()).append(":\n\n");

        resultado.append("Eventos já ocorridos:\n");
        if (eventosOcorridos.isEmpty()) {
            resultado.append("Nenhum evento encontrado.\n");
        } else {
            for (Evento eventos : eventosOcorridos) {
                resultado.append(eventos).append("\n");
            }
        }

        resultado.append("\nEventos futuros:\n");
        if (eventosFuturos.isEmpty()) {
            resultado.append("Nenhum evento encontrado.\n");
        } else {
            for (Evento eventos : eventosFuturos) {
                resultado.append(eventos).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}