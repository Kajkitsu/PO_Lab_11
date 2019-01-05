public class Rower extends Jednoslad implements Pojazd{
    protected int liczbaSakw;
    public Rower(double masa, double rozstawKol, double wysokoscSiedzenia, int liczbaSakw){
        super(masa, rozstawKol, wysokoscSiedzenia);
        this.liczbaSakw = liczbaSakw;
    }
    @Override
    public void hamuj() {
        System.out.println("Rower hamuje");
    }
    @Override
    public void jedz() {
        System.out.println("Rower jedzie");
    }
    @Override
    public void zmienKierunek(String kierunek) {
        System.out.println("Rower zmienil kierunek jazdy na:"+kierunek);
    }
}