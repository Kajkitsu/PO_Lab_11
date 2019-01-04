public class SamochodOsobowy extends Samochod implements SilnikSpalinowy, SilnikElektryczny {

    protected int liczbaCylindrow = 0;
    protected int liczbaZaworow = 0;
    protected int moc = 0;
    protected float poziomElektryczny = 0;

    public SamochodOsobowy(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika, int liczbaCylindrow, int liczbaZaworow, int moc, float poziomElektryczny) {
        super(nazwa, liczbaMiejsc, pojemnoscBagaznika);
        this.liczbaCylindrow = liczbaCylindrow;
        this.liczbaZaworow = liczbaZaworow;
        this.moc = moc;
        this.poziomElektryczny = poziomElektryczny;
    }

    public void otworzDrzwi() {
        System.out.println("Otwarto drzwi");
    }

    public void zamknijDrzwi() {
        System.out.println("Zamknięto drzwi");
    }

}