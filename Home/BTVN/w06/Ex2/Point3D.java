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
        return STR."Point3D [x = \{this.getX()}, y = \{this.getY()}, z = \{z}]";
    }

    @Override
    public double distance()
    {
        return Math.sqrt(super.distance() * super.distance() + this.z * this.z);
    }

    @Override
    public double distanceTwoPoint(Point3D other) {
        return Math.hypot(super.distanceTwoPoint(other), other.z - this.z);
    }
}
