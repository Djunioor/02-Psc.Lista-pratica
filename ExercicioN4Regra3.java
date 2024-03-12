import java.util.Scanner;

public class ExercicioN4Regra3 {

    public static void main(String[] args) {

      float num1;
      float num2;
      float num3;
      float total;
      Scanner leitor = new Scanner(System.in);

      System.out.println("Digite o primeiro numero: ");
      num1 = leitor.nextFloat();

      System.out.println("Digite o segundo numero: ");
      num2 = leitor.nextFloat();

      System.out.println("Digite o primeiro numero: ");
       num3 = leitor.nextFloat();

    total = num1 * num2/ num3;
    System.out.println("O resultado é: " + total);
    }
}