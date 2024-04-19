import java.util.Scanner;

public class calculadoraBasica
{
	public static void main(String[] args) {

		calculadora();

	}
	    
	private static void calculadora(){

		/* 
	  Calculadora de 4 operações (multiplicação, divisão, soma e adição) entre dois números 
	  digitados pelo usuário.
	  */
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escolha o primeiro número");
		double numero1 = entrada.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Escolha o segundo número");
		double numero2 = entrada2.nextDouble();
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("Agora, escolha a operação desejada: (+ para soma, - para subtração, * para multiplicação e / para divisão).");
		String operacao = entrada3.nextLine();

		double subtracao, soma, divisao, multiplicacao;
		
		subtracao = numero1 - numero2;
		soma = numero1 + numero2;
		divisao = numero1 / numero2;
		multiplicacao = numero1 * numero2;
		
		switch (operacao) {
		case "-":
			System.out.println("O resultado da subtração é: " +subtracao);
			break;
		
		case "+":
		    System.out.println("O resultado da soma é: " +soma);
			break;
		
		case "/":
		    System.out.println("O resultado da divisão é: " +divisao);
			break;
		
		case "*":
		    System.out.println("O resultado da multiplicação é: " +multiplicacao);
			break;

		default:
			System.out.println("Opção inválida.");
			break;
		}
  }
}
