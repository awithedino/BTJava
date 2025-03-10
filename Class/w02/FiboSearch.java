public static long fibo(double a)
{
    int position = 0;
    long fib1 = 0;
    long fib2 = 1;

    // Find the closest
    while (fib2 <= a) {
        long nextFib = fib1 + fib2;
        fib1 = fib2;
        fib2 = nextFib;
        position++;
    }
    return position;
}

public static void main(String[] arg)
{
    double m = 233;
    System.out.print("n = " + fibo(m));
}