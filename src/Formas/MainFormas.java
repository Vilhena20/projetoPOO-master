package Formas;

public class MainFormas {
    public static void main(String[]args){
        Quadrado q = new Quadrado(10);
        System.out.println(q.calcArea());
        System.out.println(q.calcPerimetro());
        Circulo c = new Circulo(10);
        System.out.println(c.calcArea());
        System.out.println(c.calcPerimetro());

        IcalcGeometria x;
        x = new Circulo(10);
    }
}
