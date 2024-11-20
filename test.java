package tp7;

public class test {

	public static void main(String[] args) {
		Agence A=new Agence(3);
		Voiture v1=new Voiture("BMW","serie 5",2023,540);
		Voiture v2=new Voiture("Mercedes","E200",2016,90);
		Voiture v3=new Voiture("Clio","Clio",2023,700);
		A.Ajout(v1);
		A.Ajout(v2);
		A.Ajout(v3);
		CriterePrix c1=new CriterePrix(100);
		CritereMarque c2=new CritereMarque("Clio");
		A.afficheSelection(c1);
		A.afficheSelection(c2);
	}

}
