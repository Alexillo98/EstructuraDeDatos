import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuency
{
    public static void main(String[] args)
    {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce las palabras:");
        String palabras = escaner.nextLine();
        String[] palabrasSeparadas = palabras.split(" ");
        Map<String,Integer> cuantasSeRepiten = new HashMap<>();

        for (int i = 0 ; i < palabrasSeparadas.length ; i++)
        {
            if (cuantasSeRepiten.containsKey(palabrasSeparadas[i]))
            {
                int contador = cuantasSeRepiten.get(palabrasSeparadas[i]) + 1;
                cuantasSeRepiten.replace(palabrasSeparadas[i],contador);
            }
            cuantasSeRepiten.put(palabrasSeparadas[i], cuantasSeRepiten.getOrDefault(palabrasSeparadas[i],1));
        }
        System.out.println(cuantasSeRepiten);
    }
}
