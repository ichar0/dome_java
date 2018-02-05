import java.util.Scanner;

public class dome2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = scan.nextInt();
		if(year%4 == 0 && year%100!=0 || year % 400 == 0)
		{
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		
		{
			int a  = 0 ;
			System.out.print( a);
			switch(a) {
			case 0 :
				System.out.print(a);
//				break;
			case 1 :
				System.out.print(a);
				break;
			//可利用switch的不break的话继续执行。进行流程控制，从第三步开始，后面的不执行，在执行第一第二步，知道第一步break
				
			}
			
		}
		{
			int a = 0;
			int bb = 0;
			A:while(true) { //指定break
				a ++;
				B:while(true) {
					bb++;
					if(bb>3) {
						break B;
					}
					if(a>3) {
						break A;
					}
				}
				
				
			}
			
			
		}
		int arry[] = {7,8,9,10};
		for(int item : arry) {
			System.out.print(item);
			if(item == 9)
				continue;
		}
	}
}
