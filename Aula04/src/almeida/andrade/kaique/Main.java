package almeida.andrade.kaique;

public class Main {

    public static void main(String[] args) {
	    //Cria um objeto do tipo conta
        Conta c1;
        //Instancia um objeto conta
        c1 = new Conta("Naruto", 170000);

        Conta c2 = new Conta("Sasuke","123456789-9");

        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta 1: " +c1.toString());
        System.out.println("Conta 2: " +c2.toString());

    }
}
