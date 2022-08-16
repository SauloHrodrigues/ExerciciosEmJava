package Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes;

import java.util.Date;

public class Cliente {
    private String nomeDoCliente;
    private String emailDoCliente;
    private Date aniversarioDoCliente;

    // Construtores
    public Cliente(){
    }

    public Cliente(String nomeDoCliente, String emailDoCliente, Date aniversarioDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        this.emailDoCliente = emailDoCliente;
        this.aniversarioDoCliente = aniversarioDoCliente;
    }

    //Geters e Setters

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getEmailDoCliente() {
        return emailDoCliente;
    }

    public void setEmailDoCliente(String emailDoCliente) {
        this.emailDoCliente = emailDoCliente;
    }

    public Date getAniversarioDoCliente() {
        return aniversarioDoCliente;
    }

    public void setAniversarioDoCliente(Date aniversarioDoCliente) {
        this.aniversarioDoCliente = aniversarioDoCliente;
    }
}
