import java.util.Scanner;

public class ExercicioN13Fração {
    public static void main(String[] args) {
        int denominador1, numerador1, numerador2, denominador2, numeradorResultado, denominadorResultado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o numerador da fração 1:");
        numerador1 = input.nextInt();

        System.out.println("Digite o denominador da fração 1 ");
        denominador1 = input.nextInt();

        System.out.println("Digite o numerador da fração 2:");
        numerador2 = input.nextInt();

        System.out.println("Digite o denominador da fração 2 ");
        denominador2 = input.nextInt();

        numeradorResultado = numerador1 * denominador2 + numerador2 * denominador1;
        denominadorResultado = denominador1 * denominador2;

        System.out.println("A soma das frações é :" + numeradorResultado + "/" + denominadorResultado);
        input.close();

    }


}
