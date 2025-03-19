package Home.BTVN.w06.Ex4_Complex;
import java.util.List;
import java.util.ArrayList;

public class sCmpl {
    private List<Cmpl> cmpls;

    public sCmpl() {
        this.cmpls = new ArrayList<>();
    }

    public void addCmpl(Cmpl a) {
        cmpls.add(a);
    }

    public void printCmpls() {
        for (Cmpl cmpl : cmpls) {
            System.out.println(cmpl);
        }
    }

    public Cmpl avgAll() {
        if (cmpls.isEmpty()) {
            return null;
        }
        Cmpl sum = new Cmpl(0, 0);
        int count = 0;
        for (Cmpl cmpl : cmpls) {
            sum = sum.addCmpl(cmpl);
            count++;
        }
        return new Cmpl(sum.getInte() / count, sum.getComp() / count);
    }

    public Cmpl maxMod() {
        if (cmpls.isEmpty()) {
            return null;
        }
        double max = Double.MIN_VALUE;
        Cmpl maxCmp = new Cmpl();
        for (Cmpl cmpl : cmpls) {
            if (cmpl.modCmpl() > max) {
                max = cmpl.modCmpl();
                maxCmp = cmpl;
            }
        }
        return maxCmp;
    }

    public int countNonCmpl() {
        int count = 0;
        for (Cmpl cmpl : cmpls) {
            if (cmpl.getComp() == 0) {
                count++;
            }
        }
        return count;
    }

}
