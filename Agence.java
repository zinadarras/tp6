package tp7;

public class Agence {
	Voiture [] voitures ;
	int nbrV ;
	int Capacite=100;
	public Agence (int taille) {
		if (taille<Capacite)
			voitures=new Voiture[taille];
	}
	public void afficheSelection(Critere c) {
		for (int i=0;i<this.nbrV;i++) {
			if (c.estSatisfaitPar(this.voitures[i]))
				System.out.println(this.voitures[i]);
		}
	}
	public void Ajout(Voiture v) {
		if (this.nbrV<this.Capacite) {
			this.voitures[this.nbrV]=v;
			nbrV++;
		}
	}
}
