import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion
{
    public static void main(String[] args)
    {
        ArrayList<String> numerosBoleto = new ArrayList<>();

        numerosBoleto.add("00004");
        numerosBoleto.add("03847");
        numerosBoleto.add("39804");

        ArrayList<String> ultimoDigito = new ArrayList<>();

        Map<ArrayList<String>, Integer> cuantosBoletos = new HashMap<>();

        for (int i = 0 ; i < numerosBoleto.size() ;i++)
        {
            ultimoDigito.add(String.valueOf(Integer.parseInt(numerosBoleto.get(i))%10));
        }

        for (int i = 0 ; i < 10 ;i++)
        {
            //if (ultimoDigito.get(i) == i)
        }

        System.out.println(cuantosBoletos);
    }
}
