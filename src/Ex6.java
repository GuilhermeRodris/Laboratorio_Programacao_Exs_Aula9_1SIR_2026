import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = 0, divisor = 1, num;

        System.out.print("Informe qual será o divisor final: ");
        num = sc.nextDouble();

        while (divisor <= num){
            y = 1 / divisor + y;
            divisor++;
        }

        System.out.println("y = " + y);
    }
}
