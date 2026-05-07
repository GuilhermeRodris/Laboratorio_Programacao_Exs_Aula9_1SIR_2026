import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto = 1, cand1 = 0, cand2 = 0, cand3 = 0, invalidos = 0, vencedor;
        double pcad1, pcad2, pcad3, pinv , total;

        while (voto != 0 ){
            System.out.println("Números dos candidatos participantes: 1, 2 e 3" +
                    "Votar '0' encerra a votação " +
                    "Qualquer outro valor será considerado como nulo ");
            System.out.print("Digite o número do candidato que deseja votar: ");
            voto = sc.nextInt();
            if (voto == 1){
                System.out.println("Candidato 1 escolhido");
                cand1++;
            } else if (voto == 2){
                System.out.println("Candidato 2 escolhido");
                cand2++;
            } else if (voto == 3){
                System.out.println("Candidato 3 escolhido");
                cand3++;
            } else if (voto == 0) {
                System.out.println("Encerrando a votação");
            } else {
                System.out.println("Voto anulado");
                invalidos++;
            }
        }
        total = cand1 + cand2 + cand3 + invalidos;

        pcad1 = cand1 * 100 / total;
        pcad2 = cand2 * 100 / total;
        pcad3 = cand3 * 100 / total;
        pinv = invalidos * 100 / total;

        if (cand1 > cand2 && cand1 > cand3){
            vencedor = 1;
        } else if (cand2 > cand1 && cand2 > cand3){
            vencedor = 2;
        } else if (cand3 > cand1 && cand3 > cand2){
            vencedor = 1;
        } else {
            vencedor = 4;
        }

        if (vencedor == 4){
            System.out.println("Empate!");
        } else {
            System.out.println("O total de votos foi: " + String.format("%.0f", total));

            System.out.println("Total de votos candidato 1 -> " + cand1 +
                    " ficando com um porcentual de: " + String.format("%.0f%%", pcad1));

            System.out.println("Total de votos candidato 2 -> " + cand2 +
                    " ficando com um porcentual de: " + String.format("%.0f%%", pcad2));

            System.out.println("Total de votos candidato 3 -> " + cand3 +
                    " ficando com um porcentual de: " + String.format("%.0f%%", pcad3));

            System.out.println("Total de votos invalidos -> " + invalidos +
                    " ficando com um porcentual de: " + String.format("%.0f%%", pinv));

            System.out.println("O vencedor foi o candidato " + vencedor);

        }
    }
}
