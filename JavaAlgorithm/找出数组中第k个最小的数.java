public class FindKLeast{
	public static int quickSort(int array[], int low, int high, int k){
		int i,j;
		int tmp;
		if(low > high)
			return Integer.MIN_VALUE;
		i = low + 1;
		j = high;
		tmp = array[i];
		while(i < j){
			while(i < j && array[j] >= tmp)
				j--；
			if(i < j)
				array[i++] = array[j];
			while(i < j && array[i] < tmp)
				i++;
			if(i < j)
				array[j--] = array[i];
		}
	}
}