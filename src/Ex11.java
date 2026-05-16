import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 1,y = 0, n, resto;

        System.out.print("Digite o valor de n: ");
        n = sc.nextDouble();

        while (x<=n){
            resto = x%2;
            if (resto == 0){
                y = y - 1/x;
            }else {
                y = y + 1/x;
            }
            x++;
        }

        System.out.println("O valor de y até n é de: " + String.format("%.2f", y));



    }
}
