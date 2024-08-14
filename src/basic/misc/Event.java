package basic.misc;

import java.time.LocalDateTime;

public class Event {

	public Event(String nome, LocalDateTime data, EventTypeEnum tipo) {
		this.nome = nome;
		this.data = data;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public EventTypeEnum getTipo() {
		return tipo;
	}

	public void setTipo(EventTypeEnum tipo) {
		this.tipo = tipo;
	}

	private String nome;
	private LocalDateTime data;
	private EventTypeEnum tipo;

}
