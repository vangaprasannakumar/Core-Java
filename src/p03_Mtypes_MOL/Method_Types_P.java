package p03_Mtypes_MOL;
class Bank{
	void form() {
		System.out.println("Details- name: V. Prasanna Kumar, age:21");
	}
	void submitProof(String id,String address) {
		System.out.println("id = "+id+" and address = "+address);
	}
	String passBook ( ) {
	    return " passbook " ;
	}
	String deposit ( int amount ) {
	    System.out.println ("Amount given " + amount ) ;
	    return "Deposited" ;
	}
}
public class Method_Types_P {
	public static void main(String[] args) {
		Bank sbi = new Bank();
		sbi.form ( ) ;
		sbi.submitProof ("PAN: BLQPV6707A " , " Aadhar : 574561575079 " ) ;
		System.out.println ("Bank given " + sbi.passBook ( ) ) ;
		System.out.println ("Amount " + sbi.deposit (15000) ) ;
	}
}
