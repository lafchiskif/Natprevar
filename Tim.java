package Natprevar;

public class Tim {
	private String ime;
	private String mesto;
	public Tim(String ime, String mesto) {
		this.ime=ime;
		this.mesto=mesto;
	}
	public String  toString() {
		return ime + "("+mesto+")";
	}

}

