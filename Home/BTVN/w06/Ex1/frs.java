package Home.BTVN.w06.Ex1;
import java.util.List;
import java.util.ArrayList;

public class frs {
    private List<fraction> fractions;

    public frs() {
        this.fractions = new ArrayList<>();
    }

    public void addFraction(fraction a) {
        fractions.add(a);
    }

    public fraction findMax() {
        if (fractions.isEmpty()) {
            return null;
        }
        fraction maxFrac = fractions.getFirst();
        for (fraction fraction : fractions) {
            if (fraction.compareTo(maxFrac) > 0) {
                maxFrac = fraction;
            }
        }
        return maxFrac;
    }

    public fraction sumAll() {
        if (fractions.isEmpty()) {
            return new fraction(0, 1);
        }
        fraction sum = new fraction(0, 1);
        for (fraction fraction : fractions) {
            calcFraction calc = new calcFraction(sum, fraction);
            sum = calc.addFrac();
        }
        return sum;
    }

    public int countNonInt() {
        int count = 0;
        for (fraction fraction : fractions) {
            if (fraction.getTs() % fraction.getMs() != 0) {
                count++;
            }
        }
        return count;
    }
}
