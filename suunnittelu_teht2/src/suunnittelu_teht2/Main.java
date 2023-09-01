package suunnittelu_teht2;

public class Main {

	public static void main(String[] args) {


		AbstractFactory factory = new BossFactory();
		
		Jasper jasper = new Jasper(factory);
        jasper.puePaalle();
		
	}

}
