public class Pelaaja extends Thread {
    private String nimi;
    private Object object;
    private volatile boolean vastaus = false; //muut säikeet ei voi kirjoittaa samaan 

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }

    public void aloitaPeli(Object object) {
        this.object = object;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void pelaa(Arvuuttaja arvuuttaja) {
        while (!vastaus) {
            int luku = 1 + (int)(Math.random() * 10);
            System.out.println(nimi + " arvaa luvun: " + luku);
            vastaus = arvuuttaja.arvaa(object, luku, nimi);
        }
    }
}
