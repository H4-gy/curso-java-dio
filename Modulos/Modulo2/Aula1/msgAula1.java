public class mensagem {

    public static void mensagemHora(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                msgDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                msgTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                msgNoite();
                break;
            default:
                System.out.println("Entrada invalida.");
                break;
        }
    }
    public static void msgDia() {
        System.out.println("Bom dia.");
    }
    public static void msgTarde() {
        System.out.println("Bom tarde.");
    }
    public static void msgNoite() {
        System.out.println("Bom noite.");
    }
}