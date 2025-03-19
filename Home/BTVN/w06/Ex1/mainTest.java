package Home.BTVN.w06.Ex1;

public class mainTest {
    public static void main (String[] arg) {
//        fraction p1 = new fraction(3, 4);
//        fraction p2 = new fraction(5, 6);
//
//        calcFraction calc = new calcFraction(p1, p2);
//        // Perform operations
//        fraction sum = calc.addFrac();
//        fraction difference = calc.subFrac();
//        fraction product = calc.mulFrac();
//        fraction quotient = calc.divFrac();
//
//        // Print results
//        System.out.println(STR."Fraction 1: \{p1}");
//        System.out.println(STR."Fraction 2: \{p2}");
//        System.out.println(STR."Addition: \{sum}");
//        System.out.println(STR."Subtraction: \{difference}");
//        System.out.println(STR."Multiplication: \{product}");
//        System.out.println(STR."Division: \{quotient}");

        frs list = new frs();

        list.addFraction(new fraction(1, 2));  // 1/2
        list.addFraction(new fraction(3, 4));  // 3/4
        list.addFraction(new fraction(2, 5));  // 2/5
        list.addFraction(new fraction(5, 2));  // 5/2
        list.addFraction(new fraction(4, 4));  // 4/4 (should be 1)

        fraction largest = list.findMax();
        System.out.println(STR." Largest fraction: \{largest}");

        fraction sum = list.sumAll();
        System.out.println(STR." Total sum of fractions: \{sum}");

        int nonIntegerCount = list.countNonInt();
        System.out.println(STR." Number of non-integer fractions: \{nonIntegerCount}");

        int TSlargerMS = list.countTslargerMs();
        System.out.println(STR."Number of fractions which has TS larger than MS: \{TSlargerMS}");
    }
}
