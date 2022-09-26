import java.util.Scanner;

class Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :");
		int b=sc.nextInt();
		System.out.println("Enter the value of c :");
		int c=sc.nextInt();
		int num1=a+b*c;
		int num2=c+a/b;
		int num3=a%b+c;
		int num4=a*b+c;
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println("Maximum num is :" +num1);
		}
		else if(num2>num1 && num2>num3 && num2>num4) {
			System.out.println("Maximum num is :" +num2);
		}
		else if(num3>num1 && num3>num2 && num3>num4) { 
			System.out.println("Maximum num is:"+num3);
		}
		else
			System.out.println("Maximum num is :"+num4);
		if(num1<num2 && num1<num3 && num1<num4) {
			System.out.println("Minimum num is :" +num1);
		}
		else if(num2<num1 && num2<num3 && num2<num4) {
			System.out.println("Minimum num is :" +num2);
		}
		else if(num3<num1 && num3<num2 && num3<num4) { 
			System.out.println("Minimum num is:"+num3);
		}
		else
			System.out.println("Minimum num is :"+num4);
	}

}
