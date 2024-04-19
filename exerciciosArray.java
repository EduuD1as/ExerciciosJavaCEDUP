import javax.swing.JOptionPane;

public class ArrayInicio {
    
    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
        //exercicio8();
        //exercicio9();

    }

    private static void exercicio1(){

        // Exercicio 1:


        String var;
        double numeros[] = new double[3];

        var = JOptionPane.showInputDialog("Digite o primeiro número.");
        numeros[0] = Double.parseDouble(var);

        var = JOptionPane.showInputDialog("Digite o segundo número.");
        numeros[1] = Double.parseDouble(var);

        var = JOptionPane.showInputDialog("Digite o terceiro número.");
        numeros[2] = Double.parseDouble(var);

        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        JOptionPane.showMessageDialog(null, "Soma: " +soma +" \n"
            +"Média: " +soma / numeros.length);
    }

    private static void exercicio2(){

        // Exercício 2: Recebe dois números digitados pelo usuário (com input), 
        // salvando em um array(vetor), em seguida calcule a área do retângulo, 
        // apresentando esses resultados na tela (com optionpane).

        String var;
        int baseAltura[] = new int [2];

        var = JOptionPane.showInputDialog(null, "Digite a base do retângulo.");
        baseAltura[0] = Integer.parseInt(var);

        var = JOptionPane.showInputDialog(null, "Digite a altura do retângulo.");
        baseAltura[1] = Integer.parseInt(var);

        int area = baseAltura[0] * baseAltura[1];

        JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
    }

    private static void exercicio3(){

        // Exercicio 3: Recebe dois números digitados pelo usuário (com imput), salvando em um array(vetor), 
        // em seguida apresente na tela (com optionpane) os seus antecessores e seu sucessores

        String var;
        int numeros[] = new int [2];

        var = JOptionPane.showInputDialog("Digite o primeiro número");
        numeros[0] = Integer.parseInt(var);

        var = JOptionPane.showInputDialog("Digite o segundo número");
        numeros[1] = Integer.parseInt(var);

        int antecessor1 = numeros[0] - 1;
        int antecessor2 = numeros[1] - 1;
        int sucessor1 = numeros[0] + 1;
        int sucessor2 = numeros[1] + 1;
        
        JOptionPane.showMessageDialog(null, "Antecessores: " +antecessor1 +" e " +antecessor2);
        JOptionPane.showMessageDialog(null, "Antecessores: " +sucessor1 +" e " +sucessor2);
    }

    private static void exercicio4(){

        // Recebe dois números digitados pelo usuário (com imput), salvando em um array(vetor), 
        // em seguida apresente na tela (com optionpane) os se os números são positivo, negativo ou zero.

        String var;
        int numero[] = new int[2];

        var = JOptionPane.showInputDialog("Digite o primeiro número.");
        numero[0] = Integer.parseInt(var);

        var = JOptionPane.showInputDialog("Digite o segundo número.");
        numero[1] = Integer.parseInt(var);

        if (numero[0] < 0){
            JOptionPane.showMessageDialog(null, "O número " +numero[0] +" é negativo.");
        }
        else if (numero[0] == 0){
            JOptionPane.showMessageDialog(null, "O número " +numero[0] +" é 0.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número " +numero[0] +" é positivo.");
        }

        if (numero[1] < 0){
            JOptionPane.showMessageDialog(null, "O número " +numero[1] +" é negativo.");
        }
        else if (numero[1] == 0){
            JOptionPane.showMessageDialog(null, "O número " +numero[1] +" é 0.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número " +numero[1] +" é positivo.");
        }
    }

    private static void exercicio5(){

        // Exercicio 5: Receba um numero digitado pelo usuário (com imput), 
        // apos calcular o fatorial do número e apresentar na tela (com optionpane).

        String var;
        int numero[] = new int[1];

        var = JOptionPane.showInputDialog("Digite um número, iremos calcular seu fatorial.");
        numero[0] = Integer.parseInt(var);

        int fat = 1;

        for (int i = 1; i <= numero[0]; i++) {
            fat *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " +numero[0] +" é: " +fat);
    }

    private static void exercicio6(){

        // Exercício 6: Receba uma letra digitado pelo usuário (com imput), verificar 
        // se um caractere é uma vogal ou uma consoante, em seguida apresente na tela (com optionpane) o resultado.

        String letra;

        letra = JOptionPane.showInputDialog("Digite uma letra."); 

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") ||
        letra.equals("o") || letra.equals("u") || letra.equals("A") || 
        letra.equals("E") || letra.equals("I") || letra.equals("O") ||
        letra.equals("U")){
            JOptionPane.showMessageDialog(null, "É vogal.");
        }
        else {
            JOptionPane.showMessageDialog(null, "É consoante.");
        }
    }

    private static void exercicio7(){

        // Exercicio 7: Receba um ano digitado pelo usuário (com input), verificar se um ano é um ano de copa do mundo 
        // (considerando a periodicidade de 4 anos, e a primeira copa ocorreu em 1930), em seguida apresente na tela
        // (com optionpane) o resultado.

        String var;
        int ano[] = new int[1];

        var = JOptionPane.showInputDialog("Digite algum ano");
        ano[0] = Integer.parseInt(var);

        if (ano[0] >= 1930 && (ano[0] - 1930) % 4 == 0){
            JOptionPane.showMessageDialog(null, "É ano de copa");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é ano de copa");
        }
    }

    private static void exercicio8(){

        // Exercicio 8: Receber altura e peso digitados pelo usuário (com imput), calcular o IMC
        // em seguida apresente na tela (com optionpane) o resultado.

        String var;
        double peso, altura;

        var = JOptionPane.showInputDialog("Digite sua altura");
        altura = Double.parseDouble(var);

        var = JOptionPane.showInputDialog("Digite seu peso");
        peso =Double.parseDouble(var);

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " +imc);
    }

    private static void exercicio9(){

        // Exercicio 9: Simular uma calculadora básica com as operações de adição, subtração, multiplicação e divisão.

        String var;
        double nm[] = new double[2];
        int conversao;

        var = JOptionPane.showInputDialog("Digite o primeiro número do cálculo");
        nm[0] = Double.parseDouble(var);

        var = JOptionPane.showInputDialog("Digite o segundo número do cálculo");
        nm[1] = Double.parseDouble(var);

        var = JOptionPane.showInputDialog("Agora, escolha o cálculo que deseja realizar \n "
            +"1 - Adição \n"
            +"2 - Subtração \n"
            +"3 - Multiplicação \n"
            +"4 - Divisão");
        conversao = Integer.parseInt(var);

        switch (conversao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Resultado da adição: " + (nm[0] + nm[1]));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Resultado da subtração: " + (nm[0] - nm[1]));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + (nm[0] * nm[1]));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Resultado da divisão: " + (nm[0] / nm[1]));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }
