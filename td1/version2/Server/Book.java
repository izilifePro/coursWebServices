
public class Book extends Remote implements IBook{
	private int isbn; 
	private String titre; 
	private String auteur; 

	public Book(int isbn, String titre, String auteur){
		this.isbn = isbn; 
		this.titre = titre;
		this.auteur = auteur; 
	}

	public int getIsbn(){
		return isbn; 
	}
	public String getTitre(){
		return titre; 
	}
	public String getAuteur(){
		return auteur; 
	}

	public void setIsbn(int i){
		this.isbn = i; 
	}
	public void setTitre(String t){
		this.titre = t; 
	}
	public void setAuteur(String a){
		this.auteur = a; 
	}
}
