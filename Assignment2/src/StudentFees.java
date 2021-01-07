import java.util.Scanner;
public class StudentFees {

	public static void main(String[] args) {
				
				String college,program;
				int semester,age,matric;
				double grades;
				
				Scanner in = new Scanner (System.in);

				System.out.print("Your name: ");
				String name = in.nextLine();
				
				System.out.print("Your Matric Number: ");
				matric = in.nextInt();
				
				System.out.print("Name of College: (COB/CAS/COLGIS)");
				college = in.next();
				
				System.out.print("Your semester: ");
				semester = in.nextInt();
				
				System.out.print("Your program: ");
				program = in.next();
				
				System.out.println("----Your Details----");
				System.out.println("Name: " + name);
				System.out.println("Matric Number: " + matric);
				System.out.println("College: " + college);
				System.out.println("Semester: " + semester);
				System.out.println("Program: " + program);

				System.out.println("----Question 1----");
				System.out.println("Your grades: ");
				grades = in.nextDouble();
				
				System.out.println(grades);
				
				if (grades == 4.0) {
					System.out.println("Excellent, You received RM500 student fees discount");
				} else if (grades >= 3.0 && grades <= 3.9) {
					System.out.println("Good, You received RM300 student fees discount");
				} else if (grades >= 2.3 && grades <= 2.9) {
					System.out.println("Satisfactory, You received RM100 student fees discount");
				} else if (grades >= 2.0 && grades <= 2.2) {
					System.out.println("Pass, No student fees discount is given");
				} else if (grades <=1.9) {
					System.out.println("Fail, Please attend tuition classes.");
				} else {
					System.out.println("Invalid number");
				
				}	
				
				System.out.println("------Question2------");
				int semester1 = 10;
				
				do {
					System.out.println("Please pay RM800 as registration fees");
					
				} while (semester1 < 10);
				
				
				
		}
				
}
