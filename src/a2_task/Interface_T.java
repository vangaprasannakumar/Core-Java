package a2_task;
interface College{
	void noOfStudents();
	void Duration();
	static void common() {
		System.out.println("MIST College located at Sathupalli");}
}
abstract class Technology implements College{
	void call() {
		System.out.println("We call them Engineers");}
}
abstract class Pharmacy implements College{
	void call() {
		System.out.println("We call them Pharmacist");}
}
class BTech extends Technology{
	public void noOfStudents() {
		System.out.println("BTech total 960 Students");}
	public void Duration() {
		System.out.println("BTech For 4 years");}
}
class MTech extends Technology{
	public void noOfStudents() {
		System.out.println("MTech total 240 students");}
	public void Duration() {
		System.out.println("MTech For 2 years");}
}
class BPharmacy extends Pharmacy{
	public void noOfStudents() {
		System.out.println("BPharmacy total 720 students");}
	public void Duration() {
		System.out.println("BPharmacy  For 4 years");}
}
class MPharmacy extends Pharmacy{
	public void noOfStudents() {
		System.out.println("MPharmacy total 120 students");}
	public void Duration() {
		System.out.println("MPharmacy For 2 years");}
}
public class Interface_T {
	public static void main(String[] args) {
		System.out.println("Total Students in MIST College is 2040"+"\n");
		Technology c;
		c = new BTech();
		c.noOfStudents();
		c.Duration();
		c.call();
		College.common();
		System.out.println("-------------------");
		c = new MTech();
		c.noOfStudents();
		c.Duration();
		c.call();
		College.common();
		System.out.println("\n"+"*******************"+"\n");
		Pharmacy m;
		m = new BPharmacy();
		m.noOfStudents();
		m.Duration();
		m.call();
		College.common();
		System.out.println("-------------------");
		m = new MPharmacy();
		m.noOfStudents();
		m.Duration();
		m.call();
		College.common();
	}
}