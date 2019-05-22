public class Test {
    public static void main(String[] args) {
       MoveablePoint p1 = new MoveablePoint();
       MoveablePoint p2 = new MoveablePoint(5,6);
       MoveablePoint p3 = new MoveablePoint(7,8,5,6);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.move();
        p2.move();
        p3.move();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
