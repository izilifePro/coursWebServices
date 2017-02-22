
public class Livre{
	int isbn; 
	String titre; 
	String auteur; 

	public Livre(int isbn, String titre, String auteur){
		this.isbn = isbn; 
		this.titre = titre;
		this.auteur = auteur; 
	}

	public void getIsbn(){
		return isbn; 
	}
	public void getTitre(){
		return titre; 
	}
	public void getAuteur(){
		return auteur; 
	}

	public int setIsbn(int i){
		this.isbn = i; 
	}
	public int setTitre(int t){
		this.titre = t; 
	}
	public int setAuteur(int a){
		this.auteur = a; 
	}
}
