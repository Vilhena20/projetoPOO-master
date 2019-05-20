package ProjetoProduto;

public class Produto {
    String descricao;
    private String NomeLoja;
    private Double preco;

    public String getdescricao() {
        return ("ProjetoProduto.Produto de Informática");
    }

    public String getNomeLoja() {
        return NomeLoja;
    }

    public void setNomeLoja(String nomePessoa) {
        this.NomeLoja = NomeLoja;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
