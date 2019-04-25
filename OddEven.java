
import java.util.Scanner;

class OddEven{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your  number");

   int number = input.nextInt();
		
		
		if(number%2==0){
			System.out.println("even number");
			}
			else{
				System.out.println("odd number");
			}
		
	}
}