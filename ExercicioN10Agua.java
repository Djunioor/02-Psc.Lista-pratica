/*A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso.
 Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.
 */
import java.util.Scanner;

public class ExercicioN10Agua {

    public static void main(String[] args) {
        int mlAgua, peso;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe se peso em Kg: " );
        peso = input.nextInt();

        mlAgua = 35 * peso;

        System.out.println("A quantidade de agua a ser ingerida é: " + mlAgua);
        input.close();
    }
}