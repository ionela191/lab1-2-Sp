
public class Element {
	String nume;
	
	public Element(String nume) {
		this.nume=nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Element [nume=" + nume + ", getNume()=" + getNume() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
