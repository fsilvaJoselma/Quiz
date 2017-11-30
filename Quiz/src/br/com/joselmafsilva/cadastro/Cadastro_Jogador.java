package br.com.joselmafsilva.cadastro;
	
	import java.util.Scanner;

	public class Cadastro_Jogador {

	    private static Scanner entrada;

		public static void menu(){
	        System.out.println("\tMENU");
	        System.out.println("0. Fim");
	        System.out.println("1. Inclui");
	        System.out.println("2. Altera");
	        System.out.println("3. Exclui");
	        System.out.println("4. Consulta");
	        System.out.println("Opcao:");
	    }

	    public static void inclui(){
	        System.out.println("Voc� entrou no m�todo Inclui.");
	    }

	    public static void altera(){
	        System.out.println("Voc� entrou no m�todo Altera.");
	    }

	    public static void exclui(){
	        System.out.println("Voc� entrou no m�todo Exclui.");
	    }

	    public static void consulta(){
	        System.out.println("Voc� entrou no m�todo Consulta.");
	    }

	    public static void main(String[] args) {
	        int opcao;
	        entrada = new Scanner(System.in);

	        do{
	            menu();
	            opcao = entrada.nextInt();

	            switch(opcao){
	            case 1:
	                inclui();
	                break;

	            case 2:
	                altera();
	                break;

	            case 3:
	                exclui();
	                break;

	            case 4:
	                consulta();
	                break;

	            default:
	                System.out.println("Op��o inv�lida.");
	            }
	        } while(opcao != 0);
	    }
	}
