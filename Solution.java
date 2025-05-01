import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int i = 0; i < cases; i++){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    int e = scan.nextInt();
		    
		    boolean possible = (a + b <= d && c <= e) || (b + c <= d && a <= e) || (a + c <= d && b <= e);
		    
		    if(possible){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
