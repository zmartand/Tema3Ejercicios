import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    /*3. El nombre del mes
Escriba el nombre del mes completo en función de su número (introducido por el usuario)*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número del mes: ");
        int mes = scanner.nextInt();
        if (mes == 1) {
            System.out.println("Enero");
        } else if (mes == 2) {
            System.out.println("Febrero");
        } else if (mes == 3) {
            System.out.println("Marzo");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Mayo");
        } else if (mes == 6) {
            System.out.println("Junio");
        } else if (mes == 7) {
            System.out.println("Julio");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Septiembre");
        } else if (mes == 10) {
            System.out.println("Octubre");
        } else if (mes == 11) {
            System.out.println("Noviembre");
        } else if (mes == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Mes no válido");
        }

    }
}
