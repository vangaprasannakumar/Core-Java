package p06_Abstract_NestedClass;
//Topic :- Static Inner Class
class MistCollege2{
	static void notification() {
		System.out.println("Notification about Mid term exam date from : 03/11/2022 to 05/11/2022");
	}
	static class CivilDepartment2{
		static void prepare() {
			System.out.println("Civil department preparing question pape");
		}
		void timetable() {
			System.out.println("1 exam - AP	on 03");
			System.out.println("2 exam - UTP	on 04");
			System.out.println("3 exam - NCSE	on 05");
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		MistCollege2.notification();	
		MistCollege2.CivilDepartment2.prepare();
		MistCollege2.CivilDepartment2 civil = new MistCollege2.CivilDepartment2();
		civil.timetable();
	}
}