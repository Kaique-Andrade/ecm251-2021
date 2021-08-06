package almeida.andrade.kaique;
import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public  void executar(){
        while (executarSistema){
            exibirMenu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo atual: R$" +this.conta.getSaldo());
                break;
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in); //Deixa ele ler da entrada do sistema - Teclado
        this.executarSistema = true;
        this.conta = new Conta("Naruto",1999,1243);
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta (Título)");
        System.out.println("0 - Encerrar");
    }
}
