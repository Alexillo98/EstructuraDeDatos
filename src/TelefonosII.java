import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII
{
    public static void main(String[] args)
    {
        ArrayList<String> telefonos = new ArrayList<>();
        Map<String,ArrayList<String>> contactos = new HashMap<>();

        telefonos.add("673291982");
        telefonos.add("632432321");
        telefonos.add("643212124");
        contactos.put("Pepe",telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("689652198");
        telefonos.add("699827461");
        telefonos.add("688274919");
        contactos.put("Maria",telefonos);

        System.out.println("Los numero de Pepe son : " + contactos.get("Pepe"));
    }
}
