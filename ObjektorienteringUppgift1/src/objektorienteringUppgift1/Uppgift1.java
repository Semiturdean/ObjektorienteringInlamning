package objektorienteringUppgift1;


abstract class Uppgift1 {
	Uppgift1(){}
	protected int vikt;
	protected String djurmat;
	protected String namn;
	
	public Uppgift1(int vikt, String djurmat, String namn) { //superklass konstruktor
		this.vikt = vikt;
		this.djurmat = djurmat;
		this.namn = namn;
	}
	public String getName() {
		return namn;
	}
	public int getVikt() {
		return vikt;
	}
	public String getDjurmat() {
		return djurmat;
	}
}
