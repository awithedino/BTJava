import java.util.Scanner;
public static int Fibo(int n)
{
    int val = 1;
    for (int i = 0; i < n; i++)
    {
        val += Fibo(i-1);
    }
    return val;
}

public static long nearest(long a)
{
    int position = 0;
    long fib1 = 0; // F(n)
    long fib2 = 1; // F(n+1)

    // Find the closest
    while (fib2 < a) {
        long nextFib = fib1 + fib2;
        fib1 = fib2;
        fib2 = nextFib;
        position++;
    }

    // Compare
    if (Math.abs(fib1 - a) <= Math.abs(fib2 - a)) {
        return fib1;
    }
    else {
        return fib2;
    }
}

public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);

    // Nhap gia tri so trong day Fibonacci can tim
    System.out.print("Nhap vi tri so trong day Fibonacci can tim: ");
    int n = scanner.nextInt();
    System.out.print("So thu " + n + " trong day Fibonacci la: " + Fibo(n));
    System.out.println();

    // Tim so gan nhat voi gia tri trong day fibo
    System.out.print("\nNhap x: ");
    long x = scanner.nextLong();
    System.out.print("Gia tri cua day Fibonacci gan nhat voi gia tri " + x + " la: " + nearest(x));
    scanner.close();
}
