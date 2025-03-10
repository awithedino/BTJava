package Home.BTVN.w06.Ex1;

public class calcFraction {
    private fraction a;
    private fraction b;

    public calcFraction() {
        this.a = new fraction(0, 1);
        this.b = new fraction(0, 1);
    }

    public calcFraction(fraction a, fraction b) {
        this.a = a;
        this.b = b;
    }

    public fraction getA() {
        return a;
    }

    public void setA(fraction a) {
        this.a = a;
    }

    public fraction getB() {
        return b;
    }

    public void setB(fraction b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return STR."Phan so A: \{a}, phan so B: \{b}";
    }

    public fraction addFrac() {
        int nTS = a.getTs() * b.getMs() + b.getTs() * a.getMs();
        int nMS = a.getMs() * b.getMs();
        return new fraction(nTS, nMS);
    }

    public fraction subFrac() {
        int nTS = a.getTs() * b.getMs() - b.getTs() * a.getMs();
        int nMS = a.getMs() * b.getMs();
        return new fraction(nTS, nMS);
    }

    public fraction mulFrac() {
        int nTS = a.getTs() * b.getTs();
        int nMS = a.getMs() * b.getMs();
        return new fraction(nTS, nMS);
    }

    public fraction divFrac() {
        int nTS = a.getTs() * b.getMs();
        int nMS = a.getMs() * b.getTs();
        return new fraction(nTS, nMS);
    }
}
