package Class.w06.Paint2D;

public class Square2D extends Rectangle2D{
    public Square2D(Point2D c, double s) {
        super(c, s, s);
    }

    public void setS (double s) {
        super.setA(s);
        super.setB(s);
    }

    public double getS() {
        return super.getA();
    }

    @Override
    public String toString() {
        return STR."Square2D [c = \{getC()}, side = \{getS()}]";
    }
}
