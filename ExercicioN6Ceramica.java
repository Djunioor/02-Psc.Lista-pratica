import java.util.Scanner;

public class ExercicioN6Ceramica {
    public static void main(String[] args) throws Exception {
       double largura, larguraA, comprimento, valorArea, comprimentoA, areaDaceramica, areaTotal;
       double quantidadeCeramica, areaArredondada, valorTotalPago, valorMetro;
       Scanner input = new Scanner(System.in); 

       System.out.println("Infome a largura em metros da area:");
       larguraA = input.nextDouble();

       System.out.println("Informe o comprimento em metros da area: ");
       comprimentoA = input.nextDouble();

        System.out.println("Infome a largura da ceramica: ");
        largura = input.nextDouble();

        System.out.println("Informe o comprimento da ceramica: ");
        comprimento = input.nextDouble();

        System.out.println("Informe o valor do metro quadrado: ");
         valorMetro = input.nextDouble();

        valorArea = larguraA * comprimentoA;
        areaDaceramica = largura * comprimento / 100;
        areaArredondada = Math.ceil(valorArea);
        valorTotalPago = areaDaceramica + valorMetro;
        
        System.out.println("Quantidade de revestimento gasto é: " + areaArredondada + " Metros ");
        System.out.println("O valor pago em: " + areaDaceramica + " É R$:" + valorTotalPago);
    
        input.close();
    }
}