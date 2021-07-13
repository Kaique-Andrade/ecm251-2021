package almeida.andrade.kaique;

import java.util.Locale;
import java.util.Scanner;

public class Basico04 {
    //Interagir com o terminal - entrada de dados do usuario
    public static void main(String[] args) {
        String nome, mes, cavaleiro;
        System.out.println("Informe seu nome: ");

        //Para ler dados do teclado (console)
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("Informe o mês do seu aniversário: ");
        mes = scanner.nextLine();

        System.out.println("Nome: " +nome+ " Mês: " + mes);
        cavaleiro = achaCavaleiro(mes);
        System.out.println("Cavaleiro: " + cavaleiro);
        
    }

    private static String achaCavaleiro(String mes) {
        mes = mes.toLowerCase();
        if (mes.equals("Janeiro")) return "Shura";
        else if (mes.equals("Fevereiro")) return "Kamus";
        else if (mes.equals("Março")) return "Afrodite";
        else if (mes.equals("Abril")) return "Mu";
        else if (mes.equals("Maio")) return "Aldebaram";
        else if (mes.equals("Junho")) return "Saga/Kanon";
        else if (mes.equals("Julho")) return "Máscara da Morte";
        else if (mes.equals("Agosto")) return "Aioria";
        else if (mes.equals("Setembro")) return "Shaka";
        else if (mes.equals("Outubro")) return "Mestre Ancião";
        else if (mes.equals("Novembro")) return "Miro";
        else if (mes.equals("Dezembro")) return "Aioros";
        else  return "Serpentário";
    }
}
