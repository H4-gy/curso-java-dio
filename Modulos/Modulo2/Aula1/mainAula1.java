public class Main {
    public static void main(String[] args) {

        // calculadora
        Calculadora.soma(3, 6);
        Calculadora.subtrai(9, 1.8);
        Calculadora.multiplica(7, 8);
        Calculadora.divide(5, 2.5);
        // mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        // empréstimo
        Emprestimo.calcula(1000, Emprestimo.duasParcelas());
        Emprestimo.calcula(1000, Emprestimo.tresParcelas());
        Emprestimo.calcula(1000, 5);