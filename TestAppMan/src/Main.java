import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter String: ");
		String strnuminput=scan.nextLine();
		String strnum="";
		int res=0,fac=1;
		for(int i=0;i<strnuminput.length();i++) {
			switch (strnuminput.charAt(i)){
				case'0':strnum=strnum+strnuminput.charAt(i);break;
				case'1':strnum=strnum+strnuminput.charAt(i);break;
				case'2':strnum=strnum+strnuminput.charAt(i);break;
				case'3':strnum=strnum+strnuminput.charAt(i);break;
				case'4':strnum=strnum+strnuminput.charAt(i);break;
				case'5':strnum=strnum+strnuminput.charAt(i);break;
				case'6':strnum=strnum+strnuminput.charAt(i);break;
				case'7':strnum=strnum+strnuminput.charAt(i);break;
				case'8':strnum=strnum+strnuminput.charAt(i);break;
				case'9':strnum=strnum+strnuminput.charAt(i);break;
			}
		}
		for (int i=strnum.length()-1;i>=0;i--){
			res=res+(strnum.charAt(i)-'0')*fac;
			fac=fac*10;
		}
		System.out.println("The output should be: "+res+" in integer.");
	}
}