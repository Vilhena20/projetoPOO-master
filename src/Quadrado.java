public class Quadrado implements ICalcGeometria {
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcArea(){
        return (this.lado * this.lado);
    }

    @Override
    public Double calcPerimetro(){
        return (4*this.lado);
    }
}
