/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	if(n<0)
	 System.out.println("Invalid");
	else
	{
	if(n%2==0)
	 System.out.println("Even");
	else
	 System.out.println("Odd");
	}
	}
}
