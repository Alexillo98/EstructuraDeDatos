import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital
{
    public static void main(String[] args)
    {
        //OK
        Map<String, String> paisCapital = new HashMap<>();
        paisCapital.put("España","Madrid");
        paisCapital.put("Portugal","Lisboa");
        paisCapital.put("Alemania","Berlin");
        paisCapital.put("Inglaterra","Londres");

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca el país:");
        String pais = escaner.nextLine();
        if(paisCapital.containsKey(pais))
        {
            System.out.println("La capital de " + pais + " es " + paisCapital.get(pais));
        }else
        {
            System.out.println("El pais no esta en el diccionario.");
        }

    }
}
