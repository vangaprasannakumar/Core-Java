package p04_Constructor_This_super;
//Extra Task
class Circket{
	Circket(int players){
		System.out.println("Circket Team Players are = "+players);
	}
}
class VolleyBall extends Circket{
	VolleyBall(int players){
		super(11);
		System.out.println("VolleyBall Team Players are = "+players);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		VolleyBall obj = new VolleyBall(7);
	}
}
