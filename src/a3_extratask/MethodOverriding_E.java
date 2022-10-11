package a3_extratask;
class Sports{
	void players(){
		System.out.println("No Players");}
	void duration() {
		System.out.println("No Duration");}
}
class BasketBall extends Sports{
	void players(){
		System.out.println("BasketBall has 12 players");}
	void duration() {
		System.out.println("BasketBall match is 48 minutes");}
}
class FootBall extends Sports{
	void players(){
		System.out.println("FootBall has 11 players");}
	void duration() {
		System.out.println("FootBall match is 90 minutes");}
}
class SportsFactory{
	Sports gerSports(String game) {
		if(game.equals("BasketBall")) {
			return new BasketBall();}
		else if(game.equals("FootBall")) {
			return new FootBall();}
		else {
			return null;}
	}
}
public class MethodOverriding_E {

	public static void main(String[] args) {
		SportsFactory sf = new SportsFactory();			//Factory Method
		Sports b = sf.gerSports("BasketBall");
		b.players();
		b.duration();
		System.out.println("\n-----------------------------\n");
		Sports f = sf.gerSports("FootBall");
		f.players();
		f.duration();
	}
}
		/*
		Sports s = new Sports();				// Upcasting
		s.players();
		s.duration();
		System.out.println("----------");
		s = new BasketBall();
		s.players();
		s.duration();
		System.out.println("----------");
		s = new FootBall();
		s.players();
		s.duration();
		*/