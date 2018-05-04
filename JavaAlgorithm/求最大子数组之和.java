public class MaxSubArr{
	public static int max(int m, int n){
		return m > n ? m : n;
	}

	public static int maxSubArray(int arr[]){
		int n = arr.length;
		//End[i-1]代表arr[0]...arr[i-1]中包含arr[i-1]的最大子数组和
		int End[] = new int[n];
		//All[i-1]代表arr[0]...arr[i-1]中的最大子数组和(arr[i-1]包不包含都行)
		int All[] = new int[n];

		End[n-1] = arr[n-1];
		All[n-1] = arr[n-1];
		End[0] = All[0] = arr[0];
		
		for (int i = 1; i < n; i++) {
			End[i] = max(End[i-1] + arr[i], arr[i]);
			All[i] = max(End[i], All[i-1]);
		}
		return All[n-1];
	}
}