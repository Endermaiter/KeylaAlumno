import java.util.Scanner;

public class Main3 {

    static float sumaNotas;

    public static void main(String[] args) {
        System.out.println("***CALCULADOR DE NOTA***");
        System.out.println("--[ Formato = N,M]--\n");
        for (int a = 1; a < 4; a++) {
            System.out.println("Alumno " + a+":");
            sumaNotas = 0;
            for(int i = 1; i<7; i++) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Inserte la nota del modulo " + i + ": ");
                float nota = scan.nextFloat();
                sumaNotas+=nota;
            }

            System.out.println("A media do alumno " + a + " é " + sumaNotas / 6 + "\n");
        }
    }
}
