//"# Student Management System"

import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
		{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("=====Student Management System=====");
		System.out.println("Enter Student name: ");
		String name=sc.nextLine();
		

		System.out.println("Enter Student ID: ");
		int id=sc.nextInt();
		
		System.out.println("\n Student Info: ");
		System.out.println("name : "+name);
		System.out.println("ID: "+id);

}
}