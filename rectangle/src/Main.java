public class Main {

    public static void main(String args[]) {

        Rectangle square = new Rectangle(10);
        Rectangle rectangle = new Rectangle(20, 10);

        System.out.println("Площа прямокутника = " + rectangle.square());
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
    }
}
