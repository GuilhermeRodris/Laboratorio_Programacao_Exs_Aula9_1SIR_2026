import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatutura = 0;

        while (temperatutura != -1){
            System.out.print("Informe a temperatura atual do forno ou digite '-1', para encerrar o programa: ");
            temperatutura = sc.nextDouble();

            if (temperatutura == -1){
                System.out.println("Encerrando  o programa!");
            } else if (temperatutura < 800) {
                System.out.println("ALERTA: temperatura baixa!!");
            }else if (temperatutura > 1200){
                System.out.println("CRÍTICO: risco de dano!!");
            }else {
                System.out.println("Normal");
            }
            System.out.println();

        }

    }
}
