import java.util.Scanner;
class input2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Entered String str1 : " + str1);

		String str2 = sc.nextLine();
		System.out.println("Entered String str2 : " + str2);

		int x = sc.nextInt();
		System.out.println("Entered Integer : " + x);

		float f = sc.nextFloat();
		System.out.println("Entered FloatValue : " + f);
	}
}
