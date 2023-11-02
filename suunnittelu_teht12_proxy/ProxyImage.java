public class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }

    public void showData() {
        if(image == null){
            System.out.println("Name: " + filename);
        }
        else{
        image.showData();
        }
    }
}
