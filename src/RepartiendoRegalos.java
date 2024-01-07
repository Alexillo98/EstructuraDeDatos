import java.util.ArrayList;
import java.util.Collections;

public class RepartiendoRegalos
{
    public static ArrayList<Integer> reparto (int aterriza,int[] listaportales)
    {
        aterriza = listaportales[0];
        ArrayList<Integer> portales = new ArrayList<>();
        ArrayList<Integer> distancias = new ArrayList<>();
        ArrayList<Integer> resPortales = new ArrayList<>();

        for(int i = 1 ; i < listaportales.length ;i++)
        {
            portales.add(listaportales[i]);
        }
        for (int i = 0 ; i < portales.size() ; i++)
        {
            distancias.add(Math.abs(aterriza- portales.get(i)));
        }

        while (!portales.isEmpty())
        {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < distancias.size(); i++) {
                if (distancias.get(i) < min){
                    min = distancias.get(i);
                }
            }
            resPortales.add(portales.get(min));
        }

        return distancias;
    }
    public static void main(String[] args)
    {
        //NO OK. Entra en un bucle infinito
        int[] portales = {3,4,6,1};

        System.out.println(reparto(portales[0],portales));
    }
}
