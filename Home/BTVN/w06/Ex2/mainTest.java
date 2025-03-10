package Home.BTVN.w06.Ex2;

public class mainTest {
    public static void main (String[] arg) {
        // Test Point2D
        Point2D p2d = new Point2D(3, 4);
        System.out.println(STR."Original Point2D: \{p2d}");
        System.out.println(STR."Distance from origin: \{p2d.distance()}");
        System.out.println(STR."Symmetric Point2D: \{p2d.symmetric()}");

        // Test Point3D
        Point3D p3d = new Point3D(3, 4, 5);
        System.out.println(STR."Original Point3D: \{p3d}");
        System.out.println(STR."Distance from origin: \{p3d.distance()}");
        System.out.println(STR."Symmetric Point3D: \{p3d.symmetric()}");

        // Test moving the points
        p2d.move(1, -2);
        p3d.move(-1, 3, -4);
        System.out.println("\nAfter moving:");
        System.out.println(STR."Point2D: \{p2d}");
        System.out.println(STR."Point3D: \{p3d}");

        // Test distance between two 3D points
        Point3D p3d2 = new Point3D(-2, 7, 1);
        System.out.println(STR."New Point3D: \{p3d2})");
        System.out.println(STR."Distance between two Point3D objects: \{p3d.distanceTwoPoint(p3d2)}");
    }
}
