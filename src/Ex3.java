import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial, num, res;

        System.out.print("Informe o número que será feito a fatorial: ");
        num = sc.nextInt();
        fatorial = num - 1;
        res = num;
        if (num == 0){
            res = 1;
        } else if (num < 0) {
            System.out.println("Não existe fatorial de valor negativo");
        } else {
            while (fatorial > 0){
                res = res * fatorial;
                fatorial--;
            }
            System.out.println("A fotario de " + num + " é " + res);
        }
    }
}
