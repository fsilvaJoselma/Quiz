package br.com.joselmafsilva.models;

public class Questao {

	private String pergunta;
	private String topico;
	private String[] alternativas;
	private int cont;
	private String alternativaCorreta;

	public Questao() {
		this.cont = 0;
		this.alternativas = new String[5];
	}

	public boolean isPerguntaCorreta(String resposta) {
		boolean verdade = false;
		if (resposta.equals(alternativaCorreta)) {
			verdade = true;
		}
		return verdade;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}

	public String[] getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}

	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(String alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
		this.alternativas[this.cont] =  alternativaCorreta;
		this.cont++;
	}
}
