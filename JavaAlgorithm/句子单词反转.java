public class SentenceReverse{
	public void swap(char[] ch, int front, int end){
		while(front < end){
			char temp = ch[end];
			ch[end] = ch[front];
			ch[front] = temp;
			front++;
			end--;
		}
	}

	
}