import java.util.ArrayList;
import java.util.List;

public class Testiohjelma {
    public static void main(final String[] arguments) {
 Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(image1);
        photoAlbum.add(image2);

        System.out.println("Photo album contents (proxys only):");
        for (Image image : photoAlbum) {
            image.showData();
        }

        System.out.println("Browsing photos (loading images if needed):");
        for (Image image : photoAlbum) {
            image.displayImage();
        }
    }
}