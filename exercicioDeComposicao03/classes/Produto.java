package Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes;

public class Produto {
    private String nomeDoProduto;
    private Double precoDoProduto;

    // Contrutores
    public Produto(){
    }

    public Produto(String nomeDoProduto, Double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    // Geters e Setters

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(Double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
}
