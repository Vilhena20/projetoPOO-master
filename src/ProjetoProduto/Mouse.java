package ProjetoProduto;

public class Mouse extends Produto {
    private String tipo;

    public Mouse(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getdescricao(){
        return this.descricao + this.tipo;
    }
}
