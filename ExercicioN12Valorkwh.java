
    import java.util.Scanner;

    public class ExercicioN12Valorkwh {
    public static void main(String[] args) {
        float potenciaWatts, horasLigado, kwh, totalHoras, diasDeUso, valorpago;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a potencia em Watts do aparelho: ");
        potenciaWatts = input.nextFloat();

        System.out.println("Informe a quatidade de horas de uso do aparelho: ");
        horasLigado = input.nextFloat();

        System.out.println("Infome o numero de dias usado: ");
        diasDeUso = input.nextFloat();

        System.out.println("Informe o valor do KW/H: ");
        kwh = input.nextFloat();

        totalHoras = potenciaWatts * horasLigado * diasDeUso / 1000;
        valorpago = totalHoras * kwh;
        
        System.out.println("O valor total de KW/h é: " + totalHoras);
        System.out.println("O valor pago no final do mes é R$: " + valorpago);

        input.close();
    }
    
}

