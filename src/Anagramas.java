import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String line;
        Map<String, ArrayList<String>> anagrama = new HashMap<>();
        String[] lasPalabras = {};
        while ((line = reader.readLine()) != null)
        {
            lasPalabras = new String[line.length()];

            for(int i = 0 ; i < lasPalabras.length; i++)
            {
                Arrays.sort(lasPalabras);
            }

        }
        System.out.println(Arrays.toString(lasPalabras));
    }
}
