package program.exception.mobile;

import java.util.Scanner;

public class NearestNumber {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Input1");
		int input1=sc1.nextInt();
		System.out.println("input2");
	     int input2=sc1.nextInt(); 
		System.out.println(nearestTo100(input1,input2));

	}

	private static int nearestTo100(int input1, int input2) {
		int diff1 = Math.abs(100 - input1);
		 
        int diff2 = Math.abs(100 - input2);
 
        if(diff1 < diff2)
        {
            return input1;
        }
        else if (diff2 < diff1)
        {
            return input2;
        }
        else
        {
            return input1;
        }
		
	}

}
