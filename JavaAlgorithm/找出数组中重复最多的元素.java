import java.util.*;
public class MostFrequent{
	public static int findMostFrequentInArray(int[] a){
		int result = 0;
		int size = a.length;
		if(size == 0)
			return Integer.MAX_VALUE;

		//记录每个元素出现的次数
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (m.containsKey(a[i])) {
				m.put(a[i],m.get(a[i]+1));
			}
			else{
				m.put(a[i],1);
			}
		}

		//找出出现次数最多的元素
		int most = 0;
	}
}