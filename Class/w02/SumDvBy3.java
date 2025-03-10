public static void main(String[] arg)
{
    long[] arr = {1, 3, 4, 7, 9, 12, 13, 14, 16, 18};
    long S = 0;
    for (long l : arr) {
        if (l % 3 == 0) {
            S += l;
        }
    }
    System.out.print("S = " + S);
}