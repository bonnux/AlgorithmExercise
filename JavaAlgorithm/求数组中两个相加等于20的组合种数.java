import java.util.Arrays;
public class FindTwoSum{
	public static void findSum(int[] a, int sum){
		Arrays.sort(a);
		int begin = 0;
		int end = a.length - 1;
		while(begin < end){
			if(a[begin] + a[end] < sum)
				begin++;
			else if(a[begin] + a[end] > sum)
				end--;
			else{
				System.out.println(a[begin] + " " + a[end]);
				begin++;
				end--;
			}
		}
	}
	public static void main(String[] args) {
		int array[] = {1,7,2,4,5,2,10,14,3};
		findSum(array,20);
	}
}