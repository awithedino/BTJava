package Home.BTVN.w06.Ex4_Complex;

public class Cmpl implements Comparable<Cmpl>{
    private double inte;
    private double comp;

    public Cmpl () {
        this.inte = 1.0;
        this.comp = - 1.0;
    }

    public Cmpl (double inte, double comp) {
        this.inte = inte;
        this.comp = comp;
    }

    public double getInte() {
        return inte;
    }

    public void setInte(double inte) {
        this.inte = inte;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public Cmpl addCmpl(Cmpl other) {
        double nInte = this.inte + other.inte;
        double nComp = this.comp + other.comp;
        return new Cmpl(nInte, nComp);
    }

    public double modCmpl() {
        return Math.sqrt(inte * inte + comp * comp);
    }

    @Override
    public String toString() {
        return STR."\{inte} + \{comp}i";
    }

    @Override
    public int compareTo(Cmpl other) {
        double left = modCmpl();
        double right = other.modCmpl();
        return Double.compare(left, right);
    }

    public Cmpl mulCmpl (Cmpl other) {
        double a1 = this.getInte() * other.getInte() - this.getComp() * other.getComp();
        double a2 = this.getInte() * other.getComp() + this.getComp() * other.getInte();
        return new Cmpl(a1, a2);
    }
}
