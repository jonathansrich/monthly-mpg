import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter miles traveled last month: ");
		int miles = input.nextInt();
		
		System.out.print("Enter gallons of gas used last month: ");
		int gallons = input.nextInt();
		
		double mpg = (double) miles / gallons;
		
		System.out.print("Your car's miles per gallon is: " + mpg);
	}

}
