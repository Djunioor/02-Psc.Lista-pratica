import java.util.Scanner;

public class ExercicioN5Retangulo {

    public static void main(String[] args) {

       int base;
       int altura;
       int areaT;
       int alturaT;
       int diagonal;
       int perimetro;
         Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a base do triagulo: ");
        base = leitor.nextInt();

        System.out.println("Informe a altura do triangulo: ");
        alturaT = leitor.nextInt();

        areaT = base * altura;
        perimetro = 2(base + altura);

    
    }
}