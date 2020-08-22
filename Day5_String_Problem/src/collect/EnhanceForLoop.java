package collect;

public class EnhanceForLoop {

	public static void main(String[] args) {
		
		int arr[] = {4,31,67,876,898,455,8766,44};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//-------------
		
		for (int abc : arr) {
			System.out.println(abc);
		}
		
	}
}
