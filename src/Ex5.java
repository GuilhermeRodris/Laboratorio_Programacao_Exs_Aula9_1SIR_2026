import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fib = 1, num, anterior = 0, res = 1, atual;

        System.out.print("Escolha o quantia de números limite: ");
        num= sc.nextInt();

        System.out.println("A sequencia de fibonnaci de limite " + num + " é:");
        while (fib <= num){
            System.out.print(res + ", ");
            atual = res;
            res = anterior + atual;
            anterior = atual;
            fib++;
        }
    }

}
