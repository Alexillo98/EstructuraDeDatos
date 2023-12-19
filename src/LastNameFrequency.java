import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LastNameFrequency
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/LastnameFrequencies.csv"));
        String line;

        Map<String,String> freqApellidos = new HashMap<>();
        Scanner escaner = new Scanner(System.in);

        while ((line = reader.readLine())!=null)
        {
            String[] separado = line.split(",");

            if (separado.length == 2)
            {
                freqApellidos.put(separado[0],separado[1]);
            }
        }

        while (true) {
            System.out.println("Ingrese un apellido o Enter para salir:");
            String apellido = escaner.nextLine();

            if (apellido.isEmpty()) {
                System.out.println("Apellido no valido.");
                break;
            }
            String frecuencia = freqApellidos.get(apellido);

            if (frecuencia != null) {
                System.out.println("La frecuencia del apellido es " + frecuencia);
            } else {
                System.out.println("El apellido no esta en la base de datos.");
            }
        }


        reader.close();
    }
}
