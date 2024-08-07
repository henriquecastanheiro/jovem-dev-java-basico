package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Evento {

	// descricao (String), dataHora (LocalDateTime) e tipo de evento (enum).
	String descricao;
	LocalDateTime dataHora;

	public Evento(String descricao, LocalDateTime dataHora) {
		this.descricao = descricao;
		this.dataHora = dataHora;

	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public static Evento criarEvento() {

		String descricao = JOptionPane.showInputDialog("Digite a descrição do evento: ");

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dataHora = null;
		while (dataHora.equals(null)) {
			try {
				String strdataHora = JOptionPane
						.showInputDialog("Digite a Data e Hora deste evento: (dd/MM/yyyy HH:mm)");
				dataHora = LocalDateTime.parse(strdataHora, format);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data e Hora inválidas, Por favor tente novamente.");
			}
		}
		return new Evento(descricao, dataHora);
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return descricao + " - " + dataHora.format(format);
	}

	public boolean isOcorrido() {
		return dataHora.isBefore(LocalDateTime.now());
	}

	public boolean isFuturo() {
		return dataHora.isAfter(LocalDateTime.now());
	}
}
