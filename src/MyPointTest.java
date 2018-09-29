public class MyPointTest {
    public static void main(String[] args) {

        MyPoint point = new MyPoint(1, 3);

        point.moveHorizontally(4);
        point.moveVertically(6);
        System.out.println(point.toString());

        point.translate(6, 8);
        System.out.println(point.toString());

        System.out.println(point.distanceFromOrigin(point.getXVal(),point.getYVal()));
    }
}
