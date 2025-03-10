package Home.BTVN.w06.Ex1;

public class mainTest {
    public static void main (String[] arg) {
        fraction p1 = new fraction(3, 4);
        fraction p2 = new fraction(5, 6);

        calcFraction calc = new calcFraction(p1, p2);
        // Perform operations
        fraction sum = calc.addFrac();
        fraction difference = calc.subFrac();
        fraction product = calc.mulFrac();
        fraction quotient = calc.divFrac();

        // Print results
        System.out.println(STR."Fraction 1: \{p1}");
        System.out.println(STR."Fraction 2: \{p2}");
        System.out.println(STR."Addition: \{sum}");
        System.out.println(STR."Subtraction: \{difference}");
        System.out.println(STR."Multiplication: \{product}");
        System.out.println(STR."Division: \{quotient}");
    }
}
