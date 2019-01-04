public class Rower extends Jednoslad implements Pojazd{
    protected int liczbaSakw;
    public Rower(double masa, double rozstawKol, double wysokoscSiedzenia, int liczbaSakw){
        super(masa, rozstawKol, wysokoscSiedzenia);
        this.liczbaSakw = liczbaSakw;
    }
    @Override
    public void hamuj() {
        System.out.println("Hamuje rowerem");
    }
    @Override
    public void jedz() {
        System.out.println("Jade rowerem");
    }
    @Override
    public void zmienKierunek(String kierunek) {
        System.out.print("Jade rowerem w ");
        System.out.println(kierunek);
    }
}