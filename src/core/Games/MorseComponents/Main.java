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
import java.util.Vector;


public class Main {
	private Scanner sc;
	private String kata="";
	private String encrypt="";
	private String decrypt;
	
	int count=0;

	Vector<Encrypt> ven= new Vector<>();

	public void encrypt()
	{
		do
		{
			System.out.println("Insert String[1-100 character(s)]: ");
			kata = sc.nextLine();
			sc.nextLine();
			Encrypt en = new Encrypt(kata);
			ven.add(new Encrypt(kata));
		}while(kata.length()<1||kata.length()>100);
		
		
		for(int i=0;i<kata.length();i++)
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
			if(kata.charAt(i)=='1')
			{
				encrypt= encrypt+".---- ";
			}
			if(kata.charAt(i)=='2')
			{
				encrypt= encrypt+"..--- ";
			}
			if(kata.charAt(i)=='3')
			{
				encrypt= encrypt+"...-- ";
			}
			if(kata.charAt(i)=='4')
			{
				encrypt= encrypt+"....- ";
			}
			if(kata.charAt(i)=='5')
			{
				encrypt= encrypt+"..... ";
			}
			if(kata.charAt(i)=='6')
			{
				encrypt= encrypt+"-.... ";
			}
			if(kata.charAt(i)=='7')
			{
				encrypt= encrypt+"--... ";
			}
			if(kata.charAt(i)=='8')
			{
				encrypt= encrypt+"---.. ";
			}
			if(kata.charAt(i)=='9')
			{
				encrypt= encrypt+"----. ";
			}
			if(kata.charAt(i)=='0')
			{
				encrypt= encrypt+"----- ";
			}
			if(kata.charAt(i)==' ')
			{
				encrypt= encrypt+" ";
			}
		}
		System.out.println(encrypt);
		sc.nextLine();
	}
	
	
	public void decrypt()
	{
		System.out.println("Insert String [please separate each character with 1 space and space with 2 spaces]:  ");
		kata=sc.nextLine();
		for(int i=0;i<=kata.length();i=count)
		{
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='-')
			{
				count =count+3;
				decrypt=decrypt+"A";
				
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='.')
			{
				count =count+5;
				decrypt=decrypt+"B";
				
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.'&&kata.charAt(i)=='-'&&kata.charAt(i+1)=='.')
			{
				count=count+5;
				decrypt=decrypt+"C";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.')
			{
				count=count+4;
				decrypt=decrypt +"D";
			}
			if(kata.charAt(i)=='.')
			{
				count=count+2;
				decrypt=decrypt+"E";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='-'&&kata.charAt(i+3)=='.')
			{
				count=count+5;
				decrypt = decrypt +"F";
				
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='.')
			{
				count =count +4;
				decrypt =decrypt+"G";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='.')
			{
				count=count+4;
				decrypt=decrypt+"H";
			}
			if(kata.charAt(i)=='.'&& kata.charAt(i+1)=='.')
			{
				count =count+3;
				decrypt=decrypt+"I";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='-'&&kata.charAt(i+3)=='-')
			{
				count=count +5;
				decrypt=decrypt+"J";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='-')
			{
				count=count +4;
				decrypt =decrypt+"K";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='.')
			{
				count=count+5;
				decrypt=decrypt+"L";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='-')
			{
				count =count+3;
				decrypt =decrypt+"M";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.')
			{
				count =count +3;
				decrypt =decrypt+"N";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='-')
			{
				count =count +4;
				decrypt =decrypt +"O";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='-'&&kata.charAt(i)=='.')
			{
				count =count+5;
				decrypt=decrypt+"P";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='-')
			{
				count =count+5;
				decrypt =decrypt+"Q";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='.')
			{
				count =count +4;
				decrypt =decrypt+"R";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.')
			{
				count=count+4;
				decrypt=decrypt+"S";
			}
			if(kata.charAt(i)=='-')
			{
				count=count+2;
				decrypt=decrypt+"T";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='-')
			{
				count =count +4;
				decrypt=decrypt+"U";
			}
			if(kata.charAt(i)=='.'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='-')
			{
				count =count+5;
				decrypt =decrypt+"V";
			}
			if (kata.charAt(i)=='.'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='-')
			{
				count =count+4;
				decrypt=decrypt+"W";
			}
			if(kata.charAt(i)=='-'&&kata.charAt(i+1)=='.'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='-')
			{
				count=count+5;
				decrypt=decrypt+"Y";
			}
			if (kata.charAt(i)=='-'&&kata.charAt(i+1)=='-'&&kata.charAt(i+2)=='.'&&kata.charAt(i+3)=='.')
			{
				count =count +5;
				decrypt=decrypt+"Z";
				
			}
		}
		System.out.println(decrypt);
		sc.nextLine();
		
	}
	
	
	
	public Main(int choose) {
		// TODO Auto-generated constructor stub
		sc= new Scanner (System.in);
		
		switch (choose)
		{
		
			case 1:
		
				encrypt();
				break;
			case 2:
			
				decrypt();
				break;
		}
	}
}
