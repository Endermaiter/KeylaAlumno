import java.util.Scanner;

public class Main {

    static String[] modulos = {"BD", "COD", "Prog", "XML", "FOL", "SI"};
    static Float[] notas = new Float[6];


    public static void main(String[] args) {
        System.out.println("***CALCULADOR DE NOTA***");
        System.out.println("--[ Formato = N,M]--");
        for (int a = 1; a < 4; a++) {
            String nombreAlumno = pedirNombre();
            pedirNotas(nombreAlumno);
            Alumno alumno = new Alumno(nombreAlumno, notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);
            float sumaNotas = alumno.getNotaBD() +
                    alumno.getNotaCOD() +
                    alumno.getNotaProg() +
                    alumno.getNotaXML() +
                    alumno.getNotaFOL() +
                    alumno.getNotaSI();
            System.out.println("A media do alumno " + alumno.getNombre() + " é " + sumaNotas / 6 + "\n");
        }
    }
    public static void pedirNotas (String nombre){
        for (int i = 0; i < 6; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Inserte la nota de " + nombre + " en el módulo de " + modulos[i] + ":");
            notas[i] = scan.nextFloat();
        }
    }

    public static String pedirNombre(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserte el nombre del alumno: ");
        String nombre = scan.nextLine();
        return nombre;
    }
}