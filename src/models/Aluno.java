package models;

public class Aluno {
	
	// criando atributos.
	private String nome;
	private int ra;
	private TipoAula formato_aula;
	private double mediaNota;
	private int presenca = 0;

	// criando enum para tipo de aula.
	public enum TipoAula {
		EAD, PRESENCIAL
	}
	
	// validar nota com levando em consideração nota media, tipo de aula e presença quando for presencial.
	private String getAprovarNota() {
		if (mediaNota >= 5) {
			if(formato_aula == TipoAula.EAD) {
				return "Aprovado";	
			} else if (presenca > 75) {
				return "Aprovado";	
			}
		}
		return "Reprovado";
	}
	
	// criando construtor base
	public Aluno(String nome, int ra, TipoAula aula) {
		this.nome = nome;
		this.ra = ra;
		this.formato_aula = aula;
	}
	
	// criando construtor com sobrecarga com um adicionar de presenca.
	public Aluno(String nome, int ra, TipoAula aula, int presenca) {
		this.nome = nome;
		this.ra = ra;
		this.formato_aula = aula;
		this.presenca = presenca > 100 ? 100 : presenca > 0 ? presenca : 0;
	}
	
	// Sobrecargar de nota com 2 parametros média aritmetica.
	public void setNota(double a, double b) {
		this.mediaNota = (a + b) / 2;
	}
	
	// Sobrecargar de nota com 3 parametros média ponderada.
	public void setNota(double a, double b, double c) {
		this.mediaNota = (a * 1 + b * 2 + c * 4) / (1 + 2 + 4);
	}
	
	// Sobrecargar de nota com 4 parametros equação (ac1 * 0,15) + (ac2 * 0,30) + (ag * 0,10) + (af * 0,45).
	public void setNota(double a, double b, double c, double d) {
		this.mediaNota = (a * 0.15) + (b * 0.30) + (c * 0.10) + (d * 0.45);
	}
	
	// Mostrando todos os dados referente ao aluno.
	public String toString() {
		return "Nome: " + nome +
			   "\nRA: " + ra +
			   "\nNota Final: " + String.format("%.2f", mediaNota) +
			   // usando o metodo privado para saber se o aluno esta aprovado ou reprovado.
			   "\nSituação: " + getAprovarNota();
	}
}
