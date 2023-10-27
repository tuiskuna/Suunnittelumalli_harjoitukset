public class Arvauspeli{

public static void main(String args[]) {

    Pelaaja p1 = new Pelaaja("p1");
    Pelaaja p2 = new Pelaaja("p2");
    Arvuuttaja arvuuttaja = new Arvuuttaja();

    //aloita peli metodi pyytää objektin paramertina, Arvuuttajan liitypeliin metodi palauttaa mementon (objektin) pelaajalle
    p1.aloitaPeli(arvuuttaja.liityPeliin(p1)); 
    p2.aloitaPeli(arvuuttaja.liityPeliin(p2));

    p1.pelaa(arvuuttaja);
    p2.pelaa(arvuuttaja);

    System.out.println("peli päättyi!");

}  
}