import java.util.Scanner;

public class ExercicioN7MetroC {

    public static void main(String[] args) {
        double metroQuadrado, largura, comprimento, valorMetro, totalPago;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Infome a largura do piso: ");
        largura = input.nextDouble();

        System.out.println("Informe o comprimento do piso: ");
        comprimento = input.nextDouble();

        metroQuadrado = largura * comprimento / 100;
        
        System.out.println("Informe o valor do metro quadrado: ");
         valorMetro = input.nextDouble();

         totalPago = metroQuadrado + valorMetro;

;
         System.out.println("O total a ser pago em " + metroQuadrado + " M é igual a R$: " + totalPago);

        input.close(); 
    }
}