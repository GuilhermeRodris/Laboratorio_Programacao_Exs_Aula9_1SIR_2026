import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double negativos, divisor = 1,res, checa;

        System.out.print("Informe o número inteiro que tera seus divisores apresentados: ");
        num = sc.nextInt();
        divisor = num;
        System.out.println("Os divisores inteiros, positivos e negativos, são: ");

        while (divisor > 0){
            res = num / divisor;
            checa = res % 1;
            if (checa == 0){
                negativos = res * (-1);

                System.out.print(String.format("%.0f, ", res) + String.format("%.0f, ", negativos));
            }
            divisor--;
        }
    }
}
