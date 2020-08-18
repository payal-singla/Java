import java.util.Scanner;

public class Table{

	static void table() 
{
		Scanner n = new Scanner(System.in);

		int num,i,x;

		System.out.println("enter the number");

		num = n.nextInt();

		for(i=1;i<=10;i++)

		{

			x=num*i;

			System.out.println(num+"*"+i+"="+x);

		}
	
}

	public static void main(String[] args) {

			table();
	
}
	

}

