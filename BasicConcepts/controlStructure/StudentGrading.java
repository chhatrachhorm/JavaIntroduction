/* get input: name, roll, mark1, mark2, mark3
 * make var grade
 * find out total, average
 * assign grade based on the average
 * print the grade
 * */
package controlStructure;
import java.util.Scanner;
	
public class StudentGrading {
	String name;
	char grade;
	int roll;
	float mark1, mark2, mark3, avg, total;
	public static void main(String[] args) {
		StudentGrading std = new StudentGrading();
		try(Scanner scan = new Scanner(System.in)){
			System.out.printf("Please Enter your name: ");
			std.name = scan.nextLine();
			System.out.printf("Please Enter your roll number: ");
			std.roll = scan.nextInt();
			System.out.println("Enter the three mark: ");
			std.mark1 = scan.nextFloat();
			std.mark2 = scan.nextFloat();
			std.mark3 = scan.nextFloat();
		}
		std.total = std.mark1 + std.mark2 + std.mark3;
		std.avg = std.total / 3;
		if(std.avg>=45)std.grade = 'A';
		else if(std.avg>=40)std.grade ='B';
		else if(std.avg>=35)std.grade = 'C';
		else if(std.avg>=30)std.grade ='D';
		else if(std.avg>=25)std.grade ='E';
		else std.grade = 'F';
		System.out.println("You have got avg of "+std.avg+" and your grade is "+std.grade);

	}

}
