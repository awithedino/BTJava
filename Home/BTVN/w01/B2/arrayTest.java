package BTVN.B2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayTest {
    private static int cntKhongChiaHetCho3(int[] a) {
        int cnt = 0;
        for (var x : a)
            if (x % 3 == 0)
                cnt++;
        return cnt;
    }

    private static int maxKhongChiaHetCho3(int[] a) {
        int max = 0;
        for (var x : a)
            if (x % 3 == 0)
                max = Math.max(max, x);

        return max;
    }

    private static void tinh(int[] a) {
        int sum = 0, cnt = 0;
        for (var x : a)
            if (x >= -5 && x <= 25) {
                sum += x;
                x++;
            }

        System.out.println("Tổng :" + sum);
        System.out.println("TBC :" + cnt);
    }

    private static void sort (int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (Math.abs(a[i]) < Math.abs(a[j])){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static List<?> filer (int[] a) {
        List<Integer> ls = new ArrayList<>();
        for (var x: a){
            if (x % 5 == 0 && x % 3 != 0)
                ls.add(x);
        }

        return ls;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập n: ");
        int n = scanner.nextInt();

        System.out.println("Nhập giá trị cho mảng: ");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("có " + cntKhongChiaHetCho3(a) + " số trong mảng chia hết cho 3.");

        //Tính tổng các phần tử nằm trong khoảng [-5, 25] và trung bình cộng của chúng.
        tinh(a);

        //Xác định phần tử lớn nhất trong dãy chia hết cho 3.
        System.out.println(maxKhongChiaHetCho3(a) + " là phần tử lớn nhất trong mảng.");

        sort(a);
        System.out.println("Mảng sau khi sắp xếp:");
        for (var x: a)
            System.out.print(x + " ");

        // Loại bỏ các phần tử chia hết cho 5 nhưng không chia hết cho 3 khỏi dãy số.
        System.out.println("Mảng sau khi lọc:");
        for (var x: filer(a))
            System.out.print(x + " ");

        scanner.close();
    }
}