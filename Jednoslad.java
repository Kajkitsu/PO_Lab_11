
public abstract class Jednoslad implements Pojazd{
    protected double masa;
    protected double rozstawKol;
    protected double wysokoscSiedzenia;
    public Jednoslad(double masa, double rozstawKol, double wysokoscSiedzenia){
        this.masa = masa;
        this.rozstawKol = rozstawKol;
        this.wysokoscSiedzenia = wysokoscSiedzenia;
    }
}