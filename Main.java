
public class Main{
    public static void main(String[] args) {
        SamochodOsobowy samOsobowy = new SamochodOsobowy("Opel",5,100,16,32,150,100);
        Skuter skuter = new Skuter(150.74, 2.5, 2.3, 75, 2.5, 50, 122);
        Rower rower = new Rower(14.5, 1.5, 0.75, 7);

        SilnikElektryczny silEl = samOsobowy;
        SilnikSpalinowy silSpal = samOsobowy;
        Samochod samocho = samOsobowy;

        silEl.uruchomSilnikElektryczny();
        silEl.wylaczSilnikElektryczny();

        silSpal.uruchomSilnikSpalinowy();
        silSpal.wylaczSilnikSpalinowy();

        samocho.otworzDrzwi();
        samocho.zamknijDrzwi();
        
    }
}