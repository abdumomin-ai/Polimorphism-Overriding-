public class Restangle extends GeometricFigure{


    public int RestangleArea(int a, int b){
        return a * b;
    }
    public int RestanglePerimetr(int a, int b){
        return (a + b)*2;
    }

    public static void main(String[] args) {
        Restangle restangle = new Restangle();
        System.out.println(restangle.RestangleArea(3, 2));
        System.out.println(restangle.RestanglePerimetr(3, 2));
    }
}
