package almeida.andrade.kaique;

public class Basico02 {
    public static void main(String[] args) {
        // Estruturas de decisão no Java
        int poderDeluta = 8000;
        // Decisão simples
        if (poderDeluta >= 8000){
            System.out.println("Kakaroto!");
        }
        // Decisão composta
        if (poderDeluta >= 10000){
            System.out.println("Pode ser super sayajin");
        } else {
            System.out.println("Pode ser o kuririn");
        }
        // Decisão multipla
        int morreu = 5;
        if (morreu == 0){
            System.out.println("Você é uma pessoa normal");
        } else if (morreu < 3){
            System.out.println("Você é um guerreiro que ja foi salvo pelo goku");
        } else if (morreu < 8){
            System.out.println("Provavelmente você é um sayajin!");
        } else {
            System.out.println("Bem vindo de volta kuririn! ");
        }

        // Decisão multipla - switch
        switch (morreu){
            case 0:
                System.out.println("Ola Mundo!");
                break;
            case 10:
                System.out.println("Vixi!");
                break;
            default:
                System.out.println("É nois!");
                break;
        }
    }
}
