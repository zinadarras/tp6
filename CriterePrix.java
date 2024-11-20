package tp7;

public class CriterePrix implements Critere {
	private int prix;
	public CriterePrix(int prix) {
		this.prix=prix;
	}
	public boolean estSatisfaitPar(Voiture v) {
		return this.prix > v.getPrix();
	}
}
