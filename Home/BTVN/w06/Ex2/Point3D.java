package Home.BTVN.w06.Ex2;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return STR."Point3D [x = \{getX()}, y = \{getY()}, z = \{z}]";
    }

    @Override
    public Point2D symmetric() {
        return new Point3D(-getX(), -getY(), -z);
    }

    @Override
    public double distance()
    {
        return Math.hypot(super.distance(), z);
    }

    public double distanceTwoPoint(Point3D other) {
        double dx = other.getX() - this.getX();
        double dy = other.getY() - this.getY();
        double dz = other.getZ() - this.getZ();
        return Math.hypot(Math.hypot(dx, dy), dz);
    }

    public void move(double dx, double dy, double dz) {
        super.move(dx, dy);
        this.z += dz;
    }
}
