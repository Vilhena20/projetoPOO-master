package ProjetoProduto;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        Mouse m1 = new Mouse("Mouse 01");
        m1.setTipo("Tipo 01");
        m1.setPreco(10.0);
        m1.setTipo("Tipo 01");
        m1.setNomeLoja("Loja 01");

        Livro l1 = new Livro("Livro 01");
        l1.setAutor("autor 01");
        l1.setNomeLoja("autor 01");
        l1.setPreco(15.0);

        carrinho.add(m1);
        carrinho.add(l1);

        for(Produto p : carrinho){
            System.out.println(p.getdescricao());
        }


    }
}
