package Natprevar;
import java.util.Scanner;
public class Test {
		public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Vnesi ime na prviot klub i gradot od koj doagja: ");
		String ime1 = input.nextLine();
		String grad1 = input.nextLine();
		System.out.print("Vnesi ime na vtoriot klub i gradot od koj doagja: ");
		String ime2 = input.nextLine();
		String grad2 = input.nextLine();
		Tim partizan = new Tim(ime1, grad1);
		Tim zvezda = new Tim(ime2, grad2);
		KosarkarskiNatprevar finale;
		finale = new KosarkarskiNatprevar (partizan, zvezda);
		System.out.print("Vnesi poeni za prviot tim: ");
		int tim1 = input.nextInt();
		System.out.print("Vnesi poeni za vtoriot tim: ");
		int tim2 = input.nextInt();
		finale.domakjinPoentira(tim1);
		finale.gostinPoentira(tim2);
		finale.pobednikNaNatprevarot();
		}
		}
