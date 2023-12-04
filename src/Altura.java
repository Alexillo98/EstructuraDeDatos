import java.util.ArrayList;
import java.util.Scanner;

public class Altura
{
    public static int numeroAlumnos()
    {
        int cuantos;
        Scanner escaner = new Scanner(System.in);
        cuantos = escaner.nextInt();
        return cuantos;
    }
    public static ArrayList<Float> leerAlturas()
    {
        ArrayList<Float> alturas = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        float altura = escaner.nextFloat();

        for (int i = 0; i < numeroAlumnos();i++)
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
    public static ArrayList<Float> mostrarResultados(ArrayList<Float> leerAlturas, float media)
    {
        leerAlturas = leerAlturas();
        media = calcularMedia();

        System.out.println("Las alturas son : " + leerAlturas());
        System.out.println("La media de las alturas es " + calcularMedia());
        System.out.println("Los que miden mas de la media son " + calcularAlumnosAlturaSuperior());
        System.out.println("Los que miden por debajo de la media son " + calcularAlumnosAlturaInferior());

        return leerAlturas;
    }
    public static void main(String[] args)
    {

        System.out.println(mostrarResultados(leerAlturas(),calcularMedia()));
    }
}
