package tp7;

public class Voiture {
	private String marque;
	private String modele;
	private int annee;
	private int prix;
	public Voiture(String marque, String modele, int annee, int prix) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", prix=" + prix + "]";
	}
	
}
