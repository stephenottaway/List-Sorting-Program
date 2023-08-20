/* 
* CS210 Assignment 4 
* Stephen Ottaway - stephen.ottaway@bellevuecollege.edu
* Student ID: 202653895
* 2023.04.14 - Spring quarter
*
* This program instantiates a class and provides inputs to the 
* new for different test cases in the file people.txt
*/


package assignment4;

import java.util.*;
import java.io.*;

public class Assignment4_StephenOttaway {

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		People p = new People("C:\\BC class resources\\CS 210\\src\\assignment4\\people.txt");
	//	p.list("s"); // all students
		p.list("t"); // all teachers
	//	p.list("s","f", 18); // female students age>=18
	//	p.list("s","m", 20); // male students age>=20
	//	p.list("t","f", 30); // female teachers age>=30
	//	p.list("t","m", 35); // male teachers age>=35
	//	p.list("s","f", 15, 18); //female students age>=15 & age<=18
	//	p.list("s","m", 15, 20); //male students age>=15 & age<=20
	//	p.list("t","f", 30, 40); //female teachers age>=30 & age<=40
	//	p.list("t","m", 30, 40); //male teachers age>=30 and age<=40
	//	p.list("s", 20); //students age>=20
	//	p.list("t", 30); //teachers age>=30
		
	}
}
