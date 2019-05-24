/*
 * Object Oriented Programming Project LK01
 * Theme:
 * Game Collection
 * Team:
 * Louis Raymond (2201849535)
 * Christina Angelia (2201728004)
 * Lecturer : 
 * Livia Ashianti (D5358)
 */
package core.Games.MorseComponents;

import java.util.Scanner;

public class Main {
	private Scanner sc;
	private String encrypt="";
	public Main(String kata) {
		// TODO Auto-generated constructor stub
		sc= new Scanner (System.in);
		int i;
		for(i=0;i<kata.length();i++)
		{
			if(kata.charAt(i)=='A'||kata.charAt(i)=='a')
			{
				encrypt= encrypt+".- ";
			}
			if(kata.charAt(i)=='B'||kata.charAt(i)=='b')
			{
				encrypt= encrypt+"-... ";
			}
			if(kata.charAt(i)=='C'||kata.charAt(i)=='c')
			{
				encrypt= encrypt+"-.-. ";
			}
			if(kata.charAt(i)=='D'||kata.charAt(i)=='d')
			{
				encrypt= encrypt+"-.. ";
			}
			if(kata.charAt(i)=='E'||kata.charAt(i)=='e')
			{
				encrypt= encrypt+". ";
			}
			if(kata.charAt(i)=='F'||kata.charAt(i)=='f')
			{
				encrypt= encrypt+"..-. ";
			}
			if(kata.charAt(i)=='G'||kata.charAt(i)=='g')
			{
				encrypt= encrypt+"--. ";
			}
			if(kata.charAt(i)=='H'||kata.charAt(i)=='h')
			{
				encrypt= encrypt+".... ";
			}
			if(kata.charAt(i)=='I'||kata.charAt(i)=='i')
			{
				encrypt= encrypt+".. ";
			}
			if(kata.charAt(i)=='J'||kata.charAt(i)=='j')
			{
				encrypt= encrypt+".--- ";
			}
			if(kata.charAt(i)=='K'||kata.charAt(i)=='k')
			{
				encrypt= encrypt+"-.- ";
			}
			if(kata.charAt(i)=='L'||kata.charAt(i)=='l')
			{
				encrypt= encrypt+".-.. ";
			}
			if(kata.charAt(i)=='M'||kata.charAt(i)=='m')
			{
				encrypt= encrypt+"-- ";
			}
			if(kata.charAt(i)=='N'||kata.charAt(i)=='n')
			{
				encrypt= encrypt+"-. ";
			}
			if(kata.charAt(i)=='O'||kata.charAt(i)=='o')
			{
				encrypt= encrypt+"--- ";
			}
			if(kata.charAt(i)=='P'||kata.charAt(i)=='p')
			{
				encrypt= encrypt+".--. ";
			}
			if(kata.charAt(i)=='Q'||kata.charAt(i)=='q')
			{
				encrypt= encrypt+"--.- ";
			}
			if(kata.charAt(i)=='R'||kata.charAt(i)=='r')
			{
				encrypt= encrypt+".-. ";
			}
			if(kata.charAt(i)=='S'||kata.charAt(i)=='s')
			{
				encrypt= encrypt+"... ";
			}
			if(kata.charAt(i)=='T'||kata.charAt(i)=='t')
			{
				encrypt= encrypt+"- ";
			}
			if(kata.charAt(i)=='U'||kata.charAt(i)=='u')
			{
				encrypt= encrypt+"..- ";
			}
			if(kata.charAt(i)=='V'||kata.charAt(i)=='v')
			{
				encrypt= encrypt+"...- ";
			}
			if(kata.charAt(i)=='W'||kata.charAt(i)=='w')
			{
				encrypt= encrypt+".-- ";
			}
			if(kata.charAt(i)=='X'||kata.charAt(i)=='x')
			{
				encrypt= encrypt+"-..- ";
			}
			if(kata.charAt(i)=='Y'||kata.charAt(i)=='y')
			{
				encrypt= encrypt+"-.-- ";
			}
			if(kata.charAt(i)=='Z'||kata.charAt(i)=='z')
			{
				encrypt= encrypt+"--.. ";
			}
		}
		System.out.println(encrypt);
		sc.nextLine();
	}
}
