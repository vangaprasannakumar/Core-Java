package a1_practice;
//Topic :- Member Inner Class
class MistCollege{
	void notification() {
		System.out.println("Notification about Mid term exam date from : 03/11/2022 to 06/11/2022");
	}
	class CivilDepartment{
		void prepare() {
			System.out.println("Civil department preparing question pape");
		}		
	}
}
public class MemberInnerClass {
	public static void main(String[] args) {
		MistCollege mist = new MistCollege();
		mist.notification();
		MistCollege.CivilDepartment civil = mist.new CivilDepartment();
		civil.prepare();
	}
}