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
				m.put(a[i],m.get(a[i])+1);
			}
			else{
				m.put(a[i],1);
			}
		}

		//找出出现次数最多的元素
		int most = 0;
		Iterator iter = m.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			int key = (Integer)entry.getKey();
			int val = (Integer)entry.getValue();
			if(val > most){
				result = key;
				most = val;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int array[] = {1,2,4,3,5,1,3,4,2,4,2,5};
		int maxFrequenceNum = findMostFrequentInArray(array);
		System.out.println(maxFrequenceNum);
	}
}