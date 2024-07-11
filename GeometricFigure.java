public class GeometricFigure {

    public int TriangleArea(int a, int b, int c){
        return (a + b +c)/2;
    }

    public int TrianglePerimeter(int a, int b, int c){
        return a + b + c;
    }

    public int TrapesiumArea(int a, int b, int h){
        return ((a + b)*h)/2;
    }

    public int TrapesiumPerimeter(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public int RestangleArea(int a, int b){
        return a * b;
    }
    public int RestanglePerimetr(int a, int b){
        return (a + b)*2;
    }
}
