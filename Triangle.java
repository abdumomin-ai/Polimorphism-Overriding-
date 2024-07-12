public class Triangle extends GeometricFigure {

    public int TrianglePerimeter(int a, int b, int c){
        return (a + b +c)/2;
    }

    public int TriangleArea(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.TriangleArea(3,4,4));
        System.out.println(triangle.TrianglePerimeter(4,6,7));
    }
}
