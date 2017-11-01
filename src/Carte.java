import java.util.ArrayList;
import java.util.Arrays;

import model.Animal;



public class Carte {
	private Object autor;
	String titlu;
	String editura;
	int anAparitie;
	int nrPagini;
	protected ArrayList<Element> elemente=new ArrayList<Element>();
	public  Carte(String titlu,String editura,int anAparitie,int nrPagini) {
		this.editura=editura;
		this.editura=editura;
		this.anAparitie=anAparitie;
		this.nrPagini=nrPagini;
		
			
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public int getAnAparitie() {
		return anAparitie;
	}
	public void setAnAparitie(int anAparitie) {
		this.anAparitie = anAparitie;
	}
	public int getNrPagini() {
		return this.nrPagini;
	}
	public void setNrPaginii(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	@Override
	public String toString() {
		return "Carte [autor=" + Arrays.toString((long[]) autor) + ", titlu=" + titlu + ", editura=" + editura + ", anAparitie="
				+ anAparitie + ", nrPagini=" + nrPagini + ", getTitlu()=" + getTitlu() + ", getAnAparitie()="
				+ getAnAparitie() + ", getNrPagini()=" + getNrPagini() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void addCapitol(Capitol a) {
		ArrayList<Element> capitol;
		capitol.addAll(a);	
	}
	
	
	
	

}
