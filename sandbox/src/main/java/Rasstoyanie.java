public class Rasstoyanie {

    public static void main(String[] args) {

        double p1 = 4;
        double p2 = 0;
        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " равно " + distance(p1, p2));
    }

    public static double distance(double p1, double p2) {

        return Math.sqrt(p1 * p1 + p2 * p2);
    }

}