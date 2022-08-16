package Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes;

import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classesEnum.StatusDaOrdem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
    private String dataDaOrdem;
    private StatusDaOrdem statusDaOrdem;
    private Cliente cliente;
    private List<ItensDaOrdem>itensDaOrdemList = new ArrayList<>();

    //Construtores
    public Ordem(){
    }

    public Ordem(String dataDaOrdem, StatusDaOrdem statusDaOrdem, Cliente cliente) {
        this.dataDaOrdem = dataDaOrdem;
        this.statusDaOrdem = statusDaOrdem;
        this.cliente = cliente;
    }

    // Metodos
    public void addNovoItem(ItensDaOrdem novoItem){
        itensDaOrdemList.add(novoItem);
    }
    public void removerItemDaOrdem(ItensDaOrdem itemParaRemover){
        itensDaOrdemList.remove(itemParaRemover);
    }
    public double total(){
        double total = 0;
        for(ItensDaOrdem i :itensDaOrdemList){
            total += i.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------- \n \n");
        sb.append("Resumo da Ordem: \n");
        sb.append("Data da ordem: "+ getDataDaOrdem()+ " \n");
        sb.append("Status da ordem: "+getStatusDaOrdem()+"\n");
        sb.append("Nome do cliente: "+getCliente().getNomeDoCliente()+"\n");
        sb.append("E-mail do cliente: "+getCliente().getEmailDoCliente() +"\n");
        sb.append("Itens da ordem: \n");
        for(ItensDaOrdem i :itensDaOrdemList){
            sb.append(i.getProduto().getNomeDoProduto()+", "+
                    "qntidade: "+ i.getQuantidadeDeProdutos()+", "+
                    "subTotal: "+ String.format("%.2f",i.subTotal())+"\n");
        }
        sb.append("O total da ordem é: R$ "+ String.format("%.2f",total()));
        return sb.toString();
    }

    //Gets e Setters

    public String getDataDaOrdem() {
        return dataDaOrdem;
    }

    public void setDataDaOrdem(String dataDaOrdem) {
        this.dataDaOrdem = dataDaOrdem;
    }

    public StatusDaOrdem getStatusDaOrdem() {
        return statusDaOrdem;
    }

    public void setStatusDaOrdem(StatusDaOrdem statusDaOrdem) {
        this.statusDaOrdem = statusDaOrdem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
