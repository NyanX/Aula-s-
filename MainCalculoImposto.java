package impostoderenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd;
        String tmp = null;

        Pessoas a = new Pessoas();
        ImpostodeRenda b = new ImpostodeRenda();

        System.out.println("Digite o número de pessoas para a consulta:");
        qtd = scan.nextInt();

        Pessoas[] pessoas = new Pessoas[qtd];
        ImpostodeRenda[] salarios = new ImpostodeRenda [qtd];

        for (int i = 0; i < qtd; i++) {
            pessoas[i] = new Pessoas();
        }
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome:");
            //String nome = scan.next();
            pessoas[i].setNome(scan.next());
         }
        
        System.out.println("Digite o seu salário:");
            float salario = scan.nextFloat();
       
        if (salario < 1901.98) {
            System.out.println("Seu salário é:" + salario + "Não há aplicação da alíquota");
        } 
        
       else if (salario > 1903.99 && salario < 2826.65) {
            float impostos = (float) (salario * 0.075);
                float result = (float) (salario - impostos);
                    float i = (float) (salario - result);
            b.setImposto(result);

            System.out.println("Seu salário é:" + result + "\nA aplicação do imposto foi:" + i);
        }

    }

}
