import java.util.Scanner;
public class NestedLoops 
{
	public static void main( String args [] )
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter an odd-number of output-lines (enter zero to exit the program): ");
		int nlines = console.nextInt();
		int nstars = nlines;
		int nblanks = 0;

			for(int ir=1; ir<=.5*nlines+1; ir++)
			{
				for(int ib=1; ib<=nblanks; ib++)
				{
					System.out.print(" ");	
				}
				for(int ic=1; ic<=nstars; ic++)
				{
					System.out.print("*");
				}
				nblanks++;
				nstars-=2;
				System.out.println();
		}
			
		nstars = 3;
		nblanks = nlines/2 - 1;
			for(int ir=1; ir<=.5*nlines; ir++)
			{
				for(int ib=1; ib<=nblanks; ib++)
				{
					System.out.print(" ");	
				}
				for(int ic=1; ic<=nstars; ic++)
				{
					System.out.print("*");
				}
				nblanks--;
				nstars+=2;
				System.out.println();
		}
	}	
}
