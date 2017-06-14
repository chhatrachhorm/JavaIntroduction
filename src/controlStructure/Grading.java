package controlStructure;
import java.util.Scanner;
public class Grading {
	float mark;
	char grade;
	public static void main(String[] args) {
		Grading g = new Grading();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter your score: ");
			g.mark = s.nextFloat();}
		if(g.mark>=80) g.grade = 'S';
		else if(g.mark>75) g.grade = 'A';
		else if(g.mark>60) g.grade = 'B';
		else g.grade = 'F';
		System.out.println("Your grade is "+g.grade);
	}
}
