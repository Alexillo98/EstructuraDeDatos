import java.util.Objects;
import java.util.Stack;

public class ExpresionesAritméticas
{
    public static int calcular (String valores)
    {
        Stack<Integer> numeros = new Stack<>();
        String[] datos = valores.split(" ");

        int n1,n2,resultado;

        for (int i = 0 ; i < datos.length ;i++)
        {
            if(Objects.equals(datos[i], "/"))
            {
                n1 = numeros.pop();
                n2 = numeros.pop();
                resultado = n2 / n1;
                numeros.push(resultado);
            }else if(Objects.equals(datos[i],"*"))
            {
                n1 = numeros.pop();
                n2 = numeros.pop();
                resultado = n2 * n1;
                numeros.push(resultado);
            }else if(Objects.equals(datos[i],"+"))
            {
                n1 = numeros.pop();
                n2 = numeros.pop();
                resultado = n2 + n1;
                numeros.push(resultado);
            } else if (Objects.equals(datos[i],"-")) {
                n1 = numeros.pop();
                n2 = numeros.pop();
                resultado = n2 - n1;
                numeros.push(resultado);
            }else
            {
                numeros.push(Integer.valueOf(datos[i]));
            }
        }
        return numeros.pop();
    }
    public static void main(String[] args)
    {
        String expresion = "5 1 2 + 4 * + 3 -";

        System.out.println(calcular(expresion));
    }
}
