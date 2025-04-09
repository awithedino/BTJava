package Home.BTVN.w07;
import java.util.*;
public class tryCatchTest {
    public static void main(String[] arg) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate random array
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Gacha: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(69));
        }
        System.out.println(numbers);

        System.out.println("\nInput n: ");
        int n = -1;
        try {
            n += scanner.nextInt();
            System.out.println("The number in position n: " + numbers.get(n));
        } catch(InputMismatchException e) {
            System.out.println("You must enter an integer.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You must enter an integer in bounds.");
        } finally {
            scanner.close();
        }
    }

}
