import java.util.Scanner;

public class ListaDeAlimentos{
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Me diga a quantia de alimentos: ");
        int alimentos = input.nextInt();
        int quantia = input.nextInt();
        int[] alimento = new int[quantia];

        int soma = 0;
        int media = 0;

        for(int i = 1; i <= quantia; i++){
            System.out.println("Me diga a avaliação do alimento" + i);
            alimento[i-1] = input.nextInt();
            soma += alimento[i-1];
        }
        media = soma/quantia;
        System.out.println("A soma das notas dos alimentos é: " + soma);
        System.out.println("A media dos votos é: " + media);

        int menorSeis = 0;
        int maiorSeis = 0;
        int invalidos = 0;
        for(int i = 0; i < quantia; i++){
            if(alimento[i] >= 11 || alimento[i] < 0){
                invalidos+=1;
            } else if (alimento[i] >= 6) {
                maiorSeis+=1;
            } else if (alimento[i] < 6) {
                menorSeis+=1;
            }
        }
        System.out.println("A quantidade de alimentos avaliados como bons é: " + maiorSeis);
        System.out.println("A quantidade de alimentos avaliados como ruins é: " + menorSeis);
        System.out.println("A quantia de notas invalidas(fora do intervalo 0-10) é " + invalidos);
    }
}