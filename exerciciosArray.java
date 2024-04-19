import javax.swing.JOptionPane;

public class exerciciosArray {
    
    public static void main(String[] args) {
      
        exercicio4();
      
    }

    private static void exercicio1(){

        // Exercicio 1: Receba três números digitados pelo usuário (com input), salvando em um array(vetor), 
        // obtenha a soma dessas variáveis e a média delas, apresentando esses resultados na tela (com optionpane).

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
}
