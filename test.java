import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double X,Y;
		char Z;
		Scanner getnum=new Scanner(System.in);
		System.out.println("Enter the frirst number");
		 X= getnum.nextDouble();
		 System.out.println("Enter the secound number");
		 Y= getnum.nextDouble();
		 System.out.println("Enter the operation");
		 Z= getnum.next().charAt(0);
		 if(Z=='+') {
			 System.out.println(X+Y);
		 }if(Z=='-') {
			 System.out.println(X-Y);
		 }if(Z=='/') {
			 System.out.println(X/Y);
		 }if(Z=='*') {
			 System.out.println(X*Y);
		 }if (Z=='%') {
			 System.out.println(X%Y);
		 }
		     System.out.print("please click any button to get out");
		     getnum.nextByte();
		 }
	}


