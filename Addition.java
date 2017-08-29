import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class Addition {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Addition is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	

	 static int add(int a,int b)
//static used to prepare a field,method or inner classes as a class field.	 
//int data type is the primary integer data type 
//we are declaring the variables by taking static
	 {
		 int c;
//int data type is the primary integer data type

		 while(b!=0)
//while loop statement in java programming language repeatedly executes a target statement as 
//long as given condition is true
//!= checks if the values of two operands are equal or not
//b is not equal to zero it will execute loop till the condition get false.
			 
		 {
			 c=a&b;
//we are using operators to add
			 
			 a=a^b;
			 b=c<<1;
		 }
		 return a;//return value a
	 }
	 public static void main(String[] args)
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//String[] args is actually an array of java.lang.String type and it's name is args here

	 {
		 Scanner sc=new Scanner(System.in);
		 //to scan values which we initialize
		 System.out.println("Enter the values of a,b:\n");
		 //System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class
		//Inside the brackets is value which to be printed		
		 int a=sc.nextInt();//scans next token of the input as int
		 int b=sc.nextInt();
		 
		 System.out.println("Sum of the number:"+add(a,b));
	 }
	}


