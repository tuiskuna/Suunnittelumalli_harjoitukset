public class Klooniohjelma {
    public static void main(String[] args) {
        Kello kello = new Kello();
        Kello kellonKlooni = kello.clone();

        System.out.println("Alkuperäinen aika: " + kello);
        System.out.println("Kloonin aika: " +kellonKlooni + "\n");
        System.out.println("Vaihdetaan aikaa: Alkuperäiseen 14:50 \\n");
        System.out.println("Klooniin: 20:15");

        kello.vaihdaAika(14, 50);
        kellonKlooni.vaihdaAika(20, 15);
        
        System.out.println("Vaihdoksen jälkeen: ");
        System.out.println("ALkuperäinen kello: " + kello);
        System.out.println("Kloonattu kello: " + kellonKlooni);
    }

}
