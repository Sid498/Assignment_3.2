import java.util.Scanner;

public class TrueorFalse {

	public static void main(String[] args) {
		
		//Declaring the variables
		boolean Same;
		String s1;
		String s2;
		//Getting output From user
		System.out.println("Enter String "); 
		
		Scanner Get = new Scanner(System.in);
		s1 = Get.nextLine();
		s2 = Get.nextLine();
		
		//checking the string using equals method
		if(s1.equals(s2))
		{
			Same=true;
			System.out.println("The String is Same. "+"Same ="+Same);
		}
		else
		{
			Same=false;
			System.out.println("The String is not Same. "+"Same ="+Same);
		}

	}

}
