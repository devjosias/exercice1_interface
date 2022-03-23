package android.exojava;

public class Personne {

		public static String nom;
		public static String prenom;
		private double taille;
		private double poids;
		private int age;
		
		
	/* Une personne a 5 attributs : un nom , un prénom , une taille , un poids et un age .
	 * Elle a une méthode : decristoi() qui dit le nom et prénom de la personne créé
	 * */ 
		
public Personne(String nom, String prenom,double taille, double poids, int age) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.taille = taille;
		this.poids = poids;
		this.age = age;	
	}
	

	// Getters et Setters de chaque attribut
		
	//nom
	public String getnom() {
		return this.nom;
	}
	
	public void setnom(String nom){
		this.nom = nom;
	} 
	
	//prenom
	public String getprenom(){
		return this.prenom;
	}
	
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	
	//taille
	public double gettaille () {
		return this.taille;
	}
	
	public void settaille (double taille) {
		this.taille = taille;
	}
	
	//poids
	public double getpoids() {
		return this.poids;
	}
	
	public void setpoids(double poids) {
			this.poids = poids;
	}
	
	//age
	public int getage() {
		return this.age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	//Méthode decristoi()
	
	public static String decrisToi(){
		String description = "Bonjour! Je m'appelle ";
		
		System.out.println(description +  " : " +  Personne.nom + " " + Personne.prenom);
		return (description);
		}

	
	public static void main(String[] args) {
		// création de deux objets distincts personnes (homme et femme)
		Personne hhomme = new Personne("Dehoumon","Boris",1.70,80,30);
		Personne.decrisToi();
		
		Personne phemme = new Personne("Dehoumon","Anais", 1.75,70,25);
		Personne.decrisToi();
	}



}
