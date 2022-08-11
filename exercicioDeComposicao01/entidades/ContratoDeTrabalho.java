package Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidades;

import java.util.Date;

public class ContratoDeTrabalho {
    private Date dataDoContrato;
    private Double valorDaHoraTrabalhada;
    private Integer quantidadeDeHorasTrabalhadas;

    //Construtores
    public ContratoDeTrabalho(){

    }

    public ContratoDeTrabalho(Date dataDoContrato, Double valorDaHoraTrabalhada,
                              Integer quantidadeDeHorasTrabalhadas) {
        this.dataDoContrato = dataDoContrato;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
    }

    // metodos
    public Double valorDoContrato(){
        return valorDaHoraTrabalhada*quantidadeDeHorasTrabalhadas;
    }

    public Date getDataDoContrato() {
        return dataDoContrato;
    }

    public void setDataDoContrato(Date dataDoContrato) {
        this.dataDoContrato = dataDoContrato;
    }

    public Double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    public void setValorDaHoraTrabalhada(Double valorDaHoraTrabalhada) {
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public Integer getQuantidadeDeHorasTrabalhadas() {
        return quantidadeDeHorasTrabalhadas;
    }

    public void setQuantidadeDeHorasTrabalhadas(Integer quantidadeDeHorasTrabalhadas) {
        this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
    }
}
