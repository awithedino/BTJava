import java.util.Scanner;
public static long facto (int n) // recursion for factorial
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else return n * facto(n - 1);
}

public static long calc (long x, int n) // Calculation of the equation
{
    long S = 1;
    for (int i = 1; i <= n; i++)
    {
        S += (facto(n) * (long)Math.pow(x, i) / facto(i));
    }
    return S;
}


public static void main(String[] arg)
{
    Scanner scanner = new Scanner(System.in);

    // Input x, n
    System.out.print("x = ");
    long x = scanner.nextLong();
    System.out.print("n = ");
    int n = scanner.nextInt();

    //  Return S
    System.out.print("S = " + calc(x, n));
}