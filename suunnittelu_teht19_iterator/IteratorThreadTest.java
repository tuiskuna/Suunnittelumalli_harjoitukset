import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorThreadTest {
    public static void main(String[] args) {
        // Luodaan lista ja lisätään siihen joitakin alkioita
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        // System.out.println("A kohta: Kaksi säiettä, kaksi iteroijaa");

        // // a) Kahden säikeen iterointi omilla iterattoreilla
        // Thread thread1 = new Thread(() -> {
        //     Iterator<Integer> iterator1 = lista.iterator();
        //     while (iterator1.hasNext()) {
        //         System.out.println("Säie 1: " + iterator1.next());
        //         try {
        //             Thread.sleep(100); // Pieni viive selkeyden vuoksi
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // Thread thread2 = new Thread(() -> {
        //     Iterator<Integer> iterator2 = lista.iterator();
        //     while (iterator2.hasNext()) {
        //         System.out.println("Säie 2: " + iterator2.next());
        //         try {
        //             Thread.sleep(100); // Pieni viive selkeyden vuoksi
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // thread1.start();
        // thread2.start();

        // try {
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // System.out.println();
        // System.out.println("B kohta eli kaksi säiettä yksi iteraattori");

        // // b) Kahden säikeen käyttö samaan iteraattoriin vuorotellen
        // Iterator<Integer> iterator = lista.iterator();
        // Thread thread3 = new Thread(() -> {
        //     while (iterator.hasNext()) {
        //         System.out.println("Säie 3: " + iterator.next());
        //         try {
        //             Thread.sleep(100); // Pieni viive selkeyden vuoksi
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // Thread thread4 = new Thread(() -> {
        //     while (iterator.hasNext()) {
        //         System.out.println("Säie 4: " + iterator.next());
        //         try {
        //             Thread.sleep(100); // Pieni viive selkeyden vuoksi
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // thread3.start();
        // thread4.start();

        // System.out.println();
        // System.out.println("C kohta: Muutokset kokoelmaan iteroinnin aikana");

        // // c) Muutokset kokoelmaan iteroinnin aikana
        // Thread thread5 = new Thread(() -> {
        //     Iterator<Integer> iterator3 = lista.iterator();
        //     while (iterator3.hasNext()) {
        //         Integer num = iterator3.next();
        //         if (num == 3) {
        //             System.out.println("poistetaan luku 3");
        //             lista.remove(num); // Poistetaan luku 3
        //         }
        //     }
        // });

        // thread5.start();

        // // Odotetaan, että kaikki säikeet suorittavat loppuun
        // try {
        //     thread3.join();
        //     thread4.join();
        //     thread5.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        System.out.println();
        System.out.println("D kohta: testataan eri metodia");

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Alustetaan iteraattori
        Iterator<String> iterator = colors.iterator();

        System.out.println("Alkiot ennen poistoa:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);

            if (color.equals("Blue")) {
                System.out.println("Poistetaan blue");
                iterator.remove(); // Poistetaan "Blue"
            }
        }

        System.out.println("\nAlkiot remove()-metodin jälkeen:");
        iterator = colors.iterator(); // Luodaan uusi iteraattori

        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}
