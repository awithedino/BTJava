package Home.BTVN.w06.Ex3;

import Class.w06.Paint2D.*;

public class mainTest {
    public static void printList(IShapeT[] list) {
        for (IShapeT shape : list) {
            System.out.println(shape);
        }
    }

    public static double CalcListPara (IShapeT[] list) {
        double sum = 0.0;
        for (IShapeT shape : list) {
            sum += ((IShapeO) shape).perimeter();
        }
        return sum;
    }

    public static double CalcListArea (IShapeT[] list) {
        double sum = 0.0;
        for (IShapeT shape : list) {
            sum += ((IShapeO) shape).area();
        }
        return sum;
    }

    public static void MinMaxArea(IShapeT[] list) {
        if (list.length == 0) {
            System.out.println("There is no shapes in the list.");
            return;
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double area = 0.0;
        String maxShape = "", minShape = "", shapeName = "";

        for (IShapeT shape : list) {
            area = ((IShapeO)shape).area();
            shapeName = shape.getClass().getSimpleName();

            if (area <= 0) continue;

            if (area < min) {
                min = area;
                minShape = shapeName;
            }

            if (area > max) {
                max = area;
                maxShape = shapeName;
            }
        }

        System.out.println(STR."Shape with the largest area is \{maxShape} with the area of \{max}");
        System.out.println(STR."Shape with the smallest area is \{minShape} with the area of \{min}");
    }

    public static IShapeT[] reratioShapes (IShapeT[] list, double ratio) {
        for (IShapeT shape : list) {
            shape.zoom(ratio);
        }
        return list;
    }

    public static void main(String[] args) {
        IShapeT[] list = {
                new Point2D(10, 10),
                new Point2D(5, 20),
                new Circle2D(new Point2D(-10, 2), 6),
                new Line2D(new Point2D(0, 0), new Point2D(3, 4)),
                new Rectangle2D(new Point2D(5, 5), 8, 4),
                new Triangle2D(new Point2D(2, 2), 3, 4, 5),
                new Square2D(new Point2D(7, 7), 5)
        };

//        Operation
//        double S = 0;
//        for (IShapeT shape : list) {
//            S += ((IShapeO) shape).distance();
//        }
//        System.out.println(S);

        printList(list);
        System.out.println();
        System.out.println(STR."Total sum of all shapes' perimeter: \{CalcListPara(list)}");
        System.out.println(STR."Total sum of all shapes' area: \{CalcListArea(list)}");
        MinMaxArea(list);
        System.out.println();
        printList(reratioShapes(list, 3.8));
    }

}
