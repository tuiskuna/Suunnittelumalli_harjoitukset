package suunnittelu_teht5;

public class Main {

	public static void main(String[] args) {


		AbstractFactory factory = AdidasFactory.getInstance();
		
		Jasper jasper = new Jasper(factory);
        jasper.puePaalle();
		
	}

}
