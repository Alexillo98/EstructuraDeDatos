import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCountries
{
    public static void main(String[] args) throws IOException
    {
        //OK
        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String line;
        String[] columnasSeparadas;
        Map<String,Integer> pertenecen = new HashMap<>();

        while ((line = reader.readLine()) != null)
        {
            reader.readLine();
            columnasSeparadas = line.split(",");

            for (int i = 0 ; i < columnasSeparadas.length ; i++)
            {
                if (pertenecen.containsKey(columnasSeparadas[6]))
                {
                    int contador = pertenecen.get(columnasSeparadas[6]) + 1;
                    pertenecen.replace(columnasSeparadas[6],contador);
                }else
                {
                pertenecen.put(columnasSeparadas[6],pertenecen.getOrDefault(columnasSeparadas[6],1));
                }
            }
            System.out.println(pertenecen);
        }
        reader.close();
    }
}
