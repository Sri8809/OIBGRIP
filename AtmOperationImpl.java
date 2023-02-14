package ATM;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterfa {
	ATM atm=new ATM();
	Map<Double,String> ministmt=new HashMap<>();

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stubs
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
            ministmt.put(withdrawAmount,"Amount Withdrawn");
			System.out.println("Collect the Amount"+withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}
		else {
			System.out.println("Insufficient balance !!");
		}
		
		
	}
		else {
			System.out.println("please Enter The Amount In Multiple Of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		 ministmt.put(depositAmount,"Amount Deposited");
		System.out.println(depositAmount+ " Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
