import java.util.Scanner;

public class ExercicioN1Hora {

    public static void main(String[] args) throws Exception {
        int hora;
        int minutosPhoras;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a hora: ");
        hora =  leitor.nextInt();

        minutosPhoras = hora * 60;

        System.out.println("Os minutos sao: " + minutosPhoras + " minutos ");
    

    }
}