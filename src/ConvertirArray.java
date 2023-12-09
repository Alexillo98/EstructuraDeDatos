import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertirArray
{
    public static int[] arrayListArray(ArrayList<Integer> lista)
    {
        int[] array = new int[lista.size()];
        for (int i = 0 ; i < lista.size() ; i++)
        {
            array[i] = lista.get(i);
        }
        return array;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        int numero;
        do
        {
            System.out.print("Introduzca un numero:");
            numero = escaner.nextInt();
            if(numero != -1)
            {
                lista.add(numero);
            }
        }while (numero != -1);

        System.out.println(Arrays.toString(arrayListArray(lista)));
    }
}
