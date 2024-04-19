import java.util.Scanner;

public class conversaoTemperatura{

	public static void main(String[] args) {

		convTemperatura();
	
   	}

	private static void convTemperatura(){
		Scanner entradaT = new Scanner (System.in);
		System.out.println("Digite uma temperatura em graus celsius.");
		double celsius = entradaT.nextDouble();

		Scanner entrada4 = new Scanner (System.in);
		System.out.println("Agora, escolha a conversão desejada: \n"
			+"1 - Celsius para Fahreinheit \n"
			+"2 - Celsius para Kelvin \n"
			+"3 - Celsius para Réamur \n"
			+"4 - Celsius para Rankine");
		int conversao = entrada4.nextInt();

		double f = celsius * 1.8 + 32;
		double k = celsius + 273.15;
		double re = celsius * 4 / 5;
		double ra = celsius * 1.8 + 491.67;

		switch (conversao) {
			case 1:
				System.out.println("Fahreinheit: " +f);
				break;
			case 2:
				System.out.println("Kelvin: " +k);
				break;
			case 3:
				System.out.println("Réamur: " +re);
				break;
			case 4:
				System.out.println("Rankine: " +ra);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
		}
	}
}
