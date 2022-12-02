package p02_LV_VD;

public class LocalVariable 
{
	public static void main(String []args) 
	{
		int l=20,b=4,P=2000,R=5,T=5;
		
		System.out.println("Length = "+l+" and Breadth = "+b);
		System.out.println("Area of Triangle	= "+(0.5*l*b)+" m²");
		
		System.out.println("--------------");
		
		System.out.println("Principal Amount = ₹"+P+""+", Rate of Interest per year in decimal = "+R+"%"+" & Time Periods involved = "+T+" Years");
		System.out.println("Simple Interest		= "+((P*R*T)/100));
	}
}
