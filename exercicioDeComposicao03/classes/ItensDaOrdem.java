package Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes;

public class ItensDaOrdem {
    private Integer quantidadeDeProdutos;
   private Double preco;
   private Produto produto;


    //Construtores
    public ItensDaOrdem(){
    }

    public ItensDaOrdem(Integer quantidadeDeProdutos, Double preco, Produto produto) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
        this.preco = preco;
        this.produto = produto;
    }

    // metodos
    public Double subTotal(){
        return this.quantidadeDeProdutos * this.preco;
    }

    //Geters e setters


    public Integer getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(Integer quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
