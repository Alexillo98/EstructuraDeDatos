import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String line;
        Map<String,List<String>> anagramas = new HashMap<>();
        List<String> palabras = new ArrayList<>();

        while ((line = reader.readLine()) != null)
        {
            String alfabetizada = alfabetizar(line);
            palabras = anagramas.get(alfabetizada);

            if(palabras == null)
            {
                palabras = new ArrayList<>();
                palabras.add(line);
                anagramas.put(line, palabras);

            }else
            {

            }

            System.out.println(anagramas);
        }
        reader.close();
    }
    public static String alfabetizar (String palabra) {
        char[] a = palabra.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
