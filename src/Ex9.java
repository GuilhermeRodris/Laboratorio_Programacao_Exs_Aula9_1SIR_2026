import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double raiz , div = 0, checa = 0, res;

        System.out.print("Informe o número a ser verificado: ");
        num = sc.nextInt();

        raiz = Math.sqrt(num);
        System.out.println(raiz);

        if (num != 2){
            while (checa == 0){
                div = div + 2;
                res = num % div;
                if (res == 0){
                    checa = 1;
                }
            }
        }

        if (checa != 0){
            System.out.println("O número " + num + " não é primo");
        } else {
            System.out.println("O número " + num + " é primo");
        }
    }
}
