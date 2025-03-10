public static void main(String[] args) {
    String s = "Lap trinh Java khong don gian.";
    String s1 = s.replace("a", "");
    System.out.println(new StringBuilder(s1).reverse());
}