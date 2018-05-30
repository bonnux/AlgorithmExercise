public class Sort{
	public static void selectSort(int[] a){
		int temp = 0;
		int flag = 0;
		int n = a.length;
		for(int i = 0; i < n; i++){
			temp = a[i];
			flag = i;
			for(int j = i + 1; j < n; j++){
				if(a[j] < temp)
					temp = a[j];
					flag = j;
			}
		}
		if(flag != i){
			a[flag] = a[i];
			a[i] = temp;
		}
	}
}