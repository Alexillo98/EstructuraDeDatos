import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches
{
    public static void main(String[] args)
    {
        ArrayList<String> coches = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        String tipoCoche;
        do
        {
            tipoCoche = escaner.nextLine();

            if (!tipoCoche.isEmpty())
            {
            coches.add(tipoCoche);
            }
        }while (!tipoCoche.isEmpty());

        Collections.sort(coches);

        System.out.println(coches);
    }
}
