public class Rasstoyanie {

    Point x = new Point();
    Point y = new Point();

    x.p1 = 4;
    y.p2 = 0;

    public static void main(String[] args) {



        System.out.println(distance(x.p1, y.p2));
    }

    public static double distance(Point p1, Point p2) {

        return Math.sqrt(p1.x * p1.x + p2 * p2);
    }

}
