
public class Skuter extends Jednoslad implements Pojazd, SilnikElektryczny{
    protected int predkoscMaks;
    protected double pojemnoscSchowka;
    protected int moc;
    protected float poziomEnergii;

    public Skuter(double masa, double rozstawKol, double wysokoscSiedzenia, int predkoscMaks, double pojemnoscSchowka, int moc, float poziomEnergii){
        super(masa, rozstawKol, wysokoscSiedzenia);
        this.predkoscMaks = predkoscMaks;
        this.pojemnoscSchowka = pojemnoscSchowka;
        this.moc = moc;
        this.poziomEnergii = poziomEnergii;
    }

    @Override
    public void hamuj() {
        System.out.println("Skuter hamuje");
    }
    @Override
    public void jedz() {
        System.out.println("Skuter jedzie");
    }
    @Override
    public void zmienKierunek(String kierunek) {
        System.out.println("Skuter zminil kierunek jazdy na: "+kierunek);
    }
    @Override
    public void uruchomSilnikElektryczny(){
        System.out.println("Uruchomiono silnik elektryczny w skuterze");
    }
    @Override
    public void wylaczSilnikElektryczny(){
        System.out.println("Wylaczono silnik elektryczny w skuterze");
    }
}