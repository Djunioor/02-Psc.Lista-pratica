/*Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. 
Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.
/* */
import java.util.Scanner;

public class ExercicioN8Tempo {
    public static void main(String[] args) {
        float mbps, tempoDownload, megabytesIn, megabitsIn;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a velocidade da conexão em Megabits: ");
        megabitsIn = input.nextFloat();

        System.out.println("Informe o tamanho do arquivo em Megabytes: ");
        megabytesIn = input.nextFloat();


        mbps = megabitsIn / 8;
        tempoDownload = megabytesIn / mbps;

        System.out.println("O tempo para Download do arquivo é: " + tempoDownload);
        
        input.close(); 

    }
    
}
