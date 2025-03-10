    public static void main(String[] args) {
        String input1 = "2 34.5 -12.9 0 12 1.98 2.66 7.66";
        String input2 = "2 34.5 -12a.9 0 12 1b.98";

        checkNumbers(input1);
        checkNumbers(input2);
    }

    public static void checkNumbers(String input) {
        String regex = "[-+]?\\d*\\.?\\d+";
        String[] tokens = input.split("\\s+");

        int count = 0;
        for (String token : tokens) {
            if (token.matches(regex)) {
                count++;
            } else {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true, có " + count + " số.");
    }