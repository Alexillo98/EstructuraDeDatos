import java.util.ArrayList;
import java.util.Scanner;

public class Existe
{
    public static boolean existe (ArrayList<Integer> valores, int valor)
    {
        boolean existe = false;

        for(int i = 0 ; i < valores.size() ; i++)
        {
            if(valores.get(i) == valor)
            {
                existe = true;
            }
        }
        return existe;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduzca el valor a buscar: ");
        int valor = escaner.nextInt();
        int numero;
        do
        {
            System.out.print("Introduzca el valor a añadir a la lista: ");
            numero = escaner.nextInt();
            if(numero != -1)
            {
                lista.add(numero);
            }
        }while (numero != -1);

        if(existe(lista,valor))
        {
            System.out.println("Existe.");
        }else
        {
            System.out.println("No existe.");
        }
    }
}
