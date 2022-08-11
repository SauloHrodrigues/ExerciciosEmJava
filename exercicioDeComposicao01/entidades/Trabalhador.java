package Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidades;

import Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidadeEnum.NivelDoTrabalhador;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private Departamento departamentoDoTrabalhador;
    private String nomeDoTrabalhador;

    private Double salarioBase;
    private NivelDoTrabalhador nivelDoTrabalhador;
    private List<ContratoDeTrabalho>contratosDoTrabalhador = new ArrayList<>();


    //construtores
    public Trabalhador(){

    }

    public Trabalhador(Departamento departamentoDoTrabalhador, String nomeDoTrabalhador,
                       Double salarioBase, NivelDoTrabalhador nivelDoTrabalhador) {
        this.departamentoDoTrabalhador = departamentoDoTrabalhador;
        this.nomeDoTrabalhador = nomeDoTrabalhador;
        this.salarioBase = salarioBase;
        this.nivelDoTrabalhador = nivelDoTrabalhador;
    }

    //Metodos
    public void adicionarContrato(ContratoDeTrabalho novoContrato){
        contratosDoTrabalhador.add(novoContrato);
    }

    public void removerContrato(ContratoDeTrabalho deletaContrato){
        contratosDoTrabalhador.remove(deletaContrato);
    }

    public Double ganhoMensalDoTrabalhador(Integer ano, Integer mes){
        Double ganhoDoTrabalhador = this.salarioBase;
        Calendar calendario = Calendar.getInstance();
            for(ContratoDeTrabalho contratos : contratosDoTrabalhador ){
                calendario.setTime(contratos.getDataDoContrato());
                int contrato_ano= calendario.get(Calendar.YEAR);
                int contrato_mes= 1+calendario.get(Calendar.MONTH);// o mês do Calendar começa com 0. por isso +1
                if(contrato_ano == ano && contrato_mes == mes){
                    ganhoDoTrabalhador += contratos.valorDoContrato();
                }
            }
        return ganhoDoTrabalhador;
    }

    // Gets e Setrs

    public Departamento getDepartamentoDoTrabalhador() {
        return departamentoDoTrabalhador;
    }

    public void setDepartamentoDoTrabalhador(Departamento departamentoDoTrabalhador) {
        this.departamentoDoTrabalhador = departamentoDoTrabalhador;
    }

    public String getNomeDoTrabalhador() {
        return nomeDoTrabalhador;
    }

    public void setNomeDoTrabalhador(String nomeDoTrabalhador) {
        this.nomeDoTrabalhador = nomeDoTrabalhador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelDoTrabalhador getNivelDoTrabalhador() {
        return nivelDoTrabalhador;
    }

    public void setNivelDoTrabalhador(NivelDoTrabalhador nivelDoTrabalhador) {
        this.nivelDoTrabalhador = nivelDoTrabalhador;
    }
}
