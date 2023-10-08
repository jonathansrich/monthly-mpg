import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double KM_PER_MILE = 1.60934;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter miles traveled last month: ");
		int miles = input.nextInt();
		double kilometers = miles * KM_PER_MILE;
		
		System.out.print("Enter gallons of gas used last month: ");
		int gallons = input.nextInt();
		
		double kpg = (double) kilometers / gallons;
		kpg = (double) Math.round(kpg * 100) / 100;
		
		System.out.print("Your car's km per gallon is: " + kpg);
	}

}
