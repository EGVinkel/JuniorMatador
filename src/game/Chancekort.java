package game;

public class Chancekort {
	private int value;
	private String tekst;
	private int beløb;
	private int felt;
	
	public Chancekort(String tekst, int beløb, int felt, int value) { //bruges til at oprette chancekortene
		this.tekst=tekst;
		this.beløb=beløb;
		this.felt=felt;
		this.value=value;
	}
	public String getTekst() { 
		return tekst;
	}
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBeløb() {
		return beløb;
	}

	public void setBeløb(int beløb) {
		this.beløb = beløb;
	}

	public int getFelt() {
		return felt;
	}

	public void setFelt(int felt) {
		this.felt = felt;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
