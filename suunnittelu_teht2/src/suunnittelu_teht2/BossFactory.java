package suunnittelu_teht2;

public class BossFactory implements AbstractFactory {

	@Override
	public Farmarit createFarmarit() {
		return new BossFarmarit();
	}

	@Override
	public Kengat createKengat() {
		return new BossKengat();
	}

	@Override
	public TPaita createTpaita() {
		return new BossTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

}
