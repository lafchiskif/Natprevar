package Natprevar;

public class KosarkarskiNatprevar {
	public Tim domakjin, gostin;
	public int brojPoeniDomakjin, brojPoeniGosti;
	public KosarkarskiNatprevar(Tim d, Tim g) {
		domakjin=d;
		gostin=g;
	}
	public void domakjinPoentira(int brojPoeni) {
		brojPoeniDomakjin+=brojPoeni;
	}
	public void gostinPoentira(int brojPoeni) {
		brojPoeniGosti=brojPoeni;
	}
	public void pobednikNaNatprevarot() {
		if(brojPoeniDomakjin>brojPoeniGosti)
			System.out.print("Pobednik e "+domakjin);
		else if (brojPoeniDomakjin < brojPoeniGosti)
			System.out.println("Pobednikot e " + gostin);
			else
			System.out.println("Nereseno (prodolzetoci)");

	
}
}