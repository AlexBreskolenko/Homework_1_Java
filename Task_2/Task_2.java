//Вывести все простые числа от 1 до 1000

class Program
{
    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        for (int i = 2; i <= 1000; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
