import java.util.ArrayList;
import java.util.Scanner;

public class Altura
{
    public static int numeroAlumnos()
    {
        int cuantos;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay;");
        cuantos = escaner.nextInt();
        return cuantos;
    }
    public static ArrayList<Float> leerAlturas()
    {
        ArrayList<Float> alturas = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        float altura = escaner.nextFloat();
        for (int i = 0; i < numeroAlumnos(); i++)
        {
            alturas.add(altura);
        }
        return alturas;
    }
    public static float calcularMedia()
    {
        float suma = 0;
        for (int i = 0 ; i < numeroAlumnos();i++)
        {
            suma += leerAlturas().get(i);
        }
        float media = suma / numeroAlumnos();
        return media;
    }
    public static int calcularAlumnosAlturaSuperior()
    {
        int alturaSuperior = 0;

        for (int i = 0 ; i < leerAlturas().size() ; i++)
        {
            if (leerAlturas().get(i) > calcularMedia())
            {
                alturaSuperior++;
            }
        }
        return alturaSuperior;
    }
    public static int calcularAlumnosAlturaInferior()
    {
        int alturaInferior = 0;

        for (int i = 0 ; i < leerAlturas().size(); i++)
        {
            if(leerAlturas().get(i) < calcularMedia())
            {
                alturaInferior++;
            }
        }
        return alturaInferior;
    }
    public static String mostrarResultados()
    {
        ArrayList<Float> alturas = leerAlturas();
        float media = calcularMedia();
        int alumnosSup = calcularAlumnosAlturaSuperior();
        int alumnosInf = calcularAlumnosAlturaInferior();

        return alturas + " " + media + " " + alumnosSup + " " + alumnosInf;
    }
    public static void main(String[] args)
    {

        System.out.println(mostrarResultados());
    }
}
