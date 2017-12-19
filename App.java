package com.revature.ERS;

import java.util.Scanner;
import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to Matt's ERS");
        System.out.println("Are you an Employee or a Manager");
        boolean wantsToQuit = false;
		Scanner userInput;  
		userInput = new Scanner(System.in);
		String input;
	
		while (wantsToQuit == false)
		{	
			input = userInput.nextLine();
			if (input.equals("Employee"))
			{
			System.out.println("What is your name?");
			input = userInput.nextLine();
			//Search for all instances in the database 
			System.out.println("You have the following reimbursements:");
			//display all instances where Employee name = userInput
			System.out.println("Would you like to submit a new reimbursement?  Y/N");
			input = userInput.nextLine();
				if (input.equals("Y"))
				{
					//Take input to create a new reimbursement
					wantsToQuit = true;
				}
				else if(input.equals("N"))
				{
					System.out.println("Your business is concluded here, quitting program...");
					wantsToQuit = true;
				}
			}
			else if (input.equals("Manager"))
			{
			System.out.println("What is the password?");
			input = userInput.nextLine();
				if (input.equals("IAMTHEBOSS"))
				{
					ersDAO dao = new ersDAO();
					List<Employee> emps = dao.getAllEmployees();
					for (Employee e : emps) {
						System.out.println(e);
					}
					wantsToQuit = true;
				}
				else
				{
					System.out.println("That is not correct, quitting program...");
					wantsToQuit = true;
				}
			}
			else
			{
			System.out.println("That is incorrect, please type 'Employee' or 'Manager' ");
			}
		}
		System.out.println("Thank you for using my program, goodbye!");
    }
}
