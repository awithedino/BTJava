public static long facto (long n) // recursion for factorial
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else return n * facto(n - 1);
}

public static double calc (long n) // Calculation of the equation
{
    double S = 0;
    for (int i = 1; i <= n; i++)
    {
        S += ( (i + Math.sqrt(i)) / (1 + facto(i+1)) );
    }
    return S;
}

public static void main(String[] arg)
{
    long n = 7;
    System.out.print("S = " + calc(n));
}