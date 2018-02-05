import java.util.Arrays;
public class dome3 {
	public static void main(String[] args) {
		int arr[] = new int[4];
		int arr2[] = new int[]{1,2};
		int arr3[] = {1,2,3};
		int arr4[] = Arrays.copyOf(arr3, 5);
		int arr5[] = Arrays.copyOfRange(arr4, 2, 5);
		arr[1] = 0;arr[2]=1;
		for(int item:arr5) {
			System.out.print(item); //默认为0//int
		}
		
		int arrs[][] = new int[2][2];
		int arrs1[][] = new int[2][];
		arrs1[0] = new int[20];
		arrs1[1] = new int[4];
		
		//三维数组类推/
		
		
	}
}
