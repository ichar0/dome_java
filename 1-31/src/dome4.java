
public class dome4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Anything fun1 = new Anything();
		Anything fun = new Anything();
		//System.out.print(fun.make(0, "name"));
		//fun.name = "name1";
		//System.out.println(fun.getName());
		int arry[] = {9,5,4,8,0,7};
		int tmp ;
//		for(int i=1;i<arry.length;i++) {
//			int j;
//			tmp = arry[i];
//			for( j = i-1;j>=0 && arry[j] > tmp;j--) {
//				arry[j+1] = arry[j];
//			}
//			arry[j+1] = tmp;
//		}
		for(int i=0;i<arry.length;i++) {
			System.out.print(arry[i]);
			//
		}
		System.out.println();
		{
			for(int i=0;i<arry.length;i++) {
				boolean falg = false;
				for(int j=0;j<arry.length-1;j++) {
					if(arry[j] >arry[j+1])
					{
						int c = arry[j+1];
						arry[j+1] = arry[j];
						arry[j] = c;
						falg = true;
					}
				}
				if(!falg) {
					break;
				}
				for(int h=0;h<arry.length;h++) {
					System.out.print(arry[h]);
					
				}
				System.out.println();
			}
		}
	}
}
