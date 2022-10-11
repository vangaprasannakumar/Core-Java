package a1_practice;
//Topic :- Local Inner Class
class MistCollege1{
	void notification() {
		System.out.println("Notification about Mid term exam date from : 03/11/2022 to 06/11/2022");
		
		class CivilDepartment1{
			void prepare() {
				System.out.println("Civil department preparing question pape");
			}
		}
		CivilDepartment1 civil = new CivilDepartment1();
		civil.prepare();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		MistCollege1 mist = new MistCollege1();
		mist.notification();
	}
}