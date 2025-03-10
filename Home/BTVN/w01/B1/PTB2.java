import java.util.Scanner; // For user input

public static double calc (double a, double b, double c, double x)
{
    return a * Math.pow(x, 2) + b * x + c;
}
public static void main(String[] arg)
{
    Scanner scanner = new Scanner(System.in);
    // Input a, b, c
    System.out.print("Nhap a, b, c: \n");

    System.out.print("Nhap a: "); // Input a
    double a = scanner.nextDouble();
    System.out.print("Nhap b: "); // Input b
    double b = scanner.nextDouble();
    System.out.print("Nhap c: "); // Input c
    double c = scanner.nextDouble();

    System.out.print("\nNhap x: "); // Input x
    double x = scanner.nextDouble();

    double res = calc(a, b, c, x);
    System.out.print("\n Ket qua cua da thuc " + a + "x^2 + " + b + "x + " + c + " la: " + res);
    scanner.close();
}