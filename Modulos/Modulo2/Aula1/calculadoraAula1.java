public class calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("O resultado de " + numero1 + " mais " + numero2 + " eh " + resultado +".");
    }
    public static void subtrai(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("O resultado de " + numero1 + " menos " + numero2 + " eh " + resultado + ".");
    }
    public static void multiplica(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("O resultado de " + numero1 + " vezes " + numero2 + " eh " + resultado + ".");
    }
    public static void  divide(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("O resultado de " + numero1 + " dividido por " + numero2 + " eh " + resultado + ".");
    }