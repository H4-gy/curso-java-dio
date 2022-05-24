public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Quadrado possui área" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Retângulo possui área" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Trapézio possui área" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Losango possui área" + (diagonal1 * diagonal2)/2);
    }

}