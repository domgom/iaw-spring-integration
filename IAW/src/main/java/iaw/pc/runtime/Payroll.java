package iaw.pc.runtime;

import iaw.pc.messages.Debit;

public class Payroll {

	public void pay(Debit debit){
		System.err.println("PAYROLL:");
		System.out.println("Employee: "+debit.getEmployeeId()+", Amount: "+debit.getAmount());
	}
}
