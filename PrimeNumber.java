import java.util.Scanner;

public class Primenumber{

	static void prime()
 {

		Scanner n = new Scanner(System.in);

		int num,i,checksum=0;

		System.out.println("enter the number");

		num = n.nextInt();

		i=num-1;

		while(i!=1)

		{

			if(num%i==0)

			{

				checksum=1;

				break;

			}

			i--;

		}

		if(checksum==0)

			System.out.println(num+" is a prime number");

		else

			System.out.println(num+" is not a prime number");

	}
	
	public static void main(String[] args) {

		prime();

	}
}
