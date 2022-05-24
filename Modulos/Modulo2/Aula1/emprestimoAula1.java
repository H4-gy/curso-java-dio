public class emprestimo {
    public static int duasParcelas() {
        return 2;
    }
    public static int tresParcelas() {
        return 3;
    }
    public static float taxaDuas() {
        return 0.3;
    }
    public static float taxaTres() {
        return 0.45;
    }

    public static void calcula(double valor, int parcelas) {
        if (parcelas == 2) {
            double resultado = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Para duas parcelas o valor eh R$" + resultado + ".");
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Para tres parcelas o valor eh R$" + valorFinal + ".");
        } else {
            System.out.println("Quantidade invalida.");
        }
    }
}