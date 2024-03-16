import java.util.Scanner;

public class ExercicioN14PlanoC {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double parte1, parte2;
        double distancia;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1 = input.nextDouble();

        System.out.println("Digite o valor de  y1: ");
        y1 = input.nextDouble();

        System.out.println("Digite o valor de x2: ");
        x2 = input.nextDouble();

        System.out.println("Digite o valor de y2: ");
        y2 = input.nextDouble();

        parte1 = Math.pow(x1-x2, 2);
        parte2 = Math.pow(y1-y2, 2);
        distancia = Math.sqrt(parte1 + parte2);


        System.out.println("A distância entre os pontos P1 e P2 é: " + distancia);

        input.close();

    }
}