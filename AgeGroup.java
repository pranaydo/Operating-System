// Write a Java program to get the age of a person and find the age group of that 

import java.util.Scanner;
class AgeGroup{
public static void main(String[] args)
{
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age ");

	age = sc.nextInt();

	if (age>0 && age <= 3) 
		System.out.println("They are Toddlers ");
	else if(age >=4 && age <=8)
		System.out.println("They are Kids ");
	else if(age>=9 && age<=12)
		System.out.println("They are Childs ");
	else if(age >=13 && age<=18)
		System.out.println("They are Teens ");
	else if (age>=19 && age<=40) 
		System.out.println("They are  Adults ");
	else if( age>=41 && age<=60)
		System.out.println("They are Matured Adults ");
	else if(age>=61 && age<=75)
		System.out.println("They are Seniors ");
	else if(age>76)
		System.out.println("They are Super Seniors ");
		
	

}
}