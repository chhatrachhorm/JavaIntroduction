package controlStructure;
import java.util.Scanner;
/*
 * create var : unit, amount, USD
 * if unit < 100 -> perunit =>1200
 * if unit > 100 AND unit <=200 -> perunit => 1500
 * if unit > 200 -> perunit => 2000
 * */
public class ElectricityBill {
	private int unit, perunit;
	private float amount, kd;
	private int price(int a){
		int p;
		if(a>=100)p = 1200;
		else if(a>100 && a<=200)p = 1500;
		else p = 2000;
		return p;
	}
	public static void main(String[] args) {
		ElectricityBill B = new ElectricityBill();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Please enter your montly Electricity consumption(kWh): ");
			B.unit = s.nextInt();
			System.out.println("Enter today money exchanging rate(From khmer to Dollor): ");
			B.kd = s.nextInt();
		}
		B.perunit = B.price(B.unit);
		B.amount = B.unit * B.perunit / B.kd;
		System.out.printf("You have to pay: %.2f($)", B.amount);
	}

}
