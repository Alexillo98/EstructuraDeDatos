import java.util.ArrayList;
import java.util.Scanner;

public class AlturaV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlumnos = numeroAlumnos(scanner);

        ArrayList<Double> alturas = leerAlturas(scanner, numAlumnos);

        double media = calcularMedia(alturas);

        int alumnosAltos = calcularAlumnosAlturaSuperior(alturas, media);
        int alumnosBajos = calcularAlumnosAlturaInferior(alturas, media);

        mostrarResultados(alturas, media, alumnosAltos, alumnosBajos);
    }

    public static int numeroAlumnos(Scanner scanner) {
        System.out.print("Ingrese el número de alumnos: ");
        return scanner.nextInt();
    }

    public static ArrayList<Double> leerAlturas(Scanner scanner, int numAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println("Ingrese las alturas de los alumnos:");

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Altura del alumno " + (i + 1) + ": ");
            alturas.add(scanner.nextDouble());
        }

        return alturas;
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;

        for (double altura : alturas) {
            suma += altura;
        }

        return suma / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int contador = 0;

        for (double altura : alturas) {
            if (altura > media) {
                contador++;
            }
        }

        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int contador = 0;

        for (double altura : alturas) {
            if (altura < media) {
                contador++;
            }
        }

        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas, double media, int alumnosAltos, int alumnosBajos) {
        System.out.println("\nAlturas de los alumnos:");

        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i));
        }

        System.out.println("\nAltura media de la clase: " + media);
        System.out.println("Número de alumnos más altos que la media: " + alumnosAltos);
        System.out.println("Número de alumnos más bajos que la media: " + alumnosBajos);
    }
}
