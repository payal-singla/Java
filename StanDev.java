
import java.util.Scanner;

public class StanDev{

	static void StandardDev()
 {

		int num, sum = 0,i;

		Scanner newObj = new Scanner(System.in);

		System.out.println("enter length of array");

		num = newObj.nextInt();

		int arr[] = new int[num];


		System.out.println("enter values in array");

		for(i=0;i<num;i++)

		{

			arr[i] = newObj.nextInt();

			sum = sum + arr[i];

		}

		double mean = 0.0, x = 0.0, sd = 0.0;

		mean = sum/num;

		for(i=0;i<num;i++)

			x+=Math.pow(arr[i]-mean,2);

		sd = Math.sqrt(x/num);

		System.out.println("Standard Deviation = "+sd);

	}

	public static void main(String[] args) {

		
		StandardDev();
	
}
}

