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
			//������switch�Ĳ�break�Ļ�����ִ�С��������̿��ƣ��ӵ�������ʼ������Ĳ�ִ�У���ִ�е�һ�ڶ�����֪����һ��break
				
			}
			
		}
		{
			int a = 0;
			int bb = 0;
			A:while(true) { //ָ��break
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
