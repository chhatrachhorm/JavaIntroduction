package array;

import java.util.Scanner;

public class UserNamPassword {

	public static void main(String[] args) {
		String userName, pass;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter your username and password");
			userName = s.nextLine();
			pass = s.nextLine();
		}
		if(userName.equals("Chhatra") && pass.equals("TraDe")){
			System.out.println("You are logined as "+userName);
		}else System.out.println("Either the username or password is incorrect");

	}

}
