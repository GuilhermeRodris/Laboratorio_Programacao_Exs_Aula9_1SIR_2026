import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, maior = Integer.MIN_VALUE, cont = 0;

        while (cont < 15){
            System.out.print("Digite o valor: ");
            num = sc.nextDouble();
            if (num > maior){
                maior = num;
            }
            cont++;
        }

        System.out.println("O maior valor é: " + String.format("%.2f", maior));

    }
}
