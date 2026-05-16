import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, ncima, nbaixo, validador, cont = 1, res = 0;

        System.out.print("Digitem o valor de n: ");
        n = sc.nextDouble();

        if (n == 0){
            res = 1;
        } else if (n < 0) {
            System.out.println("Não existe fatorial de valor negativo");
        }else {
            while (cont <= n){
                ncima = cont;
                nbaixo = cont;
                validador = cont;
                while (validador > 0){
                    nbaixo = nbaixo * validador;
                    validador--;
                }
                res = res + ncima/nbaixo;
                cont++;
            }
        }

        System.out.println("A resposta da equação é: " + String.format("%.2f",res));

    }
}
