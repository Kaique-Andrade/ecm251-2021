package almeida.andrade.kaique;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo {
    private double valor;
    private String descriao;
    //Para guardar dados de data
    private LocalDate dataDeVencimento;
    private double jurosAoDia;

    public Titulo(double valor, String descriao, String dataDeVencimento, double jurosAoDia) {
        this.valor = valor;
        this.descriao = descriao;
        this.dataDeVencimento = LocalDate.parse(dataDeVencimento);
        this.jurosAoDia = jurosAoDia;
    }
    public double totalParaPagar(){
        if (!estaAtrasado()){
            return this.valor;
        } else {
            return calcularJuros();
        }
    }

    private double calcularJuros() {
        return this.valor + this.valor * this.jurosAoDia * dataDeVencimento.until(LocalDate.now(),DAYS);
    }

    private boolean estaAtrasado() {
        return LocalDate.now().isAfter(dataDeVencimento);
    }
}
