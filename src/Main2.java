import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("***CALCULADOR DE NOTA***");
        System.out.println("--[ Formato = N,M]--\n");
        for(int a = 1; a<4;a++){
            //Alumno alumno = new Alumno();
            Scanner scan = new Scanner(System.in);
/*
            System.out.print("Inserte la nota de BD: ");
            alumno.setNotaBD(scan.nextFloat());

            System.out.print("Inserte la nota de COD: ");
            alumno.setNotaCOD(scan.nextFloat());

            System.out.print("Inserte la nota de Prog: ");
            alumno.setNotaProg(scan.nextFloat());

            System.out.print("Inserte la nota de XML: ");
            alumno.setNotaXML(scan.nextFloat());

            System.out.print("Inserte la nota de FOL: ");
            alumno.setNotaFOL(scan.nextFloat());

            System.out.print("Inserte la nota de SI: ");
            alumno.setNotaSI(scan.nextFloat());

            */
            System.out.print("Inserte el nombre del alumno: ");
            String nombre = scan.nextLine();

            System.out.print("Inserte la nota de BD: ");
            float notaBD = scan.nextFloat();

            System.out.print("Inserte la nota de COD: ");
            float notaCOD = scan.nextFloat();

            System.out.print("Inserte la nota de Prog: ");
            float notaProg = scan.nextFloat();

            System.out.print("Inserte la nota de XML: ");
            float notaXML = scan.nextFloat();

            System.out.print("Inserte la nota de FOL: ");
            float notaFOL = scan.nextFloat();

            System.out.print("Inserte la nota de SI: ");
            float notaSI = scan.nextFloat();

            Alumno alumno = new Alumno(nombre, notaBD, notaCOD, notaProg, notaXML, notaFOL, notaSI);


            float sumaNotas = alumno.getNotaBD() +
                    alumno.getNotaCOD() +
                    alumno.getNotaProg() +
                    alumno.getNotaXML() +
                    alumno.getNotaFOL() +
                    alumno.getNotaSI();

            System.out.println("A media do alumno " + alumno.getNombre() + " é " + sumaNotas / 6 + "\n");
        }
    }
}
