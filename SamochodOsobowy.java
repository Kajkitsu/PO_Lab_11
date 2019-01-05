public class SamochodOsobowy extends Samochod implements SilnikSpalinowy, SilnikElektryczny {

    protected int liczbaCylindrow;
    protected int liczbaZaworow;
    protected int moc;
    protected float poziomElektryczny;

    public SamochodOsobowy(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika, int liczbaCylindrow, int liczbaZaworow, int moc, float poziomElektryczny) {
        super(nazwa, liczbaMiejsc, pojemnoscBagaznika);
        this.liczbaCylindrow = liczbaCylindrow;
        this.liczbaZaworow = liczbaZaworow;
        this.moc = moc;
        this.poziomElektryczny = poziomElektryczny;
    }

    @Override
    public void otworzDrzwi() {
        System.out.println("Otwarto drzwi w samochodzie osobowym");
    }

    @Override
    public void zamknijDrzwi() {
        System.out.println("Zamknieto drzwi w samochodzie osobowym");
    }

    @Override
    public void uruchomSilnikSpalinowy(){
        System.out.println("Uruchomiono Silnik Spalinowy w samochodzie osobowym");
    }

    @Override
    public void wylaczSilnikSpalinowy(){
        System.out.println("Wylaczono Silnik Spalinowy w samochodzie osobowym");
    }

    @Override
    public void uruchomSilnikElektryczny(){
        System.out.println("Uruchomiono Silnik Elektryczny w samochodzie osobowym");
    }

    @Override
    public void wylaczSilnikElektryczny(){
        System.out.println("Wylaczono Silnik Elektryczny w samochodzie osobowym");
    }

    @Override
    public void jedz(){
        System.out.println("Samochod Osobowy jedzie");
    }

    @Override
    public void hamuj(){
        System.out.println("Samochod Osobowy hamuje");
    }

    @Override
    public void zmienKierunek(String kierunek){
        System.out.println("Samochod osobowy zmienil kierunek jazdy na: "+kierunek);
    }

}