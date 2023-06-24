//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Program
{
    public static int SumOfNumbers(int number)
    {
        int result = 0;

        for (int i = 0; i < number; i++)
        {
            result += i + 1;
        }
        return result;
    }

      public static int ProductOfNumbers(int number)
    {
        int result = 1;

        for (int i = 0; i < number; i++)
        {
            result *= i + 1;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число : ");
        int number = scanner.nextInt();

        System.out.println("Сумма чисел от 1 до " + number + " = " + SumOfNumbers(number));
        System.out.println("Произведение чисел от 1 до " + number + " = " + ProductOfNumbers(number));      
    }
}

