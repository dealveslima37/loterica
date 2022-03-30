import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();

        System.out.print("Deseja fazer quantos jogos? ");
        var n = scanner.nextInt();

        int[][] jogos = new int[n][6];

        for(int i = 0; i < jogos.length; i++){
            for(int j = 0; j < jogos[i].length; j++){
                jogos[i][j] = random.nextInt(60) + 1;
                System.out.print(jogos[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
