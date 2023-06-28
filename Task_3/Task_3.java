//Реализовать простой калькулятор

import java.util.Scanner;

import javax.swing.text.html.parser.Element;

class Program
{
    public static void getValue (int  a, int b, char ch)
    {
        if (ch == '+')
        {
            System.out.printf("%d %s %d = %d", a, ch, b, a + b);   
        }
        else if (ch == '-')
        {
            System.out.printf("%d %s %d = %d", a, ch, b, a - b);   
        }
        else if (ch == '*')
        {
            System.out.printf("%d %s %d = %d", a, ch, b, a * b);   
        }
        else if (ch == '/')
        {
            if (a == 0 || b == 0 )
            {
                System.out.println("You can't divide by zero !");
            }
            else
            {
                System.out.printf("%d %s %d = %d", a, ch, b, a / b);  
            }
        }
        else 
        {
            System.out.println("Input error, please try again !");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter second number : ");
        int b = scanner.nextInt();

        System.out.print("Enter operation(+, -, *, /) : ");
        String operation = scanner.next();
        char ch = operation.charAt(0);

        getValue(a, b, ch);
    }
}