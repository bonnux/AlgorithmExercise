bool duplicate(int numbers[],int length,int* duplication){
	if (numbers == null || length<=0)
	{
		/* code */
		return false;
	}

	for(int i=0; i<length; ++i){
		if(numbers[i]<0||numbers[i]>length-1)
			return false;
	}

	for(int i=0; i<length; ++i){
		while(numbers[i]!=i){
			if(numbers[i]==numbers[numbers[i]]){
				
			}
		}
	}
}