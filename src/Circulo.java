public class Circulo {
    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public  Double calcPerimetro calcArea(){
        return (2 * Math.PI * this.raio);
    }

    @Override
    public Double calcArea(){
        return (Math.PI * Math.pow(this.raio,2));
    }
}
