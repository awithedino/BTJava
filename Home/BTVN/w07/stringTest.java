package Home.BTVN.w07;
import java.util.Arrays;

public class stringTest {
    private final String[] string;

    public stringTest(String s) {
        string = s.split("\\s+");
    }

    public boolean canCastToNum() {
        try {
            Arrays.stream(string).forEach(Double::parseDouble);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int countNum() {
        return string.length;
    }

    public static void main(String[] args) {
        stringTest countNumber = new stringTest("2 34.5 -12.9 0 12 1.98");
        if (countNumber.canCastToNum())
            System.out.println(countNumber.countNum());
        else
            System.out.println("not only include number");
    }
}