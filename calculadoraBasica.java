import java.util.Scanner;

public class calculadoraBasica{


    public static void main(String[] args) {

        calcBasica();

    }

    private static void calcBasica(){

        Scanner s = new Scanner (System.in);
        System.out.println("Digite o primeiro número do cálcuo.");
        double nm1 = s.nextDouble();

        System.out.println("Digite o segundo número do cálculo");
        double nm2 = s.nextDouble();

        System.out.println("Agora, escolha a operação que deseja realizar \n"
            +"1 - Adição \n"
            +"2 - Subtração \n"
            +"3 - Multiplicação \n"
            +"4 - Divisão");
        int conversao = s.nextInt();

        switch (conversao){
            case 1:
                System.out.println("O resultado é: " +(nm1 + nm2));
                break;
            case 2:
                System.out.println("O resultado é: " +(nm1 - nm2));
                break;
            case 3:
                System.out.println("O resultado é: " +(nm1 * nm2));
                break;
            case 4:
                System.out.println("O resultado é: " + (nm1 / nm2));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
