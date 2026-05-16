import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bi, resto ;
        double dec = 0, p = 0;

        System.out.print("Digite o valor binario a ser convertido em decimal: ");
        bi = sc.nextInt();

        while (bi > 0){
            resto = bi%10;
            bi = bi/10;


            dec = dec + resto * pow(2,p);
            System.out.println(p);
        }

        System.out.println("O valor decimal que foi convertido é: " + String.format("%.0f",dec));


    }
}
