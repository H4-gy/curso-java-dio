public class Main {

    public static void main(String[] args) {
        //praticando retornos
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Quadrado possui área" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Retângulo possui área" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Trapézio possui área" + areaTrapezio);
    }
}