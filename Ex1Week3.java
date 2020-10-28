import java.util.Scanner;

public class Ex1Week3
{
	public static void main (String[] nilai)
	{

		int noInt = 10;
		int x;

		if(noInt ==19)
			System.out.println("sama");
		else
			System.out.println("tak sama");
		
		System.out.println(noInt==10?"sama":"tak sama");

		if (noInt==10)
			x = 3;
		else
			x = 19;

		//termary operator
		x = noInt==10?3:19;

		System.out.println("x is "+ x);
		/*String nama;
		int nombor;
		double no;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string : ");
		nama = input.nextLine();					//.next() or input.nextLine()
		System.out.println("String is : "+ nama);

		System.out.println("Enter a number : ");
		nombor = input.nextInt();
		System.out.println("Number is: " + nombor);

		//input.nextLine();

		System.out.println("Enter a number : ");
		no = input.nextDouble();
		System.out.println("Number is : "+ no);


		input.close();*/
		/*int []tataInt = {10,20,30,40};	
		
		//ordianary for
		for (int i = 0; i<tataInt.length; i++)
		{
			System.out.println(tataInt[i]);
		}

		//for-each or advanced for
		for (int t : tataInt)
		{
			System.out.println("for each: "+t);
		}*/

		//int noInt = '10';	//declare
		//System.out.println("Intger "+noInt);

		//final adalah constant var
		/*final char CHARSAYA = 53;		//asci code
		System.out.println("Char "+CHARSAYA);
		CHARSAYA = 100;
		System.out.println("Char "+CHARSAYA);*/

		//int []tataInt = new int[4];	//declare
		
		//for (int i = 0; i<nilai.length; i++)
		//{
		//	System.out.println(tataInt[i]);
		//} 
		/*int noInt = 123;
		int noInt2 = 456;
		double noDouble = 123.456;
		System.out.format("%6d dan %4d",noInt, noInt2);
		System.out.format("%4d",noInt2);
		System.out.format("%7.2f",noDouble);
		System.out.printf("\nRM%7.1f", noDouble);*/

		/*System.out.println("Nilai 1 : "+nilai[0]);
		System.out.println("Nilai 2 : "+nilai[1]);
		System.out.println("Nilai 3 : "+nilai[2]);

		//javac Ex1Week3.java
		//java Ex1Week3 Sofia ulya mohd nasir*/

		/*int sum = 0;

		for (int i = 0; i<nilai.length; i++)
		{
			System.out.println("Nilai "+ nilai[i]);
			sum += Integer.parseInt(nilai[i]);
			System.out.println("Nilai sum : "+sum);
		}

		//java Ex1Week3 10 20 30 40*/
	}
}