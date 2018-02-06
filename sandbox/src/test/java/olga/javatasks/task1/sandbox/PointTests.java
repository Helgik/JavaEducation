package olga.javatasks.task1.sandbox;

import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(4, 3);
        Point p2 = new Point(0, 0);
        assert p1.distance(p2) == 5;
    }

}
