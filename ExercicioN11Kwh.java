/*Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. 
O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.
 */
import java.util.Scanner; 

public class ExercicioN11Kwh {
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
