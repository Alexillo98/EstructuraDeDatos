import java.util.ArrayList;
import java.util.Scanner;

public class AddAll
{
    public static ArrayList<String> combinar (ArrayList<String> cadena1, ArrayList<String> cadena2)
    {
        Scanner escaner = new Scanner(System.in);
        String palabra;

        do
        {
            System.out.println("Introduzca la palabra a añadir a la lista 1: ");
            palabra = escaner.nextLine();

            if(!palabra.isEmpty())
            {
                cadena1.add(palabra);
            }
        }while (!palabra.isEmpty());
        do
        {
            System.out.println("Introduzca la palabra a añadir a la lista 2: ");
            palabra = escaner.nextLine();

            if(!palabra.isEmpty())
            {
                cadena2.add(palabra);
            }
        }while (!palabra.isEmpty());
        ArrayList<String> cadena3 =new ArrayList<String>();
        // ¿PORQUE ES BOOLEANO EL "addAll"?
        //cadena3 = cadena1.addAll(cadena2);
        return cadena3;
    }
    public static void main(String[] args)
    {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        System.out.println(combinar(lista1,lista2));
    }
}
