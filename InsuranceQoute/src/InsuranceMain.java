import java.util.Scanner;

public class InsuranceMain {

	 static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter username");
		String username=scanner.next();
		System.out.println("Enter Password");
		String password=scanner.next();
		
		InsuranceBean bean=new InsuranceBean();
		bean.setUserName(username);
		bean.setPassword(password);
		
		
		InsuranceService service=new InsuranceService();
		String roll=service.validateUser(bean);
		roll="Admin";
		if(roll.equals("Insured"))
		{
			System.out.println("Insured logged in");
			System.out.println("1.Account creation");
			System.out.println("2.View Policy");
			System.out.println("Enter Your Choice");
			int opt=scanner.nextInt();
			switch(opt)
			{
			case 1:
			System.out.println("Enter Details");
			break;
			case 2:
				System.out.println("View Policy");
				break;
				default:
					System.out.println("Enter Correct Option");
				
			  }
			}
			else if(roll.equals("Agent"))
			{
				System.out.println("Agent logged in");
				System.out.println("1.Account creation");
				System.out.println("2.Policy creation");
				System.out.println("3.View Policy");
				System.out.println("Enter Your Choice");
				int opt1=scanner.nextInt();
				
				switch(opt1)
				{
				case 1:
					System.out.println("Enter Details for Account creation");
					break;
				case 2:
					System.out.println("Enter Details for Policy Creation");
					break;
				case 3:
					System.out.println("Policies are:");
					break;
		        }
			}
				
			else
			{
				System.out.println("Admin logged in");
				System.out.println("1.New Profile Creation");
				System.out.println("2.Account Creation");
				System.out.println("3.Policy Creation");
				System.out.println("4.view policy");
				System.out.println("5.Report Generation");
				System.out.println("ENTER your choice");
				int opt2=scanner.nextInt();
				switch(opt2)
				{
				case 1:
					System.out.println("Enter Details for Creating profile");
					break;
				case 2:
					System.out.println("Enter Details for Account Creation");
					break;
				case 3:
					System.out.println("Enter Details for policy creation");
					break;
				case 4:
					System.out.println("In view Policy");
					break;
				case 5:
					System.out.println("Report Generation");
					break;
					default:
						System.out.println("Enter correct number");
					
				
				
			}
			
		}
		
	}
}
