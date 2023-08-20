/* 
* CS210 Assignment 4 
* Stephen Ottaway - stephen.ottaway@bellevuecollege.edu
* Student ID: 202653895
* 2023.04.14 - Spring quarter
*
* This class People creates an arraylist from people.txt and uses
* method overloading to print out lists of names meeting different criteria
* such as comparisons with ages, occupations, and gender.
*/



package assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class People 
{
	
	
	

	static ArrayList<PersonInfo> list = new ArrayList<>();
	
	
	
	public People(String file) throws FileNotFoundException
	{

		Scanner scanner = new Scanner(new File(file));
		
		while(scanner.hasNext()) {
			
			PersonInfo p = new PersonInfo();
			
			p.type=scanner.next();
			p.name = scanner.next();
			p.gender = scanner.next();
			p.age = scanner.nextInt();
			list.add(p);
			
		}	

		
			
	}
		
		 void list(String occupation) {
			System.out.println("List of people");
			System.out.println("Type: " + occupation);
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).type.equals(occupation)) {
					System.out.println(list.get(i).name);
				}
			}
			System.out.println();
	}
		
		public void list(String occupation, String MorF, int howOld) 
		{
			System.out.println("List of people");
			System.out.println("Type: " + occupation + "\nGender: " + MorF + "\nAge: >= " + howOld);
			for(int j=0; j<list.size(); j++) {
				if(list.get(j).type.equals(occupation) && list.get(j).gender.equals(MorF) && list.get(j).age >= howOld)
				{

					System.out.println(list.get(j).name);
				}
			}
			System.out.println();
		}
		
		public void list(String occupation, String MorF, int age1, int age2) {
			System.out.println("List of people:");
			System.out.println("Type: " + occupation + "\nGender: " + MorF + "\n" + age1 + " <= Age <= " + age2);
			
			for(int k=0; k<list.size(); k++) {
				if(list.get(k).type.equals(occupation) && list.get(k).gender.equals(MorF) && list.get(k).age >= age1 && list.get(k).age <= age2)
				{

					System.out.println(list.get(k).name);
				}
			}
			System.out.println();
		}
		
		public void list(String occupation, int age3) {
			System.out.println("List of people: ");
			System.out.println("Type: " + occupation + " \nAge >= " + age3);
			
			for(int n=0; n<list.size(); n++) {
				if(list.get(n).type.equals(occupation) && list.get(n).age >= age3)
				{
					System.out.println(list.get(n).name);
				}
				
			}
			System.out.println();
		}
		
		
		



	


	
}
