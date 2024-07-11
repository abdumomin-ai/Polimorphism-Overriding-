public class Trapezium extends GeometricFigure{

    public int TrapesiumArea(int a, int b, int h){
        return ((a + b)*h)/2;
    }

    public int TrapesiumPerimeter(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium();
        System.out.println(trapezium.TrapesiumArea(4, 5, 6));
        System.out.println(trapezium.TrapesiumPerimeter(4, 5, 6, 7));
    }
}
