
public class Arvauspeli{

 public static void main(String[] args) {
         int pelaajia = 6; 

         Arvuuttaja arvuuttaja = new Arvuuttaja();

          for (int i = 1; i <= pelaajia; i++) {
             Thread pelaajaThread = new Thread(new Pelaaja(arvuuttaja, i));
            pelaajaThread.start();
        }
    }
}
