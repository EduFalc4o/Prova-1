import java.util.Scanner;

public class VotacaoTimes {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Informa a quantia de pessoas que irão votar: ");
        int votantes = input.nextInt();

        int Taffismo_club = 0;
        int PatinhoBranquinho = 0;
        int LucasFC  = 0;
        int SportRedesFC = 0;

        int[] votos = {Taffismo_club, PatinhoBranquinho, LucasFC, SportRedesFC};

        String[] candidatos = {
                "Taffismo_club - 80",
                "PatinhoBranquinho - 70",
                "Lucas - 60",
                "Sport - 50"
        };

        System.out.println("Os times são:");
        for (int i = 0; i < 4; i++) {
            System.out.println(candidatos[i]);
        }
        System.out.println();

        int voto = 0;
        int[] numstimes = {50, 60, 70, 80};
        for (int i = 0; i < votantes; i++) {
            boolean esta = false;
            while (!esta){
                System.out.println("Votante -" + i + "- Digite o número de seu time:");
                voto  = input.nextInt();
                for (int j = 0; j < numstimes.length; j++) {
                    if (voto == numstimes[j]) {
                        esta = true;
                    }
                }
                if (!esta){System.out.println("Digite um time válido");}
            }

            switch (voto){
                case 80:
                    votos[0] +=1;
                    break;
                case 70:
                    votos[1] +=1;
                    break;
                case 60:
                    votos[2] +=1;
                    break;
                case 50:
                    votos[3] +=1;
                    break;
                default:
                    break;
            }


        }
        System.out.println("Votos de cada time: ");
        for (int j = 0; j < numstimes.length; j++) {
            System.out.println(numstimes[j] + ": " + votos[j]);
        }
    }
}