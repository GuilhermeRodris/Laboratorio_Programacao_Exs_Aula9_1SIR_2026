import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dependente;
        double ir, renda, desconto, aliquota;
        String fim="";


        while (!(fim.equalsIgnoreCase("Sair"))){
            System.out.print("Informe o número de dependentes: ");
            dependente = sc.nextInt();
            System.out.println("Informe a renda: ");
            renda = sc.nextDouble();

            desconto = (dependente * 0.05) * renda;
            renda = renda - desconto;

            if (renda < 3242.01){
                ir = renda;
            } else if (renda < 4863.01) {
                aliquota = renda * 0.05;
                ir = aliquota + desconto;
            }  else if (renda < 8105.01) {
                aliquota = renda * 0.10;
                ir = aliquota + desconto;
            }else if (renda < 11347.01) {
                aliquota = renda * 0.15;
                ir = aliquota + desconto;
            }else {
                aliquota = renda * 0.20;
                ir = aliquota + desconto;
            }

            System.out.println("O valor do IR é: " + String.format("%.2f", ir));

            while (!(fim.equalsIgnoreCase("Sair")) && !(fim.equalsIgnoreCase("Continuar"))){
                System.out.print("Caso deseje sair escreva 'Sair' ou caso deseje continuar escreva 'Continuar': ");
                fim = sc.next();
                if (!(fim.equalsIgnoreCase("Sair")) && !(fim.equalsIgnoreCase("Continuar"))){
                    System.out.println("Comando invalido!");
                }
            }

        }

    }
}
