package p03_Mtypes_MOL;
class ExamBranch{
	void form() {
		System.out.println("Details    :\n\f Name: V. Prasanna Kumar\n\f PIN : 19C65A0124\n\f Branch: Civil");
	}
	void submitProof(String id) {
		System.out.println("ID Number  : "+id);
	}
	String passBook ( ) {
	    return "Payment Recipt" ;
	}
	String deposit ( int amount ) {
	    System.out.println ("Amount given " + amount ) ;
	    return "Paid" ;
	}
}
public class Method_Types {
	public static void main(String[] args) {
		ExamBranch SemExam = new ExamBranch();
		SemExam.form ( ) ;
		SemExam.submitProof ("19C65A0124 ") ;
		System.out.println ("Exam Branch given " + SemExam.passBook ( ) ) ;
		System.out.println ("Amount " + SemExam.deposit (960) ) ;
	}
}
