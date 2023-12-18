import java.util.Stack;

public class Parentesis
{
    public static boolean parentizado (String parentesis)
    {
        Stack<Character> caracter = new Stack<>();

        for (int i = 0 ; i < parentesis.length() ; i++)
        {
            char c = parentesis.charAt(i);

            if (c == '(' || c == '{' || c == '[')
            {
                caracter.add(c);
            }else
            {
                if (caracter.isEmpty()) return false;
                char ultimo = caracter.pop();

                if (ultimo == '(' && c != ')') return false;
                if (ultimo == '{' && c != '}') return false;
                if (ultimo == '[' && c != ']') return false;
            }
        }
        return caracter.isEmpty();
    }
    public static void main(String[] args)
    {
        String parentesisBien = "({[]})";
        String parentesisMal = "({[})";

        System.out.println(parentizado(parentesisBien));
    }
}
