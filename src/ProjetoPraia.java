public class ProjetoPraia {
    public static void main(String args[]){
        Crianca c1 = new Crianca();
        c1.altura = 1.6;
        c1.corCabelo = "Loiro";
        c1.corPele = "Branca";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        String sorriso = c1.sorrir();
        System.out.println(sorriso);

        Crianca c2 = new Crianca();
        c2.altura = 1.4;
        c2.corCabelo = "Preto";
        c2.corPele = "Amarelo";
        c2.idade = 8;
        c2.brincar();
        c2.correr(450);
        c2.sorrir();

        Vegetacao v1 = new Vegetacao();
        v1.altura = 15;
        v1.corFolhas = "Verde escuro";
        v1.tipo = "Mata costeira";
        v1.alimentacao();
        v1.reproducao();
        System.out.println("Tipo de vegetação: " + v1.tipo);
        System.out.println("Cor das folhas: " + v1.corFolhas);

    }
}
