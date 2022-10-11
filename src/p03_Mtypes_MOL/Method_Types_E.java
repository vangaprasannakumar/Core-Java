package p03_Mtypes_MOL;
//1 Types Of Methods
class WifiAgent{
	void form() {
		System.out.println("Details- Name: V. Prasanna Kumar, Number: 9963961371, Area: Penuballi");
	}
	void submitProof(String id) {
		System.out.println("Aadhar no = "+id);
	}
	String Router( ) {
	    return "Wifi Router & Recharge Payment Recipt" ;
	}
	String Recharge( int amount ) {
	    System.out.println ("Amount given " + amount ) ;
	    return "Paid" ;
	}
}
public class Method_Types_E {
	public static void main(String[] args) {
		WifiAgent wifibill = new WifiAgent(); 
		wifibill.form ( ) ;
		wifibill.submitProof ("574561575070") ;
		System.out.println ("WifiAgent given " + wifibill.Router( ) ) ;
		System.out.println ("Amount " + wifibill.Recharge(700) ) ;
	}
}
