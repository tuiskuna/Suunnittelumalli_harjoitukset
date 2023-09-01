package suunnittelu_teht2;

public interface AbstractFactory {
	public abstract Farmarit createFarmarit();
	public abstract Kengat createKengat();
	public abstract TPaita createTpaita();
	public abstract Lippis createLippis();
	
}
