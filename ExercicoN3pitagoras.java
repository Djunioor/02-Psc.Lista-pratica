import java.util.Scanner;


public class ExercicoN3pitagoras {

    public static void main(String[] args) {
        double a; 
        double b;
        double c;
        double total;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Infomre o valor de A: ");
        a = leitor.nextDouble();

        System.out.println("informe o valor de B: ");
        b = leitor.nextDouble();

        c = a*a + b*b;
        total = Math.sqrt(c);

        System.out.println("O valor de C é: " + total);

    }
}