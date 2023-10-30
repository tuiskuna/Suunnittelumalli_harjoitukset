
class Pelaaja implements Runnable {
    private int pelaajaNumero;
    private Arvuuttaja arvuuttaja;

    public Pelaaja(Arvuuttaja arvuuttaja, int numero) {
        this.pelaajaNumero = numero;
        this.arvuuttaja = arvuuttaja;
    }

    public int getPelaajaNumero(){
        return pelaajaNumero;
    }

    @Override
    public void run() {
        Arvuuttaja.Memento memento = arvuuttaja.liityPeliin(this);
        boolean peliVoitettu = false;

        while (!peliVoitettu) {
            int arvaus = 1 + (int) (Math.random() * 10);
            System.out.println(pelaajaNumero + " arvaa luvun: " + arvaus);
            boolean voitto = arvuuttaja.arvaa(memento, arvaus);
            if (voitto) {
                peliVoitettu=true;
                System.out.println("pelaaja numerolla " + pelaajaNumero + " on arvannut oikein numerolla" + arvaus);
            }
        }
    }
}