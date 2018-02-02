public class Point {

    public static void main(String[] args) {

        System.out.println(distance(3,0, 0,0));
    }

    public static double distance(double x1, double x2, double y1, double y2) {

        return Math.sqrt((x2 - x1) * ((x2 - x1)) + (y2 - y1) * (y2 - y1));
    }


}
