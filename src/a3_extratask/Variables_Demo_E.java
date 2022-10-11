package a3_extratask;
//2.2 Variable Demo
class ChattingApps{
	String name;
	long number;
	String about;
	static String appName;
}
public class Variables_Demo_E {
	public static void main(String[] args) {
		ChattingApps whatsapp=new ChattingApps();
		
		whatsapp.name="𝐏𝐫𝐚𝐬𝐚𝐧𝐧𝐚 𝐊𝐮𝐦𝐚𝐫 🥰";
		whatsapp.number=+919963961371l;
		whatsapp.about="𝙿𝚞𝚝 𝙾𝚗 𝙰 𝙷𝚊𝚙𝚙𝚢 𝙵𝚊𝚌𝚎...🎭";
		ChattingApps.appName="WhatsApp";
		
		System.out.println("Name 	= "+whatsapp.name);
		System.out.println("Number 	= +"+whatsapp.number);
		System.out.println("About 	= "+whatsapp.about);
		System.out.println("App Name = "+ChattingApps.appName);
	}
}
