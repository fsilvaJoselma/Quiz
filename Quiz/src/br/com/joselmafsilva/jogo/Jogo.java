package br.com.joselmafsilva.jogo;

import java.util.Scanner;

import br.com.joselmafsilva.models.Questao;

public class Jogo {

	private int pontuacao;
	private Questao[] questoes;
	private int cont;
	private Scanner scan;

	public Jogo() {
		this.scan = new Scanner(System.in);
		this.cont = 0;
		this.setPontuacao(0);
		this.questoes= new Questao[100];
	}
	public void novoQuestao() {
		Questao q = new Questao();
		
		System.out.println("Cadastrando nova questao");
		q.setPergunta(scan.next());
		
		System.out.println("informe a resposta correta");
		q.setAlternativaCorreta(scan.next());
		
		System.out.println("informe as outras 4 repostas");
		for (int i = 1; i <= q.getAlternativas().length - 1; i++) {
			q.getAlternativas()[i]  = scan.next();
		}
		System.out.println("informe o topico");
		q.setTopico(scan.next());

		questoes[cont] = q;
		this.cont++;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
}
