public class FindOnlyOne{
	public static int find(int a[]){
		int n = a.length;
		int res = a[0];
		for (int i = 1; i < n; ++i) {
			res ^= a[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int array[] = [1,2,3,2,4,6,1,4];
		int num = find(array);
		System.out.printlin(num);
	}
}