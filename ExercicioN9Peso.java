import java.util.Scanner;

public class ExercicioN9Peso {
    public static void main(String[] args) {
        float altura, peso;
        double imc;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a altura em centimetros: ");
        altura = input.nextFloat();

        System.out.println("Informe seu peso em KG: ");
        peso = input.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("O valor do imc é: " + imc);
        input.close();
    }
    
}
