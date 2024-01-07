import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos
{
    public static void main(String[] args)
    {
        //OK
        Map<String,Integer> contactos = new HashMap<>();

        contactos.put("Pepe", 642666555);
        contactos.put("Maria", 642748212);
        contactos.put("Alberto", 642986531);
        contactos.put("Juan", 642530183);

        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduzca el contacto a buscar: ");
        String contacto = escaner.nextLine();

        if(contactos.containsKey(contacto))
        {
            System.out.println("El numero de " + contacto + " es " + contactos.get(contacto));
        }else
        {
            System.out.println("El contacto no existe.");
        }
    }
}
