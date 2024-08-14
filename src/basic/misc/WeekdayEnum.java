package basic.misc;

public enum WeekdayEnum {

	DOMINGO("Domingo") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	},
	SEGUNDA("Segunda-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	TERCA("Terça-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUARTA("Quarta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA("Quinta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	SEXTA("Sexta-feia") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	SABADO("Sábado") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	};

	private String nome;

	abstract boolean isFimDeSemana();

	private WeekdayEnum(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		String fimDeSemana = isFimDeSemana() ? "Sim" : "Não";
		return String.format("%s - Fim de semana? %s", nome, fimDeSemana);
	}

}
