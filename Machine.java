package ATM;

import java.util.Scanner;

public class Machine {
	public static void main(String[] args) {
		AtmOperationInterfa opp =new AtmOperationImpl();
		int atmnumber=965242;
		int atmpin=3457;
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ATM MACHINE !!");
		System.out.println("Enter atm number : ");
		int atmNumber=sc.nextInt();
		System.out.println("enter pin : ");
		int pin=sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true) {
			System.out.println("1. View Avaialable Balanace \n2.Withdraw Amount \n3.Deposit Amount \n4.View Ministatement \n5.Exit :");
			System.out.println("Enter option :");
			int op=sc.nextInt();
			if(op==1) {
				opp.viewBalance();
				
			}
			else if(op==2) {
				System.out.println("Enter Amount to Withdraw ");
				double withdrawAmount=sc.nextDouble();
				opp.withdrawAmount(withdrawAmount);
				
			}
			else if(op==3) {
				System.out.println("enter Amount to Deposit :");
				double depositAmount=sc.nextDouble();//5000
						opp.depositAmount(depositAmount);
				
			}
			else if(op==4) {
				opp.viewMiniStatement();
				
			}
			else if(op==5) {
				System.out.println("Collect yout Atm Card");
				System.out.println("Thank yoy!!!");
			}
			else
			{
				System.out.println("please enter correct option");
			}
		}
	}
		else {
			System.out.println("Incorrect Atm Number or pin");
		}
	}

}
