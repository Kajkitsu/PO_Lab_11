
public class Main{
    public static void main(String[] args) {
        SamochodOsobowy samOsobowy = new SamochodOsobowy("Opel",5,100,16,32,150,100.225);
        Skuter skuter = new Skuter(150.74, 2.5, 2.3, 75, 2.5, 50, 122.44);
        Rower rower = new Rower(14.5, 1.5, 0.75, 7);
        Jednoslad skuterek = skuter;
        Samochod samochodzik = samOsobowy;
        System.out.println("Rower");
        
    }
}