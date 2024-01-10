import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Botin
{
    //Hasta esto he llegado. No se resolverlo del todo.
    public static int participantes (String participantesBilletes)
    {
        String[] separadoParticipantes = participantesBilletes.split(",");
        int participantes = Integer.parseInt(separadoParticipantes[0]);
        return participantes;
    }
    public static ArrayList<Integer> billetes (String participantesBilletes)
    {
        String[] separadoBilletes = participantesBilletes.split(",");
        int[] total = new int[separadoBilletes.length];
        ArrayList<Integer> billetes = new ArrayList<>();

        for (int i = 0 ; i < separadoBilletes.length ; i++)
        {
            total[i] = Integer.parseInt(separadoBilletes[i]);
        }

        for (int i = 1 ; i < total.length ; i++)
        {
            billetes.add(i-1,total[i]);
        }
        return billetes;
    }
    public static String repartir (int participantes, ArrayList<Integer> billetes)
    {
        Map<Integer,Integer> mapa1 = new HashMap<>();

        for (int i = 0 ; i < participantes ; i++)
        {
            mapa1.put(i,0);
        }

        for (int i = 0 ; i < participantes ; i++)
        {
            mapa1.put(i, billetes.get(i));
        }
        return mapa1.toString();
    }

    public static void main(String[] args)
    {
        String participantesBilletes = "3,10,20,50,200,500";

        System.out.println(repartir(participantes(participantesBilletes),billetes(participantesBilletes)));
    }
}
