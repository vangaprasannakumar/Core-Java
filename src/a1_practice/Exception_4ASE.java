package a1_practice;

public class Exception_4ASE {

	public static void main(String[] args) {
		Object [] obj = new Integer[5];
		try {
			obj[0] = 1;
			System.out.println(obj[0]);
			obj[1] = "a";
			System.out.println(obj[1]);
			obj[2]= 2;
			System.out.println(obj[2]);
		}catch(ArrayStoreException e) {
			e.printStackTrace();
			System.out.println(e.toString()+"\n");
			System.out.println(obj[3] = 3);
		}
	}

}