import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, mult = 1, res, fim = 2;

        while (fim != 0) {
            System.out.print("Informe o número que vai ter a tabuada apresentada: ");
            num = sc.nextInt();
            fim = 2;
            while (mult <= 10) {
                res = num * mult;
                System.out.println(num + " * " + mult + " = " + res);
                mult++;
            }
            while (fim != 1 && fim != 0) {
                System.out.println("Deseja apresentar a tabuada de outro número?");
                System.out.println("Sim ou não?");
                System.out.print("0 finaliza e 1 continua: ");
                fim = sc.nextInt();
                if (fim == 1) {
                    mult = 1;
                } else if (fim == 0) {
                    System.out.println("Programa encerrado");
                } else {
                    System.out.println("Comando invalido");
                }
            }
        }


    }
}
