import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion
{
    public static void main(String[] args)
    {
        //OK
        ArrayList<String> numerosBoleto = new ArrayList<>();

        numerosBoleto.add("00004");
        numerosBoleto.add("03847");
        numerosBoleto.add("39804");
        numerosBoleto.add("39806");

        ArrayList<String> ultimoDigito = new ArrayList<>();

        Map<String, Integer> cuantosBoletos = new HashMap<>();

        for (int i = 0 ; i < numerosBoleto.size() ;i++)
        {
            ultimoDigito.add(String.valueOf(Integer.parseInt(numerosBoleto.get(i))%10));
        }

        for (int i = 0 ; i < ultimoDigito.size() ;i++)
        {
            if(cuantosBoletos.containsKey(ultimoDigito.get(i)))
            {
                int numero = cuantosBoletos.get(ultimoDigito.get(i)) + 1;
                cuantosBoletos.replace(ultimoDigito.get(i),numero);
            }
            cuantosBoletos.put(ultimoDigito.get(i), cuantosBoletos.getOrDefault(ultimoDigito.get(i),1));
        }

        System.out.println(cuantosBoletos);
    }
}
