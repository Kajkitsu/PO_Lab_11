public class Samochod implements Pojazd{
    protected int liczbaMiejsc = 0;
    protected int pojemnoscBagaznika = 0;
    protected String nazwa = null;

    public Samochod(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika){
        this.nazwa=nazwa;
        this.liczbaMiejsc=liczbaMiejsc;
        this.pojemnoscBagaznika=pojemnoscBagaznika;
    }

    public void otworzDrzwi(){}

    public void zamknijDrzwi(){}

}